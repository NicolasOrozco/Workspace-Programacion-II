package co.edu.uniquindio.poo.empresa_electrodomesticos.model;

public class Lavadora extends Electrodomestico{

    public Lavadora(String nombre, String modelo, String color, double capacidad, double precioBase) {
        super(nombre, modelo, color, capacidad, precioBase);
        precioVenta = calcularPrecioVenta();
    }

    @Override
    public double calcularPrecioVenta() {
        return 0;
    }
}
