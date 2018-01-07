package Poderes;

import Usuarios.Usuario;
import Sala.Sala;
import Comandos.*;
import patronessoftware.*;

/**
 *
 * @author Zamar, Sergio
 */
public abstract class Poder {
    protected Invocador accionar;
    public abstract void echarUsuario(Sala sala, Usuario usuario);
    
    public abstract void añadirModerador(Sala sala, Usuario usuario);
    public abstract void quitarModerador(Sala sala, Usuario usuario);
    
    // Todos pueden enviar mensajes, por lo que lo implementamos aquí.
    public void enviarMensaje(Sala sala, Usuario emisor, String mensaje) {
        EnviarMensaje enviarMensaje = new EnviarMensaje(sala,emisor,mensaje);
        accionar = new Invocador(enviarMensaje);
        accionar.accionar();
    }
    
    // Todos pueden enviar susurros, por lo que lo implementamos aquí.
    public void enviarSusurro(Sala sala, Usuario emisor, Usuario receptor, String mensaje) {
        EnviarSusurro enviarSusurro = new EnviarSusurro(sala,emisor,receptor,mensaje);
        accionar = new Invocador(enviarSusurro);
        accionar.accionar();
    }
    
    public void deshacerUltimaAccion(){
        accionar.deshacer();
    }
}
