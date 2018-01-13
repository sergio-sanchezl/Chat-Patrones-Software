
package Usuarios;

/**
 *
 * @author Sergio
 */
public interface Sujeto {
    
    /**
     * Devuelve el estado de la conexión del usuario y de su ultimo mensaje recibido.
     *
     * @return 
     */
    public MedioSujetoObservador getUltimoMensajeYConexion();
    
    /**
     * Añade un observador a la lista.
     *
     * @param o Observador.
     */
    public void añadirObservador(Observador o);

    /**
     * Elimina un observador de la lista
     *
     * @param o Observador.
     */
    public void eliminarObservador(Observador o);

    /**
     * Notifica a todos los observadores de que se ha producido un cambio
     */
    public void notificarObservadores();
}
