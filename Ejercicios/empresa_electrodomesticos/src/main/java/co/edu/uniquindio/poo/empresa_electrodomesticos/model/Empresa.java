package co.edu.uniquindio.poo.empresa_electrodomesticos.model;

import java.util.LinkedList;

public class Empresa {
    public String nombre;
    public LinkedList<Electrodomestico> electrodomesticos;


    public String obtenerNombreElectrodomesticoMasBarato() {
        Electrodomestico ElectrodomesticoMasBarato = null;
        for (Electrodomestico e : electrodomesticos){
            if (e.getPrecioVenta()<ElectrodomesticoMasBarato.getPrecioBase()){
                ElectrodomesticoMasBarato = e;
            }
        }
        if (ElectrodomesticoMasBarato != null){
            return ElectrodomesticoMasBarato.getNombre();
        }
        return "Aun no hay electrodomesticos en la empresa";
    }

    public LinkedList obtenerNeverasPrecioVentaMenorAlPromedio() {
        LinkedList<Electrodomestico> neveras = new LinkedList<>();
        for (Electrodomestico e : electrodomesticos){
            if (e instance of Nevera){

            }
        }

    }

    //-----------------Getters y Setters-------------------//


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }

    public void setElectrodomesticos(LinkedList<Electrodomestico> electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }
}
