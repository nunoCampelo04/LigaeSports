package backend;

import java.util.ArrayList;

public class ListaJogadores {
    private ArrayList<Jogador> jogadores;

    public ListaJogadores() {
        this.jogadores = new ArrayList<>();
    }

    public boolean loginJogador(String nickname, String password) {
        for (Jogador j : jogadores) {
            if (j.getNickname().equals(nickname)) {
                return j.autenticar(password);
            }
        }
        return false;
    }

    public boolean adicionarJogador(Jogador jogador) {

        for (Jogador j : jogadores) {
            if (j.getNickname().equalsIgnoreCase(jogador.getNickname())) {
                return false;
            }
        }
        jogadores.add(jogador);
        return true;
    }

    public Jogador getJogadorPorId(int id) {
        for (Jogador jogador : jogadores) {
            if (jogador.getId() == id) {
                return jogador;
            }
        }
        return null;
    }

    public void removerJogador(int id) {
        jogadores.removeIf(jogador -> jogador.getId() == id);
    }

    public String visualizarDadosJogador(int id) {
        Jogador jogador = getJogadorPorId(id);
        return String.format("ID: %d%nNome: %s%nNickname: %s%nPassword:  %s",jogador.getId(),jogador.getNomeCompleto(),jogador.getNickname(),
                jogador.getPassword());
    }

    public boolean editarDadosJogador(int id, String novoNomeCompleto, String novoNickname, String novaSenha) {
        Jogador jogador = getJogadorPorId(id);
        if (jogador != null) {
            if (novoNomeCompleto != null && !novoNomeCompleto.isEmpty()) {
                jogador.setNomeCompleto(novoNomeCompleto);
            }
            if (novoNickname != null && !novoNickname.isEmpty()) {
                for (Jogador j : jogadores) {
                    if (j.getNickname().equalsIgnoreCase(novoNickname) && j.getId() != id) {
                        return false;
                    }
                }
                jogador.setNickname(novoNickname);
            }
            if (novaSenha != null && !novaSenha.isEmpty()) {
                jogador.setPassword(novaSenha);
            }
            return true; // Edição realizada com sucesso
        }
        return false; // Jogador não encontrado
    }



    public String exibirEstatisticasJogador(int id) {
        Jogador jogador = getJogadorPorId(id);
        if (jogador == null) {
            return "Jogador não encontrado.";
        }

        // Verifica o tipo do jogador e chama o método apropriado
        return switch (jogador) {
            case JogadorEFootball jogadorEFootball -> exibirEstatisticasEFootball(jogadorEFootball);
            case JogadorFPS jogadorFPS -> exibirEstatisticasFPS(jogadorFPS);
            case JogadorMOBA jogadorMOBA -> exibirEstatisticasMOBA(jogadorMOBA);
            default -> "Tipo de jogador desconhecido.";
        };
    }


    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public String exibirEstatisticasEFootball(JogadorEFootball jogador) {
        return String.format("ID: %d%nNome: %s%nNickname: %s%nPosição: %s%nGolos Marcados: %d%nAssistências: %d%n",
                jogador.getId(), jogador.getNomeCompleto(), jogador.getNickname(),
                jogador.getPosicaoPrincipal(), jogador.getGolosMarcados(), jogador.getAssistencias());
    }


    public String exibirEstatisticasFPS(JogadorFPS jogador) {
        return String.format("ID: %d%nNome: %s%nNickname: %s%nPrecisão: %.2f%nHeadshots: %d%n",
                jogador.getId(), jogador.getNomeCompleto(), jogador.getNickname(),
                jogador.getPrecisao(), jogador.getHeadshots());
    }


    public String exibirEstatisticasMOBA(JogadorMOBA jogador) {
        return String.format("ID: %d%nNome: %s%nNickname: %s%nPersonagem Principal: %s%nAbates: %d%nMortes: %d%nAssistências: %d%n",
                jogador.getId(), jogador.getNomeCompleto(), jogador.getNickname(),
                jogador.getPersonagemPrincipal(), jogador.getAbates(), jogador.getMortes(), jogador.getAssistencias());
    }
}

