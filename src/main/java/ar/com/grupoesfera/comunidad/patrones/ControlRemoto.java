package ar.com.grupoesfera.comunidad.patrones;

public class ControlRemoto {

    private Comando[] comandosDeEncendido;
    private Comando[] comandosDeApagado;

    public ControlRemoto() {
        this.comandosDeEncendido = new Comando[7];
        this.comandosDeApagado = new Comando[7];
    }

    public void asignarComando(int ranura, Comando comandoDeEncendido, Comando comandoDeApagado) {
        this.comandosDeEncendido[ranura] = comandoDeEncendido;
        this.comandosDeApagado[ranura] = comandoDeApagado;
    }

    public void presionarBotonDeEncendido(int ranura) {
        this.comandosDeEncendido[ranura].ejecutar();
    }

    public void presionarBotonDeApagado(int ranura) {
        this.comandosDeApagado[ranura].ejecutar();
    }
}
