package co.edu.uniquindio.poo.biblioteca_digital.model;

import java.time.LocalDate;

public class Revista extends Material{
    public int volumen;

    public Revista(String titulo, String autor, LocalDate anioPublicacion, String codigo, boolean disponibilidad, boolean restriccionUsoBiblioteca, Admin responsable, int volumen) {
        super(titulo, autor, anioPublicacion, codigo, disponibilidad, restriccionUsoBiblioteca, responsable);
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

}
