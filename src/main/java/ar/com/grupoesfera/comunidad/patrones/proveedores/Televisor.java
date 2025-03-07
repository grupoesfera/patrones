package ar.com.grupoesfera.comunidad.patrones.proveedores;

public class Televisor extends Dispositivo {

    private final String TEMPLATE_ESTADO = "[TELEVISOR en %s] %s%n";
    private final String TEMPLATE_CANAL_DE_ENTRADA = "[TELEVISOR en %s] Canal de entrada: %s%n";

    public Televisor(String ubicacion) {
        super(ubicacion);
        this.canalDeEntrada = CanalesDeEntrada.CABLE;
    }

    public enum CanalesDeEntrada {
        CABLE,
        HDMI1,
        HDMI2,
        HDMI3,
        AV
    }

    private CanalesDeEntrada canalDeEntrada;


    public void prender() {
        System.out.printf(TEMPLATE_ESTADO, this.ubicacion, "prendida");
    }

    public void desconectar() {
        System.out.printf(TEMPLATE_ESTADO, this.ubicacion, "desconectada");
    }

    public void setCanalDeEntrada(CanalesDeEntrada canalDeEntrada) {
        this.canalDeEntrada = canalDeEntrada;
        System.out.printf(TEMPLATE_CANAL_DE_ENTRADA, this.ubicacion, this.canalDeEntrada);
    }
}
