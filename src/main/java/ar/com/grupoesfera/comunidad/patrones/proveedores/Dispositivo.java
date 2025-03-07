package ar.com.grupoesfera.comunidad.patrones.proveedores;

public abstract class Dispositivo {

    protected String ubicacion;

    public Dispositivo(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
