package Sala;

import java.util.ArrayList;
import patronessoftware.Usuario;

/**
 *
 * @author Sergio
 */
public class SalaPrivadaContraseña extends Sala {
    
    public SalaPrivadaContraseña(TipoSala sala) {
        super(sala);
    }

    @Override
    public void suscribirse(Usuario usuario) {
        
    }

    @Override
    public void suscribirse(Usuario usuario, String contraseña) {
    }
}
