package co.edu.uniquindio.poo.biblioteca_digital.model;

import java.time.LocalDate;

public class Libro extends Material{
    public Libro(String titulo, String autor, LocalDate anioPublicacion, String codigo, boolean disponibilidad, boolean restriccionUsoBiblioteca, Admin responsable) {
        super(titulo, autor, anioPublicacion, codigo, disponibilidad, restriccionUsoBiblioteca, responsable);
    }
}
