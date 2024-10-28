package backend;

public class Administrador {
    private static int contadorID = 1;
    private int id;
    private String nomeCompleto;
    private String email;

    public Administrador(String nomeCompleto, String email) {
        this.id = contadorID++;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Administrador.contadorID = contadorID;
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
// Métodos para criar e gerenciar torneios e partidas
}

