package backend;

public class JogadorFPS extends Jogador {
    private double precisao;
    private int headshots;

    public JogadorFPS(String nomeCompleto, String nickname,String password) {
        super(nomeCompleto, nickname,password);
        this.precisao = 0.0;
        this.headshots = 0;
    }

    public double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    public int getHeadshots() {
        return headshots;
    }

    public void setHeadshots(int headshots) {
        this.headshots = headshots;
    }

    // Métodos específicos para JogadorFPS
}
