/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author josep
 */
public class Usuario extends UsuarioBase{
    
    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String password) {
        super(id, nombreUsuario, password);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    @Override
    public String getPassword() {
        return super.getPassword(); 
    }

    @Override
    public void setNombreUsuario(String nombreUsuario) {
        super.setNombreUsuario(nombreUsuario); 
    }

    @Override
    public String getNombreUsuario() {
        return super.getNombreUsuario(); 
    }

    @Override
    public void setId(int id) {
        super.setId(id); 
    }

    @Override
    public int getId() {
        return super.getId(); 
    }
    
    
}
