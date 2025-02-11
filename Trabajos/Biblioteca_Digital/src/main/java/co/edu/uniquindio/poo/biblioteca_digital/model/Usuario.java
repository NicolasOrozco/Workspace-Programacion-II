package co.edu.uniquindio.poo.biblioteca_digital.model;

import java.util.LinkedList;

public class Usuario {
    public String nombre;
    public String id;
    public String email;
    public LinkedList<Prestamo> prestamos;

    Usuario(String nombre, String id, String email, LinkedList<Prestamo> prestamos) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        prestamos = new LinkedList<>();
    }

    public Material buscarMaterialBilbliografico() {

    }

}
