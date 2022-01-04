/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEnlazada;

/**
 *
 * @author HP
 */
public class PruebaArticulo {

    public static void main(String[] args) {
        
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        Articulo a = new Articulo("Pollo a la brasa", 10, 0, "Casa");
        Articulo b = new Articulo("Ropero", 100, 0, "Tienda");
        Articulo c = new Articulo("Escritorio", 80, 1, "Oficina");
        Articulo d = new Articulo("Escritorio", 40, 1, "Oficina");
        
        lista.agregarArticuloInicio(a);
        lista.agregarArticuloFinal(b);
        lista.agregarArticuloInicio(c);
        lista.agregarArticuloInicio(d);

        System.out.println("LISTADO DE ARTICULOS");
        lista.mostrarArticulos();
        System.out.println("============================");
        System.out.println("Cantidad articulos sin stock : "+lista.stock());
        System.out.println("============================");
        System.out.println("Suma de precios tipo Oficina : "+lista.SumaPrecioOficina());
        System.out.println("============================");
        System.out.println("Cantidad de articulos tipo Casa y Tienda: "+lista.cantidadTipoCasaTienda());
        System.out.println("============================");
        System.out.println("Listado incremento del 5%  para precio < 99.9");
        lista.incrementar();
        lista.mostrarArticulos();
    }

}
