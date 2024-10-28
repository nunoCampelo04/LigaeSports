package backend;

import java.util.ArrayList;

public class ListaTorneios {
    private ArrayList<Torneio> torneios;

    public ListaTorneios() {
        this.torneios = new ArrayList<>();
    }

    public boolean adicionarTorneio(Torneio torneio) {
        for (Torneio t : torneios) {
            if (t.getNome().equalsIgnoreCase(torneio.getNome())) {
                return false;
            }
        }
        torneios.add(torneio);
        return true;
    }


    public Torneio getTorneioPorId(int id) {
        for (Torneio torneio : torneios) {
            if (torneio.getId() == id) {
                return torneio;
            }
        }
        return null;
    }

    public void removerTorneio(int id) {
        torneios.removeIf(torneio -> torneio.getId() == id);
    }

    // Método para listar torneios por jogador
    public StringBuilder listarTorneiosPorJogador(int jogadorId) {
        ArrayList<Torneio> torneiosDoJogador = new ArrayList<>();

        for (Torneio torneio : torneios) {
            for (Equipa equipa : torneio.getEquipasParticipantes()) {

                for (Jogador jogador : equipa.getJogadores()) {
                    if (jogador.getId() == jogadorId) {
                        torneiosDoJogador.add(torneio);
                        break;
                    }
                }
            }
        }
       StringBuilder torneios_jogador = new StringBuilder();
        for(Torneio torneio:torneiosDoJogador){
            torneios_jogador.append(torneio.getNome());
        }
    return torneios_jogador;
    }

}

