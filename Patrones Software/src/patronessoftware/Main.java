/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronessoftware;

import Sala.FactoriaSala;
import Sala.Sala;
import Usuarios.FactoriaUsuario;
import Usuarios.Usuario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Zamar
 */
public class Main {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        Map<String,Usuario> conectados = new HashMap<>();
        Map<String,Sala> salas = new HashMap<>();
        String comando;
        String usuario;
        String admin;
        String linea;
        String resultadolinea[];
        String nombresala;
        String descripcionsala;
        String poder;
        String receptor;
        int maximo;
        Usuario user1 = FactoriaUsuario.crearUsuario("1","Sergio",true);
        conectados.put("Sergio", user1);
        Sala sala1 = FactoriaSala.crearSala(user1,"Guay","Esta es una sala guay", 10,"ee");
        sala1.suscribirse(user1);
         salas.put("Guay", sala1);
        int contadorusuario=0;
        Usuario user=null;
        boolean salir = false;
        boolean salirusuario = false;
        while(!salir){
           System.out.println("/User usuario a|u' o 9 para salir");
           linea= input.readLine();
           resultadolinea = linea.split("\\s+");
           if (linea.equalsIgnoreCase("9")){
               salir=true;
            }
             else{

                if(resultadolinea[0].substring(1).equalsIgnoreCase("user")){
                   usuario = resultadolinea[1];
                   admin = resultadolinea[2];
                   
                   switch(admin){
                       case "a":{
                            if(!conectados.containsKey(usuario)){
                           contadorusuario++;
                                user= FactoriaUsuario.crearUsuario(Integer.toString(contadorusuario),usuario,true);
                           conectados.put(usuario, user);
                            }
                            else{
                                user = conectados.get(usuario);
                            }
                            break;
                       }
                       case "u":{
                          if(!conectados.containsKey(usuario)){
                           contadorusuario++;
                                user= FactoriaUsuario.crearUsuario(Integer.toString(contadorusuario),usuario,false);
                           conectados.put(usuario, user);
                            }
                            else{
                                user = conectados.get(usuario);
                            }
                          break;
                       }
                   }
                 salirusuario = false;
                 while(!salirusuario){
                     System.out.println("Nombre de la sala a afectar, si no existe se te pide crear | 9 para salir");
                     nombresala= input.readLine();      
                      if (nombresala.equalsIgnoreCase("9")){
                        salirusuario=true;
                     }
                      else{
                          if(salas.containsKey(nombresala)){ //Si la sala existe
                             //Si no es miembro de la sala intentamos que se suscriba
                            if(!salas.get(nombresala).getMiembros().contains(user)){
                                if(salas.get(nombresala).tieneContraseña()){ // si es privada le decimos que meta contraseña
                                    System.out.println("No estás suscrito a la sala y tiene contraseña");
                                    String contraseña= input.readLine();
                                    salas.get(nombresala).suscribirse(user, contraseña);
                              }else{
                                    salas.get(nombresala).suscribirse(user);
                                }
                             }
                          System.out.println("Comandos: \n/hacermoderador 'usuario' | /quitarmoderador 'usuario' | /cambiarnombre 'nombre' \n"
                                  + " | /cambiardescripcion 'nombre' | /echar 'usuario' | mensaje usuario");
                          comando= input.readLine();
                          salas.get(nombresala).procesarInput(comando, user);
                          }
                          else{
                            System.out.println("Descripcion la sala a crear");
                            descripcionsala= input.readLine();
                            System.out.println("Maximo numero miembros");
                            maximo=Integer.parseInt(input.readLine());
                            System.out.println("Contraseña si quieres");
                            String contraseña = input.readLine();
                            Sala sala = FactoriaSala.crearSala(user,nombresala,descripcionsala,maximo,contraseña);       
                            salas.put(nombresala, sala);
                          }
                      }
                      
                      /*else if(linea.equalsIgnoreCase("/crear")){
                          System.out.println("Nombre de la sala a crear");
                          nombresala= input.readLine();
                          System.out.println("Descripcion la sala a crear");
                          descripcionsala= input.readLine();
                          System.out.println("Maximo numero miembros");
                          maximo=Integer.parseInt(input.readLine());
                          System.out.println("Contraseña si quieres");
                          String contraseña = input.readLine();
                          if(!salas.containsKey(nombresala)){
                            Sala sala = FactoriaSala.crearSala(user,nombresala,descripcionsala,maximo,contraseña);       
                            salas.put(nombresala, sala);
                          }
                            else System.out.println("Ya existe ese nombre de sala");
                      }
                      else if(resultadolinea[0].substring(1).equals("echar")){
                          System.out.println("Nombre de la sala en la que echar");
                          nombresala= input.readLine();
                          System.out.println("Miembro que quieres echar");
                          receptor=input.readLine();
                          salas.get(/
                          user.echarUsuario(salas.get(nombresala), conectados.get(receptor));
                      }else if(resultadolinea[0].substring(1).equals("poder")){
                          
                      }else if(resultadolinea[0].substring(1).equals("mensaje")){
                          System.out.println("Nombre de la sala a la que enviar el mensaje");
                          nombresala= input.readLine();
                          System.out.println("Miembro que quieres echar");
                          receptor=input.readLine();
                          user.enviarMensaje(resultadolinea[1],salas.get(resultadolinea[2]));
                 }*/
              }
              
              
              
           }
           
           
          
           
           
            
            
            
            
        }
    /*   // Creamos un Administrador.
        Usuario user1 = FactoriaUsuario.crearUsuario("1","Sergio",true);
        
        // Creamos un usuario estándar.
        Usuario user2 = FactoriaUsuario.crearUsuario("2","Tony",false);
        
        // Creamos un usuario estándar.
        Usuario user3 = FactoriaUsuario.crearUsuario("3","Salvatore",false);
        
        // Creamos una sala publica ya que la contraseña es "", vacía.
        Sala sala = FactoriaSala.crearSala(user1,"Sala Guay","Esta es una sala guay", 10, "");
        Sala salaotra = sala;
           System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sala)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(salaotra)));
        user2.suscribirse(sala);
        user3.suscribirse(sala);
        
        user3.enviarMensaje("Holaaaa", sala);
        user2.echarUsuario(sala, user3); //Intentar echar con usuario normal
        user1.echarUsuario(sala, user3); //Intentar echar con admin
        user1.enviarMensaje("Hello!", sala);
        user2.enviarSusurro("Susurrito", sala, user1);
        user1.deshacerUltimaAccion(); //Con Command es muy facil deshacer la ultima accion
        
        user1.echarUsuario(sala, user3);
        */
        
            
    }
    
}
}