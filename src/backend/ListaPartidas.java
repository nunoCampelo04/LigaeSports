package backend;

import java.util.ArrayList;

public class ListaPartidas {
    private ArrayList<Partida> partidas;

    public ListaPartidas() {
        this.partidas = new ArrayList<>();
    }

    public boolean adicionarPartida(Partida partida) {
        for (Partida p : partidas) {
            if (p.getEquipaA().getNome().equalsIgnoreCase(partida.getEquipaA().getNome()) &&
                    p.getEquipaB().getNome().equalsIgnoreCase(partida.getEquipaB().getNome()) &&
                    p.getData().equals(partida.getData())) {
                return false;
            }
        }
        partidas.add(partida);
        return true;
    }

    public Partida getPartidaPorId(int id) {
        for (Partida partida : partidas) {
            if (partida.getId() == id) {
                return partida;
            }
        }
        return null; // Retorna null se não encontrar a partida
    }

    public void removerPartida(int id) {
        partidas.removeIf(partida -> partida.getId() == id);
    }

    // Métodos específicos para Partida (ex: buscar por data, etc.)
}
