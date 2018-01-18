package Sala;

import Usuarios.Usuario;

/**
 * Abstraccion
 * @author Sergio
 */
public class SalaPublica extends Sala {
    
    public SalaPublica(TipoSala sala) {
        super(sala);
    }
    public SalaPublica(SalaPrivadaContraseña sala) {
        super(sala.getSala());
    }

    @Override
    public void suscribirse(Usuario usuario) {
       super.getSala().suscribirse(usuario);
    }

    @Override
    public void suscribirse(Usuario usuario, String contraseña) {
        // como es publica no pedimos contraseña incluso si la ponen
        super.getSala().suscribirse(usuario);
    }
    
    @Override
    public boolean tieneContraseña() {
        return false; //Si es publica no queremos ni contraseña.
    }
}
