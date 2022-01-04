/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEnlazada;

/**
 *
 * @author HP
 */
public class Nodo {
    private Nodo n;
    private Articulo a;

    public Nodo(Articulo a) {
        this.n = null;
        this.a = a;
    }
    
    public void enlazarNodo(Nodo apuntador){
        setNodo(apuntador);
    }
    
    public Nodo retornaNodo(){
        return n;
    }

    public void setNodo(Nodo n) {
        this.n = n;
    }

    public void setArticulo(Articulo a) {
        this.a = a;
    }

    public Articulo getA() {
        return a;
    }

}
