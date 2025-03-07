package ar.com.grupoesfera.comunidad.patrones;

import ar.com.grupoesfera.comunidad.patrones.proveedores.Luz;
import ar.com.grupoesfera.comunidad.patrones.proveedores.Televisor;

public class App {

    public static void main(String[] args) {
        final Luz luzComedor = new Luz("Comedor");
        final Luz luzCocina = new Luz("Cocina");
        final Televisor televisorComedor = new Televisor("Comedor");

        ControlRemoto controlRemoto = new ControlRemoto();
        controlRemoto.asignarDispositivo(0, luzComedor);
        controlRemoto.asignarDispositivo(1, luzCocina);
        controlRemoto.asignarDispositivo(2, televisorComedor);

        controlRemoto.presionarBotonDeEncendido(0);
        controlRemoto.presionarBotonDeEncendido(1);
        controlRemoto.presionarBotonDeEncendido(2);

        controlRemoto.presionarBotonDeApagado(2);
    }
}
