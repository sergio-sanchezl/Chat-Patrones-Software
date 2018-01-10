package patronessoftware;
import Usuarios.Usuario;
import Usuarios.FactoriaUsuario;
import Sala.FactoriaSala;
import Sala.Sala;
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
        /*Sala salaotra = sala;
           System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sala)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(salaotra)));*/
        user2.suscribirse(sala);
        user3.suscribirse(sala);
        
        /*user3.enviarMensaje("Holaaaa", sala);
        user2.echarUsuario(sala, user3); //Intentar echar con usuario normal
        user1.echarUsuario(sala, user3); //Intentar echar con admin
        user1.enviarMensaje("Hello!", sala);
        user2.enviarSusurro("Susurrito", sala, user1);
        user1.deshacerUltimaAccion(); //Con Command es muy facil deshacer la ultima accion
        
        user1.echarUsuario(sala, user3);*/
        
        System.out.println("--- --- ---");
        sala.procesarInput("/susurro Tony hola que tal?", user1);
        System.out.println("--- --- ---");
        /*Parser.interpretar(sala, user2, "Me gustan las patatas fritas");
        System.out.println("--- --- ---");
        Parser.interpretar(sala, user1, "/echar Tony");
        System.out.println("--- --- ---");
        Parser.interpretar(sala, user3, "/hacermoderador Sergio");
        System.out.println("--- --- ---");
        Parser.interpretar(sala, user2, "/quitarmoderador");
        System.out.println("--- --- ---");
        Parser.interpretar(sala, user2, "/cambiarnombre Sala muy chula");
        System.out.println("--- --- ---");
        Parser.interpretar(sala, user2, "/cambiardescripcion Hola");
        System.out.println("--- --- ---");
        Parser.interpretar(sala, user2, " ");
        System.out.println("--- --- ---");*/
        
            
    }
    
}
