/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalclient;

import Conexion.ProductoAPI;
import Pojo.Producto;
import Pojo.Categorias;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class facturacion {

    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner1 = new Scanner(System.in);
    public ProductoAPI api = new ProductoAPI();

    public facturacion() {
    }

    public void facmenu() {
        var option = 0;
        while (option != 3) {
            System.out.println("*********** Bienvenido a CompuSourse***********");
            System.out.println("*                Menu principal               *");
            System.out.println("* 1. Compra                                   *");
            System.out.println("* 2. Facturacion                              *");
            System.out.println("* 3. Salir                                    *");
            System.out.println("***********************************************");
            System.out.print("Seleccione una opcion: ");
            option = scanner1.nextInt();
            switch (option) {
                case 1:
                    var option1=0;
                    System.out.println("**************** Menu de compra****************");
                    System.out.println("*          Seleccione una categoria           *");
                    System.out.println("* 1. Tarjetas Madre                           *");
                    System.out.println("* 2. Memorias RAM                             *");
                    System.out.println("* 3. Monitores                                *");
                    System.out.println("* 4. Fuentes de poder                         *");
                    System.out.println("* 5. Discos Duros                             *");
                    System.out.println("* 6. Mouse                                    *");
                    System.out.println("* 7. Teclado                                  *");
                    System.out.println("***********************************************");
                    System.out.print("Seleccione una opcion: ");
                    option1= scanner1.nextInt();
                    switch (option1) {
                        case 1:
                            System.out.print("Ingrese la marca y modelo de la tarjeta Madre: ");
                            var art= scanner.next();
                            System.out.print("Ingrese el precio: ");
                            var price= scanner.nextInt();
                            System.out.print("Ingrese la cantidad: ");
                            var cant= scanner.nextInt();
                            var U= login.usuarioActual.toString();
                            var ca= Categorias.tarjMad.toString();
                            var ingreso= new Producto(U,ca , 0, art, price, cant);
                            /*var ingreso= new Producto(login.usuarioActual, Categorias.tarjMad, 0, art, price, cant);*/
                            api.ingresarProducto(ingreso);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
            }
        }
    }
    public facturacion ingreso(){
        
        return null;
    }

}
