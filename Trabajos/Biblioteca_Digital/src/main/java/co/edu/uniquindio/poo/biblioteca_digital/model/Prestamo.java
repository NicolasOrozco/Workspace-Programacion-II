package co.edu.uniquindio.poo.biblioteca_digital.model;

import java.time.LocalDate;

public class Prestamo {
    public String id;
    public Usuario usuario;
    public LocalDate fechaLimite;
    public Material materialPrestamo;
}
