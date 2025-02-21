package co.edu.uniquindio.poo.empresastreaming;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    public String resolucion;
    public String anchoBanda;
    public boolean ahorroDatos;

    private ConfiguracionSistema(String resolucion, String anchoBanda, boolean ahorroDatos) {
        this.resolucion = resolucion;
        this.anchoBanda = anchoBanda;
        this.ahorroDatos = ahorroDatos;
    }

    public static ConfiguracionSistema getInstancia() {
        if ( instancia == null ) {
            instancia = new ConfiguracionSistema("1080p", "50Mb/s", false);
        }
        return instancia;
    }

    public void mostrarConfiguracionActual(){
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Ancho Banda: " + anchoBanda);
        System.out.println("Ahorro Datos: " + ahorroDatos);
    }

    public void cambiarConfiguracion(String resolucion, String anchoBanda, boolean ahorroDatos) {
        this.resolucion = resolucion;
        this.anchoBanda = anchoBanda;
        this.ahorroDatos = ahorroDatos;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getAnchoBanda() {
        return anchoBanda;
    }

    public void setAnchoBanda(String anchoBanda) {
        this.anchoBanda = anchoBanda;
    }

    public boolean isAhorroDatos() {
        return ahorroDatos;
    }

    public void setAhorroDatos(boolean ahorroDatos) {
        this.ahorroDatos = ahorroDatos;
    }
}
