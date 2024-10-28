package backend;

import java.util.ArrayList;

public class Equipa {
    private static int contadorID = 1;
    private int id;
    private String nome;
    private ArrayList<Jogador> jogadores;
    private int vitorias;
    private int derrotas;

    public Equipa(String nome) {
        this.id = contadorID++;
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Equipa.contadorID = contadorID;
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

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    // Métodos para adicionar, remover e gerenciar jogadores
    // Métodos para atualizar vitórias e derrotas
}
