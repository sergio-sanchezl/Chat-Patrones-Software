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
public class Situación1 {
    //Sala, con 3 usuarios, Primero 1 administrador local y 2 usuarios estandar A Y B. A INTENTA ECHAR a B. Administrador hace moderador a A, A intenta echar a B.
    // Por ultimo A intentará echar a "Sergio" el administrador local, no puede, "Sergio" puede echar a "A" un moderador.
  public static void main(String[] args) throws IOException {
        // Creamos un usuario estandar.
        Usuario user1 = FactoriaUsuario.crearUsuario("1","Sergio",false);
        
        // Creamos un usuario estándar.
        Usuario user2 = FactoriaUsuario.crearUsuario("2","A",false);
        
        // Creamos un usuario estándar.
        Usuario user3 = FactoriaUsuario.crearUsuario("3","B",false);
        //Se crea sala de 10 miembros con nombre "Sala Guay" y administrador local user1
        Sala sala = FactoriaSala.crearSala(user1,"Sala Guay","Esta es una sala guay", 10, "");
        
        //Se suscriben usuario A y B 
        sala.suscribirse(user3);
        sala.suscribirse(user2);
        
        Parser.interpretar(sala, user1, "¿A quién llega este mensaje?");
        //Usuario Estandar intenta echar a usuario Estandar -> Aparece "No tienes poderes en esta sala"
        Parser.interpretar(sala, user2, "/echar B");
 
        Parser.interpretar(sala, user1, "/hacermoderador A");
               //Usuario Moderador intenta echar a usuario Estandar -> Aparece Expulsado....
        Parser.interpretar(sala, user2, "/echar B");
       
        Parser.interpretar(sala, user1, "¿A quién llega este mensaje?");
        //Moderador intenta echar a administrador local
        Parser.interpretar(sala, user2, "/echar Sergio");
        //Administrador local intenta echar a moderador
        Parser.interpretar(sala, user1, "/echar A");
        //Administrador local lo echa y está solo.
        Parser.interpretar(sala, user1, "¿A quién llega este mensaje?");
         
        
        
  }
  }
