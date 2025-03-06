package ar.com.grupoesfera.comunidad.patrones;

import ar.com.grupoesfera.comunidad.patrones.proveedores.Luz;
import ar.com.grupoesfera.comunidad.patrones.proveedores.Televisor;

public class App {

    public static void main(String[] args) {
        final Luz luzComedor = new Luz("Comedor");
        final Luz luzCocina = new Luz("Cocina");
        final Televisor televisorDormitorio = new Televisor("Dormitorio");

        final EncenderLuz encenderLuzComedor = new EncenderLuz(luzComedor);
        final ApagarLuz apagarLuzComedor = new ApagarLuz(luzComedor);

        final EncenderLuz encenderLuzCocina = new EncenderLuz(luzCocina);
        final ApagarLuz apagarLuzCocina = new ApagarLuz(luzCocina);

        final EncenderTelevisor encenderTelevisorDormitorio = new EncenderTelevisor(televisorDormitorio);
        final ApagarTelevisor apagarTelevisorDormitorio = new ApagarTelevisor(televisorDormitorio);

        ControlRemoto controlRemoto = new ControlRemoto();

        controlRemoto.asignarComando(0, encenderLuzComedor, apagarLuzComedor);
        controlRemoto.asignarComando(1, encenderLuzCocina, apagarLuzCocina);
        controlRemoto.asignarComando(2, encenderTelevisorDormitorio, apagarTelevisorDormitorio);

        controlRemoto.presionarBotonDeEncendido(0);
        controlRemoto.presionarBotonDeEncendido(1);

        controlRemoto.presionarBotonDeApagado(1);

        controlRemoto.presionarBotonDeEncendido(2);
    }
}
