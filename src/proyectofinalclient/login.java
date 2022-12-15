/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalclient;

import Conexion.UsuarioAPI; //Import para obtener las herramientas del API para el usuario
import Pojo.Usuario; //Import para acceder al Objeto POJO de Usuario
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class login { //Clase Login del CLiente
    //Declaracion de variables para el scanner y para instanciar el API.
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner1 = new Scanner(System.in);
    public UsuarioAPI api = new UsuarioAPI();
    public static String usuarioActual; //Variable para almacenar el Usuario que esta haciendo uso de la app
    facturacion fact= new facturacion();

    public login() {
    }
    public void logmenu() {
        //Creamos el menu de Login
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
            //Obtenemos la variable del teclado para ingresar al Switch en la opcion correspondiente
            switch (option) {
                case 1:
                    registro();
                    break;
                case 2:
                    comprobacion();
            }
        }

    }

    public login registro() { //Realiza el ingreso de nuevos usuarios al sistema
        System.out.println("Ingrese el Usuario");
        String user = scanner.next();
        System.out.println("Ingrese el password");
        String pass = scanner.next();
        var registro = new Usuario(0, user, pass);
        api.registrarUsuario(registro);
        usuarioActual= user; //Actualiza el Usuario que usa la app
        fact.facmenu(); //Una vez ingresado el usuario le permite acceder al contenido
        return null;
    }
    public login comprobacion() { //Realiza una comprobacion de usuario y contraseña para dar acceso al sistema
        System.out.println("Ingrese el Usuario");
        String user = scanner.next();
        System.out.println("Ingrese el password");
        String pass = scanner.next();
        var comp= api.getUsuario(user, pass);
        if (comp.contains(user)&& comp.contains(pass)) {
            System.out.println("Autenticado");
            usuarioActual= user; //Almacena el usuario actual
            fact.facmenu();//Redirige al menu de facturacion
        } else {
            System.out.println("Usuario o contraseña incorrecto");
        }
        
        return null;
    }

}
