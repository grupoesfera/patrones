package ar.com.grupoesfera.comunidad.patrones;

import ar.com.grupoesfera.comunidad.patrones.proveedores.Luz;
import ar.com.grupoesfera.comunidad.patrones.proveedores.Televisor;

public class App {

    public static void main(String[] args) {
        final Luz luzComedor = new Luz("Comedor");
        final Luz luzCocina = new Luz("Cocina");
        final Televisor televisorDormitorio = new Televisor("Dormitorio");

        ControlRemoto controlRemoto = new ControlRemoto();
    }
}
