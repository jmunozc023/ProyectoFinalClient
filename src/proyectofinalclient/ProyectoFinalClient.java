/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalclient;

import Conexion.UsuarioAPI;
import Pojo.Usuario;
/**
 *
 * @author josep
 */
public class ProyectoFinalClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var api= new UsuarioAPI();
        var log= new login().registro();
        System.out.println(api.getUsuario("admin", "1234"));
    }
    
}
