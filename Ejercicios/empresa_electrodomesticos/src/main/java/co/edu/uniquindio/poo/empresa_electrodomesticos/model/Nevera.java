package co.edu.uniquindio.poo.empresa_electrodomesticos.model;

public abstract class Nevera extends Electrodomestico{
    public Nevera(String nombre, String modelo, String color, double capacidad, double precioBase) {
        super(nombre, modelo, color, capacidad, precioBase);
        precioVenta = calcularPrecioVenta();
    }

}
