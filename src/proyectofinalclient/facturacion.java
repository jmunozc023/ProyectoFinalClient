/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalclient;

import Conexion.ProductoAPI; //import para acceder a las herramientas del API para el producto
import Pojo.Producto; //Acceso a los objetos POJO del producto
import Pojo.Categorias; //Acceso a las categorias de productos
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class facturacion {
    //Declaracion de variables Scanner y constructor del API
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner1 = new Scanner(System.in);
    public ProductoAPI api = new ProductoAPI();

    public facturacion() {
    }

    public void facmenu() {
        //Creamos el menu principal
        var option = 0;
        while (option != 8) {
            System.out.println("*********** Bienvenido a CompuSource***********");
            System.out.println("*                Menu principal               *");
            System.out.println("* 1. Compra                                   *");
            System.out.println("* 2. Facturacion                              *");
            System.out.println("* 8. Salir                                    *");
            System.out.println("***********************************************");
            System.out.print("Seleccione una opcion: ");
            option = scanner1.nextInt();
            //Switch que dirige hacia las categorias
            switch (option) {
                case 1:
                    var option1 = 0;
                    System.out.println("**************** Menu de compra****************");
                    System.out.println("*          Seleccione una categoria           *");
                    System.out.println("* 1. Tarjetas Madre                           *");
                    System.out.println("* 2. Memorias RAM                             *");
                    System.out.println("* 3. Monitores                                *");
                    System.out.println("* 4. Fuentes de poder                         *");
                    System.out.println("* 5. Discos Duros                             *");
                    System.out.println("* 6. Mouse                                    *");
                    System.out.println("* 7. Teclado                                  *");
                    System.out.println("* 8. Salir                                    *");
                    System.out.println("***********************************************");
                    System.out.print("Seleccione una opcion: ");
                    option1 = scanner1.nextInt();
                    //Switch para obtener los datos del cliente y enviar el request POST al servidor
                    switch (option1) {
                        case 1:
                            System.out.print("Ingrese la marca y modelo de la tarjeta Madre: ");
                            var art = scanner.next();
                            System.out.print("Ingrese el precio: ");
                            var price = scanner.nextInt();
                            System.out.print("Ingrese la cantidad: ");
                            var cant = scanner.nextInt();
                            var U = login.usuarioActual;
                            var ca = Categorias.tarjMad.toString();
                            var ingreso = new Producto(U, ca, 0, art, price, cant);
                            api.ingresarProducto(ingreso);
                            break;
                        case 2:
                            System.out.print("Ingrese la marca y modelo de la Memoria RAM: ");
                            art = scanner.next();
                            System.out.print("Ingrese el precio: ");
                            price = scanner.nextInt();
                            System.out.print("Ingrese la cantidad: ");
                            cant = scanner.nextInt();
                            U = login.usuarioActual;
                            ca = Categorias.memRam.toString();
                            ingreso = new Producto(U, ca, 0, art, price, cant);
                            api.ingresarProducto(ingreso);
                            break;
                        case 3:
                            System.out.print("Ingrese la marca y modelo del Monitor: ");
                            art = scanner.next();
                            System.out.print("Ingrese el precio: ");
                            price = scanner.nextInt();
                            System.out.print("Ingrese la cantidad: ");
                            cant = scanner.nextInt();
                            U = login.usuarioActual;
                            ca = Categorias.moni.toString();
                            ingreso = new Producto(U, ca, 0, art, price, cant);
                            api.ingresarProducto(ingreso);
                            break;
                        case 4:
                            System.out.print("Ingrese la marca y modelo de la Fuente de poder: ");
                            art = scanner.next();
                            System.out.print("Ingrese el precio: ");
                            price = scanner.nextInt();
                            System.out.print("Ingrese la cantidad: ");
                            cant = scanner.nextInt();
                            U = login.usuarioActual;
                            ca = Categorias.fPoder.toString();
                            ingreso = new Producto(U, ca, 0, art, price, cant);
                            api.ingresarProducto(ingreso);
                            break;
                        case 5:
                            System.out.print("Ingrese la marca y modelo del Disco Duro: ");
                            art = scanner.next();
                            System.out.print("Ingrese el precio: ");
                            price = scanner.nextInt();
                            System.out.print("Ingrese la cantidad: ");
                            cant = scanner.nextInt();
                            U = login.usuarioActual;
                            ca = Categorias.dDuro.toString();
                            ingreso = new Producto(U, ca, 0, art, price, cant);
                            api.ingresarProducto(ingreso);
                            break;
                        case 6:
                            System.out.print("Ingrese la marca y modelo del Mouse: ");
                            art = scanner.next();
                            System.out.print("Ingrese el precio: ");
                            price = scanner.nextInt();
                            System.out.print("Ingrese la cantidad: ");
                            cant = scanner.nextInt();
                            U = login.usuarioActual;
                            ca = Categorias.mouse.toString();
                            ingreso = new Producto(U, ca, 0, art, price, cant);
                            api.ingresarProducto(ingreso);
                            break;
                        case 7:
                            System.out.print("Ingrese la marca y modelo del Teclado: ");
                            art = scanner.next();
                            System.out.print("Ingrese el precio: ");
                            price = scanner.nextInt();
                            System.out.print("Ingrese la cantidad: ");
                            cant = scanner.nextInt();
                            U = login.usuarioActual;
                            ca = Categorias.teclado.toString();
                            ingreso = new Producto(U, ca, 0, art, price, cant);
                            api.ingresarProducto(ingreso);
                            break;
                    }
                case 2:
                    System.out.println("************* Menu de facturacion**************");
                    System.out.println("*            Seleccione una opcion            *");
                    System.out.println("* 1. Facturar                                 *");
                    System.out.println("* 2. Salir                                    *");
                    System.out.println("***********************************************");
                    System.out.print("Seleccione una opcion: ");
                    option1 = scanner1.nextInt();
                    switch (option1) {
                        case 1:

                            break;
                        
                    }
                    break;
            }
        }
    }
}
