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
public class Situación2 {
    //A y B intentan enviarse un mensaje directo. A intenta hablar por B desde sala 1 cuando B no esta suscrito. 
  public static void main(String[] args) throws IOException {
        // Creamos un usuario estandar.
        Usuario user1 = FactoriaUsuario.crearUsuario("1","Sergio",false);
        
        // Creamos un usuario estándar.
        Usuario user2 = FactoriaUsuario.crearUsuario("2","A",false);
        
        // Creamos un usuario estándar.
        Usuario user3 = FactoriaUsuario.crearUsuario("3","B",false);
        //Se crea sala de 10 miembros con nombre "Sala Guay" y administrador local user1
        Sala sala = FactoriaSala.crearSala(user1,"Sala Guay","Esta es una sala guay", 10, "");
        
        //Solucion crear sala de dos persoans con prototype. 
        Sala saladirecta = CreadorSalaMensajeDirecto.getInstancia().crearSalaMensajeDirecto(user2, user3);
        sala.procesarInput("Hola B!", user1);
        //Se suscriben usuario A a sala
        sala.suscribirse(user2);
       //No lo recibe
        Parser.interpretar(sala, user2,"/susurro B hola que tal");
        
        Parser.interpretar(sala, user1, "¿A quién llega este mensaje?");
        sala.suscribirse(user3);
        //Lo recibe porque está en la sala
        Parser.interpretar(sala, user2,"/susurro B hola que tal");
        
         
        
        
  }
  }
