package frontend;

import backend.*;

public class FrontendJogadores {
    private final Consola consola;
    private final ListaJogadores listaJogadores;
    private final ListaTorneios listaTorneios;
    private Jogador jogadorLogado; // Variável para armazenar o jogador logado

    public FrontendJogadores(ListaJogadores listaJogadores,ListaTorneios listaTorneios) {
        this.consola = new Consola();
        this.listaJogadores = listaJogadores;
        this.listaTorneios= listaTorneios;
    }

    public void iniciar() {
        while (true) {
            if (jogadorLogado == null) {
                // Se não houver jogador logado, mostrar opções de login ou criação de conta
                int opcao = mostrarMenuInicial();
                processarOpcaoInicial(opcao);
            } else {
                // Menu de opções para jogador logado
                int opcao = mostrarMenuJogadorLogado();
                processarOpcao(opcao);
            }
        }
    }

    private int mostrarMenuInicial() {
        String[] opcoes = {
                "Login",
                "Criar Conta",
                "Sair"
        };
        return consola.lerInteiroOpcoes(opcoes);
    }

    private void processarOpcaoInicial(int opcao) {
        switch (opcao) {
            case 1 -> fazerLogin();
            case 2 -> criarConta();
            case 3 -> {
                consola.escrever("A sair...");
                System.exit(0); // Sair do programa
            }
            default -> consola.escreverErro("Opção inválida.");
        }
    }

    private void fazerLogin() {
        String nickname = consola.lerString("Introduza o seu nickname:");
        String password = consola.lerString("Introduza a sua password:");

        if (listaJogadores.loginJogador(nickname, password)) {
            jogadorLogado = listaJogadores.getJogadorPorId(findJogadorIdByNickname(nickname));
            consola.escrever("Login bem-sucedido! Bem-vindo " + jogadorLogado.getNomeCompleto() + ".");
        } else {
            consola.escreverErro("Login falhado. Tente novamente.");
        }
    }

    private void criarConta() {
        String nomeCompleto = consola.lerString("Introduza o seu nome completo:");
        String nickname = consola.lerString("Introduza um nickname:");
        String password = consola.lerString("Introduza uma password:");

        int tipoJogador = consola.lerInteiro("Selecione o tipo de jogador:\n1 - eFootball\n2 - FPS\n3 - MOBA");

        Jogador novoJogador;

        // Instanciar o tipo de jogador baseado na seleção
        switch (tipoJogador) {
            case 1 -> {
                String posicao = consola.lerString("Introduza a posição no eFootball:");
                novoJogador = new JogadorEFootball(nomeCompleto, nickname,posicao,password);
            }
            case 2 -> novoJogador = new JogadorFPS(nomeCompleto, nickname, password);
            case 3 -> {
                String personagemPrincipal = consola.lerString("Introduza o nome da personagem principal no MOBA:");
                novoJogador = new JogadorMOBA(nomeCompleto, nickname, personagemPrincipal,password);
            }
            default -> {
                consola.escreverErro("Tipo de jogador inválido.");
                return;
            }
        }

        if (listaJogadores.adicionarJogador(novoJogador)) {
            consola.escrever("Conta criada com sucesso! Agora pode fazer login.");
        } else {
            consola.escreverErro("Nickname já em uso. Tente outro.");
        }
    }

    private int findJogadorIdByNickname(String nickname) {
        for (Jogador j : listaJogadores.getJogadores()) {
            if (j.getNickname().equalsIgnoreCase(nickname)) {
                return j.getId();
            }
        }
        return -1; // Não encontrado
    }

    private int mostrarMenuJogadorLogado() {
        String[] opcoes = {
                "Visualizar dados",
                "Editar dados",
                "Remover conta",
                "Exibir Estatísticas pessoais",
                "Visualizar torneios em que participa",
                "Sair"
        };
        return consola.lerInteiroOpcoes(opcoes);
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> visualizarDados();
            case 2 -> editarDados();
            case 3 -> removerConta();
            case 4 -> exibirEstatisticas();
            case 5 -> visualizarTorneios();
            case 6 -> {
                consola.escrever("A sair...");
                jogadorLogado = null; // Logout
            }
            default -> consola.escreverErro("Opção inválida.");
        }
    }

    private void visualizarDados() {
        consola.escrever(listaJogadores.visualizarDadosJogador(jogadorLogado.getId()));
    }

    private void editarDados() {
        String novoNomeCompleto = consola.lerString("Introduza o novo nome completo (deixe vazio para não alterar):");
        String novoNickname = consola.lerString("Introduza o novo nickname (deixe vazio para não alterar):");
        String novaSenha = consola.lerString("Introduza a nova password (deixe vazio para não alterar):");

        if (listaJogadores.editarDadosJogador(jogadorLogado.getId(), novoNomeCompleto, novoNickname, novaSenha)) {
            consola.escrever("Dados editados com sucesso!");
        } else {
            consola.escreverErro("Erro ao editar dados. O nickname já pode estar em uso.");
        }
    }

    private void removerConta() {
        listaJogadores.removerJogador(jogadorLogado.getId());
        consola.escrever("Conta removida com sucesso.");
        jogadorLogado = null; // Logout após remoção
    }

    private void visualizarTorneios(){
        consola.escrever(listaTorneios.listarTorneiosPorJogador(jogadorLogado.getId()));
    }

    private void exibirEstatisticas(){
        consola.escrever(listaJogadores.exibirEstatisticasJogador(jogadorLogado.getId()));
    }
}
