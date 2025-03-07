package ar.com.grupoesfera.comunidad.patrones;

import ar.com.grupoesfera.comunidad.patrones.proveedores.Dispositivo;
import ar.com.grupoesfera.comunidad.patrones.proveedores.Luz;
import ar.com.grupoesfera.comunidad.patrones.proveedores.Televisor;

public class ControlRemoto {

    private Dispositivo[] dispositivos;

    public ControlRemoto() {
        this.dispositivos = new Dispositivo[7];
    }

    public void asignarDispositivo(int ranura, Dispositivo dispositivo) {
        this.dispositivos[ranura] = dispositivo;
    }

    public void presionarBotonDeEncendido(int ranura) {
        Dispositivo dispositivo = this.dispositivos[ranura];
        if (dispositivo != null) {
            if (dispositivo instanceof Luz) {
                ((Luz)dispositivo).encender();
            } else if (dispositivo instanceof Televisor) {
                ((Televisor)dispositivo).prender();
            }
        }
    }

    public void presionarBotonDeApagado(int ranura) {
        Dispositivo dispositivo = this.dispositivos[ranura];
        if (dispositivo != null) {
            if (dispositivo instanceof Luz) {
                ((Luz)dispositivo).apagar();
            } else if (dispositivo instanceof Televisor) {
                ((Televisor)dispositivo).desconectar();
            }
        }
    }
}
