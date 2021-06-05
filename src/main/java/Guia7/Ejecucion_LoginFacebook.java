/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author tanbo
 */
public class Ejecucion_LoginFacebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        String apellidos;
        float edad;
        String email;
        String id_usuario;
        String password;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del usuario :");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese el apellido del usuario :");
        apellidos = teclado.nextLine();
        
        System.out.println("Ingrese la edad :");
        edad = Float.parseFloat(teclado.nextLine());
                
        System.out.println("Ingrese el email :");
        email = teclado.nextLine();
        
        System.out.println("Ingrese id :");
        id_usuario = teclado.nextLine();
        
        System.out.println("Ingrese la contraseña :");
        password = teclado.nextLine();
        
        
        String pass_hash;
        
        pass_hash = encriptar(password);
        
        Login_Facebook registro;
        registro = new Login_Facebook(nombre, apellidos, edad, email, id_usuario, pass_hash);
        
        System.out.println("Los datos de registro son: ");
        System.out.println("Nombre: " + registro.getNombre());
        System.out.println("Apellidos: " + registro.getApellidos());
        System.out.println("Edad: " + registro.getEdad());
        System.out.println("Email: " + registro.getEmail());
        System.out.println("Id: " + registro.getId_usuario());
        System.out.println("Contraseña: " + registro.getPassword());
        
        
        String password_check;
        
        System.out.println("Ingrese la contraseña a verificiar: ");
        password_check = teclado.nextLine();
        
        if(BCrypt.checkpw(password_check, registro.getPassword())){
            System.out.println("La contraseña es correcta");
        }
        
        else {
            System.out.println("La contraseña es incorrecta");
        }
        
    }
    
    public static String encriptar(String pass){
            
            return BCrypt.hashpw(pass, BCrypt.gensalt());
        
        }        
    }
    

