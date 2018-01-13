package Interprete;

import Sala.Sala;
import Usuarios.Usuario;
import java.util.StringTokenizer;
/**
 *
 * @author Sergio
 */
public class Parser {

    // acepta los siguientes comandos:
    /*
     - /echar NOMBRE
     - /hacermoderador NOMBRE
     - /quitarmoderador NOMBRE
     - /cambiarnombre TEXTO
     - /cambiardescripcion TEXTO
     - /susurro NOMBRE TEXTO
     - TEXTO (MENSAJE SIN COMANDO)
    */
    public static void interpretar(Sala sala, Usuario emisor, String input) {
        Contexto contexto = new Contexto(sala,emisor,input);
        StringTokenizer st = new StringTokenizer(input," ");
        
        String token;
        
        Interprete interprete;
        
        //System.out.println("PARSER INPUT: " + input);
        switch(st.countTokens()) {
            case 0:
                interprete = new InterpreteEnviarMensaje();
                contexto.setMensaje("");
                break;
            case 1:
                interprete = new InterpreteEnviarMensaje();
                contexto.setMensaje(input);
                break;
            case 2:
                token = st.nextToken();
                if(token.startsWith("/")) {
                    switch(token) {
                        case "/echar":
                            interprete = new InterpreteEcharUsuario();
                            contexto.setReceptor(contexto.buscarUsuarioPorNombre(st.nextToken()));
                            break;
                        case "/hacermoderador":
                            interprete = new InterpreteAñadirModerador();
                            contexto.setReceptor(contexto.buscarUsuarioPorNombre(st.nextToken()));
                            break;
                        case "/quitarmoderador":
                            interprete = new InterpreteQuitarModerador();
                            contexto.setReceptor(contexto.buscarUsuarioPorNombre(st.nextToken()));
                            break;
                        case "/cambiarnombre":
                            interprete = new InterpreteCambiarNombre();
                            contexto.setMensaje(st.nextToken());
                            break;
                        case "/cambiardescripcion":
                            interprete = new InterpreteCambiarDescripcion();
                            contexto.setMensaje(st.nextToken());
                            break;
                        default:
                            interprete = new InterpreteEnviarMensaje();
                            contexto.setMensaje(input);
                            break;
                    }
                } else {
                    interprete = new InterpreteEnviarMensaje();
                    contexto.setMensaje(input);
                }
                break;
            default:
                token = st.nextToken();
                if(token.startsWith("/")) {
                    switch(token) {
                        case "/cambiarnombre":
                            interprete = new InterpreteCambiarNombre();
                            String nombreNuevo = "";
                            while(st.hasMoreTokens()) {
                                nombreNuevo += st.nextToken() + " ";
                            }
                            contexto.setMensaje(nombreNuevo);
                            break;
                        case "/cambiardescripcion":
                            interprete = new InterpreteCambiarDescripcion();
                            String descripcionNueva = "";
                            while(st.hasMoreTokens()) {
                                descripcionNueva += st.nextToken() + " ";
                            }
                            contexto.setMensaje(descripcionNueva);
                            break;
                        case "/susurro":
                            interprete = new InterpreteEnviarSusurro();
                            contexto.setReceptor(contexto.buscarUsuarioPorNombre(st.nextToken()));
                            String mensajeSusurro = "";
                            while(st.hasMoreTokens()) {
                                mensajeSusurro += st.nextToken() + " ";
                            }
                            contexto.setMensaje(mensajeSusurro);
                            break;
                        default:
                            interprete = new InterpreteEnviarMensaje();
                            contexto.setMensaje(input);
                            break;
                    }
                } else {
                    interprete = new InterpreteEnviarMensaje();
                    contexto.setMensaje(input);
                }
                break;
        }
        
        interprete.interpretar(contexto);
    }
    
}
