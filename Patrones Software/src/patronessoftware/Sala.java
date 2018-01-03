package patronessoftware;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public abstract class Sala {
    private Usuario administrador;
    private ArrayList<Usuario> moderadores;
    private ArrayList<Usuario> miembros;
    private String titulo;
    private String descripcion;
    private int tamaño;

    public Sala(Usuario administrador, String titulo, String descripcion, int tamaño) {
        this.administrador = administrador;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.moderadores = new ArrayList<>();
        this.miembros = new ArrayList<>();
    }
    
    public Sala init() {
        administrador.suscribirse(this);
        return this;
    }

    
    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Usuario> getModeradores() {
        return moderadores;
    }

    public void setModeradores(ArrayList<Usuario> moderadores) {
        this.moderadores = moderadores;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void suscribirse(Usuario usuario) {
        if(!miembros.contains(usuario)) {
            miembros.add(usuario);
        }
    }
    
    public void desuscribirse(Usuario usuario) {
        miembros.remove(usuario);
    }
    
    public void procesarInput(String texto, Usuario emisor) {
        enviarMensaje(texto,emisor);
    }
    
    public void enviarMensaje(String texto, Usuario emisor) {
        for(Usuario usuario : miembros) {
            usuario.recibirMensaje(texto, emisor, this);
        }
    }
}
