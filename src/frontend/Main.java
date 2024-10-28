package frontend;

import backend.ListaJogadores;
import backend.ListaTorneios;
import frontend.FrontendJogadores;

public class Main {
    public static void main(String[] args) {
        ListaJogadores listaJogadores = new ListaJogadores();
        ListaTorneios listaTorneios = new ListaTorneios();
        FrontendJogadores frontend = new FrontendJogadores(listaJogadores,listaTorneios);
        frontend.iniciar();
    }
}
