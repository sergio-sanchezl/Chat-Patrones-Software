package patronessoftware;

/**
 *
 * @author Sergio
 */
public class FactoriaSala {
    public static Sala crearSala(Usuario administrador, String titulo, String descripcion, int tamaño, String contraseña) {
        if(contraseña.isEmpty()) {
            return new SalaPublica(administrador,titulo,descripcion,tamaño).init();
        } else {
            return new SalaPrivada(administrador,titulo,descripcion,tamaño).init(); // AQUI HABRIA QUE PASARLE LA CONTRASEÑA!!
        }
    }
}
