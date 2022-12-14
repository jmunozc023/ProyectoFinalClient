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
public class login extends loginBase {

    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner1 = new Scanner(System.in);
    public UsuarioAPI api = new UsuarioAPI();

    public login() {
    }

    public login(int id, String nombreUsuario, String password) {
        super(id, nombreUsuario, password);
    }

    public void logmenu() {
        
        var option=0;
        while (option != 3) {
            System.out.println("*********** Bienvenido a CompuSourse***********");
            System.out.println("*           Registrese en el sistema          *");
            System.out.println("* 1. Registro nuevo                           *");
            System.out.println("* 2. LOGIN                                    *");
            System.out.println("* 3. Salir                                    *");
            System.out.println("***********************************************");
            System.out.print("Seleccione una opcion: ");
            option = scanner1.nextInt();
            switch (option) {
                case 1:
                    registro();
                    break;
                case 2:
                    comprobacion();
            }
        }

    }

    public login registro() {
        System.out.println("Ingrese el Usuario");
        String user = scanner.next();
        System.out.println("Ingrese el password");
        String pass = scanner.next();
        var registro = new Usuario(0, user, pass);
        api.registrarUsuario(registro);
        System.out.println(api.getUsuario(user, pass));
        return null;
    }
    public login comprobacion() {
        System.out.println("Ingrese el Usuario");
        String user = scanner.next();
        System.out.println("Ingrese el password");
        String pass = scanner.next();
        System.out.println(api.getUsuario(user, pass));
        var comp= api.getUsuario(user, pass);
        if (comp.contains(user)&& comp.contains(pass)) {
            System.out.println("Autenticado");
        } else {
            System.out.println("Usuario o contraseña incorrecto");
        }
        
        return null;
    }

}
