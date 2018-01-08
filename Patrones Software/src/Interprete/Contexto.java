package Interprete;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class Contexto {
    private Sala sala;
    private Usuario emisor;
    private String input;
    private Usuario receptor;
    private String mensaje;
    
    public Contexto(Sala sala, Usuario emisor, String input) {
        this.sala = sala;
        this.emisor = emisor;
        this.input = input;
    }
    
    public Usuario buscarUsuarioPorNombre(String input) {
        for(Usuario usuario : sala.getMiembros()) {
            if(usuario.getApodo().equalsIgnoreCase(input)) {
                return usuario;
            }
        }
        return null;
    }
    
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "\n{" + "sala=" + sala + ",\n emisor=" + emisor + ",\n input=" + input + ",\n receptor=" + receptor + ",\n mensaje=" + mensaje + '}';
    }
    
    
    
    
    
}
