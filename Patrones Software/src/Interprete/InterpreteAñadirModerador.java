package Interprete;

/**
 *
 * @author Sergio
 */
public class InterpreteAñadirModerador implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        System.out.println("InterpreteAñadirModerador con contexto: " + contexto.toString());
    }
    
}
