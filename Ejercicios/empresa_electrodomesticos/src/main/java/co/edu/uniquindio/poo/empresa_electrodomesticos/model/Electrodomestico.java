package co.edu.uniquindio.poo.empresa_electrodomesticos.model;

public abstract class Electrodomestico {
    String nombre;
    String modelo;
    String color;
    double capacidad;
    double precioBase;
    double precioVenta;

    public Electrodomestico(String nombre, String modelo, String color, double capacidad, double precioBase) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        this.capacidad = capacidad;
        this.precioBase = precioBase;
        precioVenta = calcularPrecioVenta();
    }

    public abstract double calcularPrecioVenta();


    //-----------------Getters y Setters-------------------//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
