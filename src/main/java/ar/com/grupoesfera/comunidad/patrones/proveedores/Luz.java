package ar.com.grupoesfera.comunidad.patrones.proveedores;

public class Luz {

    private final String TEMPLATE = "[LUZ en %s] %s%n";
    private String ubicacion;

    public Luz(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void encender() {
        System.out.printf(TEMPLATE, this.ubicacion, "encendida");
    }

    public void apagar() {
        System.out.printf(TEMPLATE, this.ubicacion, "apagada");
    }
}
