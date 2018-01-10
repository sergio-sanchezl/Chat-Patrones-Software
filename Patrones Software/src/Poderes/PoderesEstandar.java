package Poderes;

import Comandos.*;
import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Zamar
 */
public class PoderesEstandar extends Poder {

    /**
     * No puede echar a nadie
     */
    public boolean cumplePermisos(Sala sala, Usuario emisor, Usuario receptor) {
        if (emisor.equals(sala.getAdministrador()) //Es administrador local
                || sala.getModeradores().contains(emisor) && !(sala.getModeradores().contains(receptor)) || sala.getAdministrador().equals(receptor) //Es moderador y el otro no es administrador local o moderador.
                ) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba si el usuario es administrador o moderador de la sala
     *
     * @param sala
     * @param emisor
     * @return
     */
    public boolean cumplePermisos(Sala sala, Usuario emisor) {
        return (emisor.equals(sala.getAdministrador()) || sala.getModeradores().contains(emisor));
    }

    @Override
    public void echarUsuario(Sala sala, Usuario emisor, Usuario receptor) {
        // 3 casos
        //1 usuario es administrador local en sala, puede echar moderadores también
        EcharUsuario comando = new EcharUsuario(sala, receptor);
        if (cumplePermisos(sala, emisor, receptor)) {
            this.accionar = new Invocador(comando);
            this.accionar.accionar();
        } //3 
        else {
            System.out.println("No tienes poderes en esta sala");
        }
    }

    @Override
    public void añadirModerador(Sala sala, Usuario emisor, Usuario receptor) {
        AñadirModerador comando = new AñadirModerador(sala, receptor);
        if (cumplePermisos(sala, emisor, receptor)) {
            this.accionar = new Invocador(comando);
            this.accionar.accionar();
        } //3 
        else {
            System.out.println("No tienes poderes en esta sala");
        }
    }

    @Override
    public void quitarModerador(Sala sala, Usuario emisor, Usuario receptor) {
        QuitarModerador comando = new QuitarModerador(sala, receptor);
        if (cumplePermisos(sala, emisor, receptor)) {
            this.accionar = new Invocador(comando);
            this.accionar.accionar();
        } //3 
        else {
            System.out.println("No tienes poderes en esta sala");
        }
    }

    @Override
    public void cambiarNombreSala(Sala sala, Usuario usuario, String nombreSala) {
        SetSalaTitulo setTitulo = new SetSalaTitulo(sala, nombreSala);
        if (cumplePermisos(sala, usuario)) {
            accionar = new Invocador(setTitulo);
            accionar.accionar();
        } else {
            System.out.println("No tienes poderes en esta sala");
        }

    }

    @Override
    public void cambiarDescripcionSala(Sala sala, Usuario usuario, String descripcionSala) {
        SetSalaDescripcion setDescripcion = new SetSalaDescripcion(sala, descripcionSala);
        if (cumplePermisos(sala, usuario)) {
            accionar = new Invocador(setDescripcion);
            accionar.accionar();
        } else {
            System.out.println("No tienes poderes en esta sala");
        }

    }

}
