package Usuarios;

import Sala.Sala;
import Poderes.*;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public abstract class Usuario {
    private ArrayList<Sala> salasSuscritas;
    private String ID;
    private String apodo;
    private boolean conectado;
    public Poder tipoPoder;
   public Usuario(String ID, String apodo) {
        this.ID = ID;
        this.apodo = apodo;
        this.conectado = false;
        
        this.salasSuscritas = new ArrayList<>();
    }
   //DECORATOR
   public Usuario(Usuario usuario){
       this.ID = usuario.getID();
       this.apodo = usuario.getApodo();
       this.conectado = usuario.isConectado();
       this.salasSuscritas = usuario.getSalasSuscritas();
   }
    
    public ArrayList<Sala> getSalasSuscritas() {
        return salasSuscritas;
    }

    public void setSalasSuscritas(ArrayList<Sala> salasSuscritas) {
        this.salasSuscritas = salasSuscritas;
    }

    public String getID() {
        return ID;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    
    public void suscribirse(Sala sala) {
        sala.suscribirse(this);
        salasSuscritas.add(sala);
    }
    
    public void desuscribirse(Sala sala) {
        sala.desuscribirse(this);
        salasSuscritas.remove(sala);
    }
    
    public void recibirMensaje(String mensaje, Usuario user, Sala sala) {
        System.out.println("[Sala \"" + sala.getTitulo() + "\"] El usuario " + this.ID + " " + this.apodo + " ha recibido el mensaje: \"" + mensaje + "\" de " + user.getID() + " " + user.getApodo());
    }

    public Poder getTipoPoder() {
        return tipoPoder;
    }

    public void setTipoPoder(Poder tipoPoder) {
        this.tipoPoder = tipoPoder;
    }
    public void echarUsuario(Sala sala, Usuario usuario){
        this.tipoPoder.echarUsuario(sala, this, usuario);
    }
    public void deshacerUltimaAccion(){
        this.tipoPoder.deshacerUltimaAccion();
    }
    public abstract void enviarSusurro(String mensaje, Sala objetivo, Usuario receptor);
    
    public abstract void enviarMensaje(String mensaje, Sala objetivo);

    @Override
    public String toString() {
        return "Usuario{" + "ID=" + ID + ", apodo=" + apodo + '}';
    }
    
    
    
}
