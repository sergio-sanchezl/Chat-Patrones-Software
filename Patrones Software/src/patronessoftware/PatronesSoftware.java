package patronessoftware;
import Comandos.*;
/**
 * @author Sergio
 */
public class PatronesSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos un Administrador.
        Usuario user1 = FactoriaUsuario.crearUsuario("1","Sergio",true);
        
        // Creamos un usuario estándar.
        Usuario user2 = FactoriaUsuario.crearUsuario("2","Tony",false);
        
        // Creamos un usuario estándar.
        Usuario user3 = FactoriaUsuario.crearUsuario("3","Salvatore",false);
        
        // Creamos una sala publica ya que la contraseña es "", vacía.
        Sala sala = FactoriaSala.crearSala(user1,"Sala Guay","Esta es una sala guay", 10, "");
        
        user2.suscribirse(sala);
        user3.suscribirse(sala);
        
        user3.enviarMensaje("Holaaaa", sala);
        user2.echarUsuario(sala, user3); //Intentar echar con usuario normal
        user1.echarUsuario(sala, user3); //Intentar echar con admin
        user1.enviarMensaje("Hello!", sala);
        user1.deshacerUltimaAccion(); //Con Command es muy facil deshacer la ultima accion
        
        user1.echarUsuario(sala, user3);
            
    }
    
}
