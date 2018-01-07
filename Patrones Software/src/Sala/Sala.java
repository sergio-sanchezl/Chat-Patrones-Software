package Sala;

import Interprete.Parser;
import java.util.ArrayList;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public abstract class Sala {

    private TipoSala sala;

    public Sala(TipoSala sala) {
        this.sala = sala;
    }

    public Sala init() {
        sala.getAdministrador().suscribirse(this);
        return this;
    }

    public TipoSala getSala() {
        return sala;
    }

    public void setSala(TipoSala sala) {
        this.sala = sala;
    }

    public Usuario getAdministrador() {
        return sala.getAdministrador();
    }

    public void setAdministrador(Usuario administrador) {
        this.sala.setAdministrador(administrador);
    }

    public ArrayList<Usuario> getModeradores() {
        return this.sala.getModeradores();
    }

    public void setModeradores(ArrayList<Usuario> moderadores) {
        this.sala.setModeradores(moderadores);
    }

    public ArrayList<Usuario> getMiembros() {
        return this.sala.getMiembros();
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.sala.setMiembros(miembros);
    }

    public String getTitulo() {
        return this.sala.getTitulo();
    }

    public void setTitulo(String titulo) {
        this.sala.getTitulo();
    }

    public String getDescripcion() {
        return this.sala.getDescripcion();
    }

    public void setDescripcion(String descripcion) {
        this.sala.setDescripcion(descripcion);
    }

    public int getTamaño() {
        return this.sala.getTamaño();
    }

    public void setTamaño(int tamaño) {
        this.sala.setTamaño(tamaño);
    }

    public abstract void suscribirse(Usuario usuario);

    public abstract void suscribirse(Usuario usuario, String contraseña);

    public void desuscribirse(Usuario usuario) {
        if (this.sala.getMiembros().remove(usuario)) {
            System.out.print(usuario.getApodo() + " de la SalaTest: " + this.getTitulo() + "\n");
        } else {
            System.out.println("El usuario no existe en la sala \n");
        }
    }

    public void quitarModerador(Usuario usuario) {
        this.sala.quitarModerador(usuario);
    }

    public void añadirModerador(Usuario usuario) {
        this.sala.añadirModerador(usuario);
    }

    public void procesarInput(String texto, Usuario emisor) {
        //this.enviarMensaje(texto, emisor);
        new Parser().interpretar(this, emisor, texto);
    }

    public void enviarMensaje(String texto, Usuario emisor) {
        for (Usuario usuario : this.sala.getMiembros()) {
            usuario.recibirMensaje(texto, emisor, this);
        }
    }
    
    public void enviarSusurro(String texto, Usuario emisor, Usuario receptor) {
        if(this.sala.getMiembros().contains(receptor)) {
            receptor.recibirMensaje("[SUSURRO] " + texto, emisor, this);
        }
    }

    @Override
    public String toString() {
        return sala.getTitulo();
    }
    
    
}
