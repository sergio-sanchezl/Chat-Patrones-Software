
package Usuarios;

/**
 * Clase usada como medio para la comunicación entre el sujeto y el observador, 
 * representa el Estado en el patrón Observer.
 * @author Sergio
 */
public class MedioSujetoObservador {
    public boolean conectado;
    public String ultimoMensaje;

    public MedioSujetoObservador(boolean conectado, String ultimoMensaje) {
        this.conectado = conectado;
        this.ultimoMensaje = ultimoMensaje;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public String getUltimoMensaje() {
        return ultimoMensaje;
    }

    public void setUltimoMensaje(String ultimoMensaje) {
        this.ultimoMensaje = ultimoMensaje;
    }

    @Override
    public String toString() {
        return "MedioSujetoObservador{" + "conectado=" + conectado + ", ultimoMensaje=" + ultimoMensaje + '}';
    }
    
    
}
