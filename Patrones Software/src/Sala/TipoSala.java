/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala;

import java.util.ArrayList;
import Usuarios.Usuario;

/**
 * Esto será el implementador, dará los dos tipos de posibles salas que son
 * privadas y publicas.
 *
 * @author Zamar
 */
public abstract class TipoSala {

    private Usuario administrador;
    private ArrayList<Usuario> moderadores;
    private ArrayList<Usuario> miembros;
    private String titulo;
    private String descripcion;
    private String mensajeBienvenida;
    private int tamaño;
    private String contraseña;

    public TipoSala(Usuario administrador, String titulo, String descripcion, int tamaño) {
        this.administrador = administrador;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.moderadores = new ArrayList<>();
        this.miembros = new ArrayList<>();
    }

    public String getMensajeBienvenida() {
        return mensajeBienvenida;
    }

    public void setMensajeBienvenida(String mensajeBienvenida) {
        this.mensajeBienvenida = mensajeBienvenida;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Usuario> getModeradores() {
        return moderadores;
    }

    public void setModeradores(ArrayList<Usuario> moderadores) {
        this.moderadores = moderadores;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void suscribirse(Usuario usuario) {
        //Solo suscribirse si el tamaño es el adecuado
        if (miembros.size() < this.tamaño) {
            if (!miembros.contains(usuario)) {
                miembros.add(usuario);
                System.out.print(usuario.getApodo() + " a la Sala: " + this.getTitulo() + "\n");
            }
        } else {
            System.out.println("La sala " + this.titulo + " ha alcanzado el límite de usuarios");
        }
    }

    public void desuscribirse(Usuario usuario) {
        if (miembros.remove(usuario)) {
            System.out.print(usuario.getApodo() + " de la Sala: " + this.getTitulo() + "\n");
        } else {
            System.out.println("El usuario no existe en la sala \n");
        }

    }

    public void quitarModerador(Usuario usuario) {
        if (moderadores.contains(usuario)) {
            moderadores.remove(usuario);
        }
    }

    public void añadirModerador(Usuario usuario) {
        if (!moderadores.contains(usuario)) {
            moderadores.add(usuario);
        }
    }

}
