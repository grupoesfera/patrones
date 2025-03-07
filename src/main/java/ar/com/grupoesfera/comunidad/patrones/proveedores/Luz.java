package ar.com.grupoesfera.comunidad.patrones.proveedores;

public class Luz extends Dispositivo {

    private final String TEMPLATE = "[LUZ en %s] %s%n";

    public Luz(String ubicacion) {
        super(ubicacion);
    }

    public void encender() {
        System.out.printf(TEMPLATE, this.ubicacion, "encendida");
    }

    public void apagar() {
        System.out.printf(TEMPLATE, this.ubicacion, "apagada");
    }
}
