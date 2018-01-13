package Sala;

import Usuarios.Usuario;

/**
 * Singleton que almacena la sala usada en el patrón Prototype.
 * 
 * @author Sergio
 */
public class CreadorSalaMensajeDirecto {
    
    public static CreadorSalaMensajeDirecto instancia;
    
    private final TipoPrivada salaAClonar;
    
    private CreadorSalaMensajeDirecto() {
        salaAClonar = new TipoPrivada("q1w2e3r4", null,"Mensaje Directo","",2);
    }
    
    public static CreadorSalaMensajeDirecto getInstancia() {
        if(instancia == null) {
            instancia = new CreadorSalaMensajeDirecto();
        }
        
        return instancia;
    }
    
    public Sala crearSalaMensajeDirecto(Usuario creador, Usuario destinatario) {
        TipoSala clonado = (TipoPrivada) salaAClonar.clonar();
        
        Sala sala = new SalaPrivadaContraseña(clonado);
        sala.setAdministrador(creador);
        sala.suscribirse(creador,"q1w2e3r4");
        sala.suscribirse(destinatario,"q1w2e3r4");
        
        return sala;
    } 
}
