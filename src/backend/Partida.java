package backend;

import java.time.LocalDate;

public class Partida {
    private static int contadorID = 1;
    private int id;
    private Equipa equipaA;
    private Equipa equipaB;
    private int pontosEquipaA;
    private int pontosEquipaB;
    private LocalDate data;

    public Partida(Equipa equipaA, Equipa equipaB, int pontosEquipaA, int pontosEquipaB, LocalDate data) {
        this.id = contadorID++;
        this.equipaA = equipaA;
        this.equipaB = equipaB;
        this.pontosEquipaA = pontosEquipaA;
        this.pontosEquipaB = pontosEquipaB;
        this.data = data;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Partida.contadorID = contadorID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipa getEquipaA() {
        return equipaA;
    }

    public void setEquipaA(Equipa equipaA) {
        this.equipaA = equipaA;
    }

    public Equipa getEquipaB() {
        return equipaB;
    }

    public void setEquipaB(Equipa equipaB) {
        this.equipaB = equipaB;
    }

    public int getPontosEquipaA() {
        return pontosEquipaA;
    }

    public void setPontosEquipaA(int pontosEquipaA) {
        this.pontosEquipaA = pontosEquipaA;
    }

    public int getPontosEquipaB() {
        return pontosEquipaB;
    }

    public void setPontosEquipaB(int pontosEquipaB) {
        this.pontosEquipaB = pontosEquipaB;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
// Métodos para gerenciar o resultado da partida
}

