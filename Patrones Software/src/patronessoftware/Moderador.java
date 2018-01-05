/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronessoftware;

/**
 *
 * @author Zamar
 */
public class Moderador extends Usuario{

    public Moderador(Usuario usuario) {
        super(usuario.getID(), usuario.getApodo());
    }

    @Override
    public void enviarMensaje(String mensaje, Sala objetivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
