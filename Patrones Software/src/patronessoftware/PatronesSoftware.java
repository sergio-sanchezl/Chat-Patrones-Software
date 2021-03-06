package patronessoftware;
import Sala.CreadorSalaMensajeDirecto;
import Usuarios.Usuario;
import Usuarios.FactoriaUsuario;
import Sala.FactoriaSala;
import Sala.Sala;
/**
 * @author Sergio
 */
public class PatronesSoftware {

    public static void main(String[] args) {
        
        // Creamos un Administrador.
        Usuario user1 = FactoriaUsuario.crearUsuario("1","Sergio",true);
        
        // Creamos un usuario estándar.
        Usuario user2 = FactoriaUsuario.crearUsuario("2","Tony",false);
        
        // Creamos un usuario estándar.
        Usuario user3 = FactoriaUsuario.crearUsuario("3","Salvatore",false);
        
        Sala sala = CreadorSalaMensajeDirecto.getInstancia().crearSalaMensajeDirecto(user1, user2);
        
        sala.procesarInput("Hola Tony!", user1);
        sala.procesarInput("Hola", user2);
        sala.procesarInput("ya",user1);
        
        // Creamos una sala publica ya que la contraseña es "", vacía.
        //Sala sala = FactoriaSala.crearSala(user1,"Sala Guay","Esta es una sala guay", 10, "");
        /*Sala salaotra = sala;
           System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sala)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(salaotra)));*/
        //user2.suscribirse(sala);
        //user3.suscribirse(sala);
        
        /*user3.enviarMensaje("Holaaaa", sala);
        user2.echarUsuario(sala, user3); //Intentar echar con usuario normal
        user1.echarUsuario(sala, user3); //Intentar echar con admin
        user1.enviarMensaje("Hello!", sala);
        user2.enviarSusurro("Susurrito", sala, user1);
        user1.deshacerUltimaAccion(); //Con Command es muy facil deshacer la ultima accion
        
        user1.echarUsuario(sala, user3);*/
        /*user2.setConectado(false);
        sala.procesarInput("Hola chicooos",user1);
        sala.procesarInput("Que tal?",user1);
        sala.procesarInput("Bien!",user3);
        sala.procesarInput("Me alegro!",user1);
        System.out.println("2 Tony CONECTANDOSE"); 
        user2.setConectado(true);*/
        /*System.out.println("--- --- ---");
        sala.procesarInput("/susurro Tony hola que tal?", user1);
        System.out.println("--- --- ---");*/
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
