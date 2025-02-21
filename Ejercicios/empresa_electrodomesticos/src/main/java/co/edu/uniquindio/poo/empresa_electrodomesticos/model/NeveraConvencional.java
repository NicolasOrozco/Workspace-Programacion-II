package co.edu.uniquindio.poo.empresa_electrodomesticos.model;

public class NeveraConvencional extends Nevera{

    public NeveraConvencional(String nombre, String modelo, String color, double capacidad, double precioBase) {
        super(nombre, modelo, color, capacidad, precioBase);
        precioVenta = calcularPrecioVenta();
    }

    @Override
    public double calcularPrecioVenta() {
        this.precioVenta = precioBase;
        return precioVenta;
    }


}
