package co.edu.uniquindio.poo.biblioteca_digital.model;

import java.time.LocalDate;

public class Material {
    public String titulo;
    public String autor;
    public LocalDate anioPublicacion;
    public String codigo;
    public boolean disponibilidad;
    public boolean restriccionUsoBiblioteca;
    public Admin responsable;

    public Material(String titulo, String autor, LocalDate anioPublicacion, String codigo, boolean disponibilidad, boolean restriccionUsoBiblioteca, Admin responsable) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.codigo = codigo;
        this.disponibilidad = disponibilidad;
        this.restriccionUsoBiblioteca = restriccionUsoBiblioteca;
        this.responsable = responsable;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(LocalDate anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isRestriccionUsoBiblioteca() {
        return restriccionUsoBiblioteca;
    }

    public void setRestriccionUsoBiblioteca(boolean restriccionUsoBiblioteca) {
        this.restriccionUsoBiblioteca = restriccionUsoBiblioteca;
    }

    public Admin getResponsable() {
        return responsable;
    }

    public void setResponsable(Admin responsable) {
        this.responsable = responsable;
    }
}
