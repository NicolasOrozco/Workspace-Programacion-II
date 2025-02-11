package co.edu.uniquindio.poo.biblioteca_digital.model;

import java.util.LinkedList;

public class Biblioteca {
    public String nombre;
    public LinkedList<Usuario> usuarios;
    public LinkedList<Prestamo> prestamos;
    public LinkedList<Material> materiales;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        usuarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        materiales = new LinkedList<>();
    }

    public boolean consultarDisponibilidad(Material material) {

    }

    public Material consultarMaterialTituloAutor(String clave) {

    }

}
