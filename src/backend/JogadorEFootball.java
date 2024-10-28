package backend;

public class JogadorEFootball extends Jogador {
    private String posicaoPrincipal;
    private int golosMarcados;
    private int assistencias;

    public JogadorEFootball(String nomeCompleto, String nickname, String posicaoPrincipal,String password) {
        super(nomeCompleto, nickname,password);
        this.posicaoPrincipal = posicaoPrincipal;
        this.golosMarcados = 0;
        this.assistencias = 0;
    }

    public String getPosicaoPrincipal() {
        return posicaoPrincipal;
    }

    public void setPosicaoPrincipal(String posicaoPrincipal) {
        this.posicaoPrincipal = posicaoPrincipal;
    }

    public int getGolosMarcados() {
        return golosMarcados;
    }

    public void setGolosMarcados(int golosMarcados) {
        this.golosMarcados = golosMarcados;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    // Métodos específicos para JogadorEFootball
}
