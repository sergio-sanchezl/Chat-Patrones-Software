package Interprete;

/**
 *
 * @author Sergio
 */
public class InterpreteNoHacerNada implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        System.out.println("InterpreteNoHacerNada con contexto: " + contexto.toString());
    }
    
}
