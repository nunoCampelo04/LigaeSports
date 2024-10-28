package backend;

import java.util.ArrayList;

public class ListaEquipas {
    private ArrayList<Equipa> equipas;

    public ListaEquipas() {
        this.equipas = new ArrayList<>();
    }

    public boolean adicionarEquipa(Equipa equipa) {
        for (Equipa e : equipas) {
            if (e.getNome().equalsIgnoreCase(equipa.getNome())) {
                return false;
            }
        }
        equipas.add(equipa);
        return true;
    }


    public Equipa getEquipaPorId(int id) {
        for (Equipa equipa : equipas) {
            if (equipa.getId() == id) {
                return equipa;
            }
        }
        return null;
    }

    public void removerEquipa(int id) {
        equipas.removeIf(equipa -> equipa.getId() == id);
    }

    // Métodos específicos para Equipa, como ordenação por vitórias, etc.
}

