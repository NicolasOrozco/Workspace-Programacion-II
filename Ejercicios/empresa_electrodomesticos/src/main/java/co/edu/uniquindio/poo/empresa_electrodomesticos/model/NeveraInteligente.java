package co.edu.uniquindio.poo.empresa_electrodomesticos.model;

public class NeveraInteligente extends Nevera{

    public NeveraInteligente(String nombre, String modelo, String color, double capacidad, double precioBase) {
        super(nombre, modelo, color, capacidad, precioBase);
        precioVenta = calcularPrecioVenta();
    }


}
