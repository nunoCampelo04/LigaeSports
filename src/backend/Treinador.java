package backend;

public class Treinador {
    private static int contadorID = 1;
    private int id;
    private String nomeCompleto;
    private String email;
    private Equipa equipa;

    public Treinador(String nomeCompleto, String email, Equipa equipa) {
        this.id = contadorID++;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.equipa = equipa;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Treinador.contadorID = contadorID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Equipa getEquipa() {
        return equipa;
    }

    public void setEquipa(Equipa equipa) {
        this.equipa = equipa;
    }
    // Métodos para gerenciar a equipa
}

