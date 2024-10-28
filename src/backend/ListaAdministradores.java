package backend;

import java.util.ArrayList;

public class ListaAdministradores {
    private ArrayList<Administrador> administradores;

    public ListaAdministradores() {
        this.administradores = new ArrayList<>();
    }

    public boolean adicionarAdministrador(Administrador administrador) {
        for (Administrador a : administradores) { //
            if (a.getEmail().equalsIgnoreCase(administrador.getEmail())) {
                return false;
            }
        }
        administradores.add(administrador);
        return true;
    }


    public Administrador getAdministradorPorId(int id) {
        for (Administrador administrador : administradores) {
            if (administrador.getId() == id) {
                return administrador;
            }
        }
        return null; // Retorna null se não encontrar o administrador
    }

    public void removerAdministrador(int id) {
        administradores.removeIf(administrador -> administrador.getId() == id);
    }

    // Métodos específicos para Administrador (ex: verificar permissões, etc.)
}

