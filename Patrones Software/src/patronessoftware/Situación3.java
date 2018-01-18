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
public class Situación3 {
    //admin ejecuta un comando y se arrepiente
  public static void main(String[] args) throws IOException {
        // Creamos un usuario estandar.
        Usuario user1 = FactoriaUsuario.crearUsuario("1","Sergio",false);
        
        // Creamos un usuario estándar.
        Usuario user2 = FactoriaUsuario.crearUsuario("2","A",false);
        
        // Creamos un usuario estándar.
        Usuario user3 = FactoriaUsuario.crearUsuario("3","B",false);
        //Se crea sala de 10 miembros con nombre "Sala Guay" y administrador local user1
        Sala sala = FactoriaSala.crearSala(user1,"Sala Guay","Esta es una sala guay", 10, "");
       
        sala.suscribirse(user2);

        sala.suscribirse(user3);
        //Echamos al usuario B con admin local
        user1.echarUsuario(sala, user3);
        //Nos arrepentimos
        user1.deshacerUltimaAccion();
        //Le llega bien el mensaje
        Parser.interpretar(sala, user1, "¿A quién llega este mensaje?");

         
        
        
  }
  }
