package co.edu.uniquindio.poo.biblioteca_digital.model;

public interface gestorBiblioteca {

    public void agregarUsuario(Usuario usuario);

    public Usuario obtenerUsuario(String id);

    public void editarUsuario(String id, Usuario usuario);

    public void eliminarUsuario(String id);


    public void agregarAdmin(Admin admin);

    public Admin obtenerAdmin(String id);

    public void editarAdmin(String id,Admin admin);

    public void eliminarAdmin(String id);


    public void agregarcrearPrestamo(Prestamo prestamo);

    public Prestamo obtenerPrestamo(String id);

    public void editarPrestamo(String id,Prestamo prestamo);

    public void eliminarPrestamo(String id);


    public void agregarMaterial(Material material);

    public Material obtenerMaterial(String id);

    public void editarMaterial(String id,Material material);

    public void eliminarMaterial(String id);

}

