/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author josep
 */
public enum Categorias {
    tarjMad("Tarjeta Madre"),memRam("Memoria RAM"),moni("Monitor"), fPoder("Fuente de Poder"),
    dDuro("Disco Duro"), mouse("Mouse"), teclado("teclado");
    private String articulo;
    private Categorias(final String articulo){
        this.articulo= articulo;
    }
    public String getCat(){
        if (this.equals(tarjMad)) {
            return articulo;
        } else if (this.equals(memRam)) {
            return articulo;
        } else if (this.equals(moni)) {
            return articulo;
        } else if (this.equals(fPoder)) {
            return articulo;
        } else if (this.equals(dDuro)) {
            return articulo;
        }else if (this.equals(mouse)) {
            return articulo;
        }else if (this.equals(teclado)) {
            return articulo;
        }
    return articulo;
    }
}
