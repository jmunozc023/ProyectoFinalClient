/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Pojo.Producto; //import para poder acceder a los objetos POJO del producto
import com.google.gson.Gson; //import de la libreria GSON para convertir de JSON o desde JSON
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josep
 */
public class ProductoAPI { //API para generar las conexiones entre el cliente y el servidor REST
    private CallRest rest;
    private String Url= "http://DESKTOP-A4A90A2:8080/webresources/productos"; //Variable del URL *** importante modificarla dependiendo de la computadora que se este usando
    
    public ProductoAPI(){
        rest= new CallRest();
    }
    //Metodo para utilizar el recurso de GET de REST
    public String getProducto(String nombreUsuario, String categoria, int id, String articulo, int costoUnitario, int cantidad ){
        try {
            var result= rest.get(Url+"?u=" + nombreUsuario+ "&cat=" + categoria+ "&n="+ articulo+"&c="+costoUnitario+"&ca"+cantidad);
            return result;
        } catch (IOException ex) {
            Logger.getLogger(ProductoAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    //Metodo para utilizar el recurso de POST de REST
    public String ingresarProducto(Producto product){
        try {
            var result= rest.post(Url, new Gson().toJson(product));
            return result;
        } catch (IOException ex) {
            Logger.getLogger(ProductoAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
  
}
