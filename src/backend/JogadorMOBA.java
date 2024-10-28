package backend;

public class JogadorMOBA extends Jogador {
    private String personagemPrincipal;
    private int abates;
    private int mortes;
    private int assistencias;

    public JogadorMOBA(String nomeCompleto, String nickname, String personagemPrincipal,String password) {
        super(nomeCompleto, nickname,password);
        this.personagemPrincipal = personagemPrincipal;
        this.abates = 0;
        this.mortes = 0;
        this.assistencias = 0;
    }

    public String getPersonagemPrincipal() {
        return personagemPrincipal;
    }

    public void setPersonagemPrincipal(String personagemPrincipal) {
        this.personagemPrincipal = personagemPrincipal;
    }

    public int getAbates() {
        return abates;
    }

    public void setAbates(int abates) {
        this.abates = abates;
    }

    public int getMortes() {
        return mortes;
    }

    public void setMortes(int mortes) {
        this.mortes = mortes;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    // Métodos específicos para JogadorMOBA
}

