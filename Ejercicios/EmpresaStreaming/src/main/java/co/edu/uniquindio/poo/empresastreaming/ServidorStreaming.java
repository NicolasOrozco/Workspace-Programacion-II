package co.edu.uniquindio.poo.empresastreaming;

public class ServidorStreaming {

    protected ConfiguracionSistema configuracionGlobal;
    public String region;

    public ServidorStreaming(String region) {
        this.configuracionGlobal = ConfiguracionSistema.getInstancia();
        this.region = region;
    }

    public ConfiguracionSistema getConfiguracionGlobal() {
        return configuracionGlobal;
    }


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
