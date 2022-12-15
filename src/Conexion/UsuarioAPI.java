/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Pojo.Usuario; //import para poder acceder a los objetos POJO del usuario
import com.google.gson.Gson; //import de la libreria GSON para convertir de JSON o desde JSON
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josep
 */
public class UsuarioAPI { //API para generar las conexiones entre el cliente y el servidor REST
    private CallRest rest;
    private String Url= "http://DESKTOP-TPILMOU:8080/webresources/login";
    
    public UsuarioAPI(){
        rest= new CallRest();
    }
    //Metodo para utilizar el recurso de GET de REST
    public String getUsuario(String nombreUsuario, String password){
        try {
            var result= rest.get(Url+"?u=" + nombreUsuario + "&p=" + password);
            return result;
        } catch (IOException ex) {
            Logger.getLogger(UsuarioAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    //Metodo para utilizar el recurso de POST de REST
    public String registrarUsuario(Usuario user){
        try {
            var result= rest.post(Url, new Gson().toJson(user));
            return result;
        } catch (IOException ex) {
            Logger.getLogger(UsuarioAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
}
