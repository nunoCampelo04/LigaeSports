package backend;

import java.util.ArrayList;

public class Torneio {
    private static int contadorID = 1;
    private int id;
    private String nome;
    private String jogo;
    private ArrayList<Equipa> equipasParticipantes;
    private ArrayList<Partida> partidas;
    private TabelaClassificacao tabelaClassificacao;

    public Torneio(String nome, String jogo) {
        this.id = contadorID++;
        this.nome = nome;
        this.jogo = jogo;
        this.equipasParticipantes = new ArrayList<>();
        this.partidas = new ArrayList<>();
        this.tabelaClassificacao = new TabelaClassificacao();
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Torneio.contadorID = contadorID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public ArrayList<Equipa> getEquipasParticipantes() {
        return equipasParticipantes;
    }

    public void setEquipasParticipantes(ArrayList<Equipa> equipasParticipantes) {
        this.equipasParticipantes = equipasParticipantes;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public TabelaClassificacao getTabelaClassificacao() {
        return tabelaClassificacao;
    }

    public void setTabelaClassificacao(TabelaClassificacao tabelaClassificacao) {
        this.tabelaClassificacao = tabelaClassificacao;
    }
// Métodos para gerenciar equipes e partidas
}

