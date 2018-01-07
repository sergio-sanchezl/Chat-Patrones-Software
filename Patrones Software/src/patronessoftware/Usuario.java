package patronessoftware;

import Sala.SalaTest;
import Poderes.Poder;
import Poderes.*;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public abstract class Usuario {
    private ArrayList<SalaTest> salasSuscritas;
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
    
    public ArrayList<SalaTest> getSalasSuscritas() {
        return salasSuscritas;
    }

    public void setSalasSuscritas(ArrayList<SalaTest> salasSuscritas) {
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
    
    public void suscribirse(SalaTest sala) {
        sala.suscribirse(this);
        salasSuscritas.add(sala);
    }
    
    public void desuscribirse(SalaTest sala) {
        sala.desuscribirse(this);
        salasSuscritas.remove(sala);
    }
    
    public void recibirMensaje(String mensaje, Usuario user, SalaTest sala) {
        System.out.println("[Sala \"" + sala.getTitulo() + "\"] El usuario " + this.ID + " " + this.apodo + " ha recibido el mensaje: \"" + mensaje + "\" de " + user.getID() + " " + user.getApodo());
    }

    public Poder getTipoPoder() {
        return tipoPoder;
    }

    public void setTipoPoder(Poder tipoPoder) {
        this.tipoPoder = tipoPoder;
    }
    public void echarUsuario(SalaTest sala, Usuario Usuario){
        this.tipoPoder.echarUsuario(sala, Usuario);
    }
    public void deshacerUltimaAccion(){
        this.tipoPoder.deshacerUltimaAccion();
    }
    public abstract void enviarMensaje(String mensaje, SalaTest objetivo);
    
}
