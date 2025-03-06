package ar.com.grupoesfera.comunidad.patrones.proveedores;

public class Televisor {

    private final String TEMPLATE_ESTADO = "[TELEVISOR en %s] %s%n";
    private final String TEMPLATE_CANAL_DE_ENTRADA = "[TELEVISOR en %s] Canal de entrada: %s%n";

    public enum CanalesDeEntrada {
        CABLE,
        HDMI1,
        HDMI2,
        HDMI3,
        AV
    }

    private CanalesDeEntrada canalDeEntrada;
    private String ubicacion;

    public Televisor(String ubicacion) {
        this.ubicacion = ubicacion;
        this.canalDeEntrada = CanalesDeEntrada.CABLE;
    }

    public void encender() {
        System.out.printf(TEMPLATE_ESTADO, this.ubicacion, "encendida");
    }

    public void apagar() {
        System.out.printf(TEMPLATE_ESTADO, this.ubicacion, "apagada");
    }

    public void setCanalDeEntrada(CanalesDeEntrada canalDeEntrada) {
        this.canalDeEntrada = canalDeEntrada;
        System.out.printf(TEMPLATE_CANAL_DE_ENTRADA, this.ubicacion, this.canalDeEntrada);
    }
}
