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
    private final String articulo;
    private Categorias(final String articulo){
        this.articulo= articulo;
    }
    public String getCat(){
        switch (this) {
            case tarjMad:
                return articulo;
            case memRam:
                return articulo;
            case moni:
                return articulo;
            case fPoder:
                return articulo;
            case dDuro:
                return articulo;
            case mouse:
                return articulo;
            case teclado:
                return articulo;
            default:
                break;
        }
    return articulo;
    }
}
