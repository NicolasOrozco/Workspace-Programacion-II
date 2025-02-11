package co.edu.uniquindio.poo.biblioteca_digital.model;

import java.util.LinkedList;

public class Admin extends Usuario implements gestorBiblioteca{
    public Admin(String nombre, String id, String email, LinkedList<Prestamo> prestamos) {
        super(nombre, id, email, prestamos);
    }

    @Override
    public void agregarUsuario(Usuario usuario) {

    }

    @Override
    public Usuario obtenerUsuario(String id) {
        return null;
    }

    @Override
    public void editarUsuario(String id, Usuario usuario) {

    }

    @Override
    public void eliminarUsuario(String id) {

    }

    @Override
    public void agregarAdmin(Admin admin) {

    }

    @Override
    public Admin obtenerAdmin(String id) {
        return null;
    }

    @Override
    public void editarAdmin(String id, Admin admin) {

    }

    @Override
    public void eliminarAdmin(String id) {

    }

    @Override
    public void agregarcrearPrestamo(Prestamo prestamo) {

    }

    @Override
    public Prestamo obtenerPrestamo(String id) {
        return null;
    }

    @Override
    public void editarPrestamo(String id, Prestamo prestamo) {

    }

    @Override
    public void eliminarPrestamo(String id) {

    }

    @Override
    public void agregarMaterial(Material material) {

    }

    @Override
    public Material obtenerMaterial(String id) {
        return null;
    }

    @Override
    public void editarMaterial(String id, Material material) {

    }

    @Override
    public void eliminarMaterial(String id) {

    }
}
