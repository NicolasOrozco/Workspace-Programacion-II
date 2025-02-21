package co.edu.uniquindio.poo.empresastreaming;

public class SesionReproduccion extends ServidorStreaming{

    public String id;

    public SesionReproduccion(String region, String id) {
        super(region);
        this.id = id;
    }

}
