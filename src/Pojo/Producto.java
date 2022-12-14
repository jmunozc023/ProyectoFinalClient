/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author josep
 */
public class Producto extends productoBase{
    private String nombreUsuario;
    private String categoria;

    public Producto(String usuarioActual, Categorias tarjMad, int par, String art, int option1, int option11) {
    }

    public Producto(String nombreUsuario, String categoria, int id, String articulo, int costoUnitario, int cantidad) {
        super(id, articulo, costoUnitario, cantidad);
        this.nombreUsuario = nombreUsuario;
        this.categoria = categoria;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(cantidad); 
    }

    @Override
    public int getCantidad() {
        return super.getCantidad(); 
    }

    @Override
    public void setCostoUnitario(int costoUnitario) {
        super.setCostoUnitario(costoUnitario); 
    }

    @Override
    public int getCostoUnitario() {
        return super.getCostoUnitario(); 
    }

    @Override
    public void setArticulo(String articulo) {
        super.setArticulo(articulo); 
    }

    @Override
    public String getArticulo() {
        return super.getArticulo(); 
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

