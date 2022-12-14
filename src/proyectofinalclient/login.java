/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalclient;

import Conexion.UsuarioAPI;
import Pojo.Usuario;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class login extends loginBase{
    private Scanner scanner= new Scanner(System.in);

    public login() {
    }

    public login(int id, String nombreUsuario, String password) {
        super(id, nombreUsuario, password);
    }
    
    public login registro(){
        System.out.println("Ingrese el Usuario");
        String user = scanner.next();
        System.out.println("Ingrese el password");
        String pass = scanner.next();
        var api= new UsuarioAPI();
        var registro = new Usuario(0, user, pass);
        api.registrarUsuario(registro);
        return null;        
    }
    
}
