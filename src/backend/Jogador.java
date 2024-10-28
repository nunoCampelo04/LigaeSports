package backend;

public class Jogador {
    private static int contadorID = 1;
    private int id;
    private String password;
    private String nomeCompleto;
    private String nickname;
    private int partidasJogadas;
    private int vitorias;
    private int derrotas;

    public Jogador(String nomeCompleto, String nickname, String password) {
        this.id = contadorID++;
        this.nomeCompleto = nomeCompleto;
        this.password=password;
        this.nickname = nickname;
        this.partidasJogadas = 0;
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Jogador.contadorID = contadorID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
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

    public boolean autenticar(String password) {
        return this.password.equals(password);
    }
}
