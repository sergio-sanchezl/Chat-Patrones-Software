package patronessoftware;

/**
 *
 * @author Sergio
 */
public class FactoriaUsuario {
    public static Usuario crearUsuario(String ID, String apodo, boolean administrador) {
        if(administrador) {
            return new Administrador(ID,apodo);
        } else {
            return new UsuarioEstandar(ID,apodo);
        }
    }
}
