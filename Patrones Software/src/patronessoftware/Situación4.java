/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronessoftware;

import Interprete.*;
import Sala.*;
import Usuarios.*;
import java.io.IOException;

/**
 *
 * @author Zamar
 */
public class Situación4 {
    //Cambiamos sala privada a publcia en ejecucion
  public static void main(String[] args) throws IOException {
        // Creamos un usuario estandar.
        Usuario user1 = FactoriaUsuario.crearUsuario("1","Sergio",false);
        
        // Creamos un usuario estándar.
        Usuario user2 = FactoriaUsuario.crearUsuario("2","A",false);
        
        // Creamos un usuario estándar.
        Usuario user3 = FactoriaUsuario.crearUsuario("3","B",false);
        //Se crea sala de 10 miembros con nombre "Sala Guay" y administrador local user1
        //Es privada con contraseña ee
        Sala sala = FactoriaSala.crearSala(user1,"Sala Guay","Esta es una sala guay", 10, "ee");
       //No pueden
        sala.suscribirse(user2);
        sala.suscribirse(user3);
        //Decorator, ahora tiene funcionalidad publica y no pide contraseña
        sala= new SalaPublica((SalaPrivadaContraseña) sala);
        //Ahora si pueden
        sala.suscribirse(user2);
        sala.suscribirse(user3);
        Parser.interpretar(sala, user1, "¿A quién llega este mensaje?");
        

         
        
        
  }
  }
