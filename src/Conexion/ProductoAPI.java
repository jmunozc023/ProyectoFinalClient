/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Pojo.Producto;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josep
 */
public class ProductoAPI {
    private CallRest rest;
    private String Url= "http://DESKTOP-TPILMOU:8080/webresources/producto";
    
    public ProductoAPI(){
        rest= new CallRest();
    }
    public String getProducto(String nombreUsuario, String categoria, int id, String articulo, int costoUnitario, int cantidad ){
        try {
            var result= rest.get(Url+"?u=" + nombreUsuario+ "&cat=" + categoria+ "&n="+ articulo+"&c="+costoUnitario+"&ca"+cantidad);
            return result;
        } catch (IOException ex) {
            Logger.getLogger(ProductoAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
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
