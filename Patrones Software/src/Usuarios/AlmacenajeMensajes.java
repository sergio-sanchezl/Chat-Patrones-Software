package Usuarios;

import java.util.ArrayList;

/**
 * Observador para Usuario, obtiene el ultimo mensaje recibido y 
 * su conexión. Si está conectado, muestra el mensaje. Si no, lo almacena.
 * Siempre que se envie un mensaje o se cambie el estado de conexión se notificará
 * a este observador.
 * @author Sergio
 */
public class AlmacenajeMensajes implements Observador {
    private ArrayList<String> mensajes;
    
    private Sujeto sujeto;
    
    private MedioSujetoObservador ultimoMensajeYConexion; 
    
    public AlmacenajeMensajes(Sujeto sujeto) {
        this.mensajes = new ArrayList<>();
        this.sujeto = sujeto;
    }
    
    public void prepararEnvioMensaje(String mensaje) {
        if(sujeto.getUltimoMensajeYConexion().conectado) {
            System.out.println(mensaje);
        } else {
            mensajes.add(mensaje);
        }
    }
    
    /**
     * Elimina los mensajes contenidos en la cola y los envía.
     */
    public void enviarNoEnviados() {
        // Hacemos una copia por que si no estariamos borrando
        // mensajes de una lista mientras la navegamos, lo cual provoca
        // excepción por modificación concurrente.
        ArrayList<String> copiaMensajes = new ArrayList<>();
        for(String mensaje : mensajes) {
            copiaMensajes.add(mensaje);
        }
        
        for(int i = 0; i < copiaMensajes.size(); i++) {
            mensajes.remove(0);
            prepararEnvioMensaje(copiaMensajes.get(i));
        }
    }

    @Override
    public void actualizar() {
        ultimoMensajeYConexion = sujeto.getUltimoMensajeYConexion();
        //System.out.println(ultimoMensajeYConexion.toString());
        
        // Si el ultimo mensaje es vacio, significa que solo ha cambiado 
        // su estado de conexión.
        if(!ultimoMensajeYConexion.ultimoMensaje.equals("")) {
            System.out.println("añadiendo");
            mensajes.add(ultimoMensajeYConexion.ultimoMensaje);
        }
        enviarNoEnviados();
    }
}
