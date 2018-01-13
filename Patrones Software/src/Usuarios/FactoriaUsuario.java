package Usuarios;

/**
 * Factory method para crear Usuarios. Además, les añade automaticamente
 * como observador un AlmacenajeMensajes para poder visualizar los mensajes.
 * @author Sergio
 */
public class FactoriaUsuario {
    public static Usuario crearUsuario(String ID, String apodo, boolean administrador) {
        Usuario usuarioNuevo;
        if(administrador) {
            usuarioNuevo = new Administrador(ID,apodo);
        } else {
            usuarioNuevo =  new UsuarioEstandar(ID,apodo);
        }
        usuarioNuevo.añadirObservador(new AlmacenajeMensajes(usuarioNuevo));
        return usuarioNuevo;
    }
}
