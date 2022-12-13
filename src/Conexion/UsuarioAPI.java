/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Pojo.Usuario;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josep
 */
public class UsuarioAPI {
    private CallRest rest;
    private String Url= "http://DESKTOP-TPILMOU:8080/webresources/login";
    
    public UsuarioAPI(){
        rest= new CallRest();
    }
    public String getUsuario(String nombreUsuario, String password){
        try {
            var resultado= rest.get(Url+"?u=" + nombreUsuario + "&p=" + password);
        } catch (IOException ex) {
            Logger.getLogger(UsuarioAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
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
