package Comandos;

/**
 *
 * @author Zamar
 */
public class Invocador {
   Command elComando;

    public Invocador(Command elComando) {
        this.elComando = elComando;
    }
   
    public void accionar(){
        elComando.execute();
    }
    public void deshacer(){
        elComando.undo();
    }
    
    public void setComando(Command elComando){
        this.elComando = elComando;
    }
}
