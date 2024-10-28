package backend;

import java.util.ArrayList;

public class ListaTreinadores {
    private ArrayList<Treinador> treinadores;

    public ListaTreinadores() {
        this.treinadores = new ArrayList<>();
    }

    public boolean adicionarTreinador(Treinador treinador) {
        for (Treinador t : treinadores) {
            if (t.getEmail().equalsIgnoreCase(treinador.getEmail())) {
                return false;
            }
        }
        treinadores.add(treinador);
        return true;
    }


    public Treinador getTreinadorPorId(int id) {
        for (Treinador treinador : treinadores) {
            if (treinador.getId() == id) {
                return treinador;
            }
        }
        return null; // Retorna null se não encontrar o treinador
    }

    public void removerTreinador(int id) {
        treinadores.removeIf(treinador -> treinador.getId() == id);
    }

    // Métodos específicos para Treinador (ex: buscar por nome, etc.)
}

