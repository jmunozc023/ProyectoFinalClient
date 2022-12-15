/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author josep
 */
public abstract class productoBase { //Clase Abstract para el producto
    //declaracion de las variables
    private int id;
    private String articulo;
    private int costoUnitario;
    private int cantidad;
    //constructores vacio y de la clase
    public productoBase() {
    }

    public productoBase(int id, String articulo, int costoUnitario, int cantidad) {
        this.id = id;
        this.articulo = articulo;
        this.costoUnitario = costoUnitario;
        this.cantidad = cantidad;
    }
    //Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(int costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
