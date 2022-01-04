/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEnlazada;

/**
 *
 * @author HP
 */
public class ListaEnlazadaSimple {

    private Nodo cabeza;
    private int cantidad;

    public ListaEnlazadaSimple() {
        cabeza = null;
        cantidad = 0;
    }

    //CRUD
    //AGREGAR AL INICIO
    public void agregarArticuloInicio(Articulo articulo) {
        if (cabeza == null) {
            cabeza = new Nodo(articulo);
        } else {
            Nodo nuevo = new Nodo(articulo);
            nuevo.enlazarNodo(cabeza);
            cabeza = nuevo;
        }
        cantidad++;
    }

    //AGREGAR AL FINAL
    public void agregarArticuloFinal(Articulo articulo) {
        if (cabeza == null) {
            cabeza = new Nodo(articulo);
        } else {
            Nodo temp = cabeza;
            while (temp.retornaNodo() != null) {
                temp = temp.retornaNodo();
            }
            Nodo nuevo = new Nodo(articulo);
            temp.enlazarNodo(nuevo);
        }
        cantidad++;
    }

    //AGREGAR EN UNA POSICION DADA
    public void agregarArticuloPos(int index, Articulo articulo) {
        Nodo nuevo = new Nodo(articulo);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            if (index == 0) {
                agregarArticuloInicio(articulo);
            } else {
                Nodo temp = cabeza;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.retornaNodo();
                }
                nuevo.enlazarNodo(temp.retornaNodo());
                temp.enlazarNodo(nuevo);
            }
        }
        cantidad++;
    }

    //ELIMINAR ARTICULO
    public void eliminarArticulo(int pos) {
        if (pos == 0) {
            cabeza = cabeza.retornaNodo();
        } else {
            int contador = 0;
            Nodo temp = cabeza;
            while (contador < pos - 1) {
                temp = temp.retornaNodo();
                contador++;
            }
            temp.enlazarNodo(temp.retornaNodo().retornaNodo());
        }
        cantidad--;
    }

    //MODIFICAR ARTICULO
    public void modificarNodo(Articulo ant, Articulo pos) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (cabeza.getA().equals(ant)) {
                temp.setArticulo(pos);
                break;
            }
            temp = temp.retornaNodo();
        }
    }

    //MOSTRAR ARTICULOS
    public void mostrarArticulos() {
        Nodo n = cabeza;
        while (n != null) {
            System.out.println(n.getA().toString());
            n = n.retornaNodo();
        }
    }

    //OBTENER DATOS DE UN ARTICULO CON UNA POSICION DADA
    public String obtenerArticulo(int pos) {
        int contador = 0;
        Nodo temp = cabeza;

        while (contador < pos) {
            temp = temp.retornaNodo();
            contador++;
        }
        return temp.getA().toString();
    }

    //METODOS A REALIZAR
    //METODO b 
    //b. Cuantos artículos no tienen stock
    public int stock() {
        int cont = 0;
        Nodo n = cabeza;
        String articulos = "Articulos sin Stock\n";
        while (n != null) {
            if (n.getA().getStock() == 0) {
                cont += 1;
            }
            n = n.retornaNodo();
        }
        return cont;
    }

    //METODO c 
    //c. Suma de precio de todos los tipos “Oficina”
    public double SumaPrecioOficina() {
        Nodo n = cabeza;
        double sumaPrecio = 0.0;
        while (n != null) {
            if (n.getA().getTipo().equals("Oficina")) {
                sumaPrecio += n.getA().getPrecio();
            }
            n = n.retornaNodo();
        }
        return sumaPrecio;
    }

    //Metodo d
    //d. Cuantos artículos son de tipo “Casa” y “Tienda”
    public int cantidadTipoCasaTienda() {
        Nodo n = cabeza;
        int cantidad = 0;
        while (n != null) {
            if (n.getA().getTipo().equals("Casa") || n.getA().getTipo().equals("Tienda")) {
                cantidad += 1;
            }
            n = n.retornaNodo();
        }
        return cantidad;
    }

    //Metodo e
    //e. Incrementar en 5% el precio de aquellos que no superen los 99.90
    public void incrementar() {
        Nodo n = cabeza;
        int cantidad = 0;
        while (n != null) {
            if (n.getA().getPrecio() < 99.90) {
                Articulo nuevo = n.getA();
                nuevo.setPrecio(nuevo.getPrecio() * 1.05);
                modificarNodo(n.getA(), nuevo);
            }
            n = n.retornaNodo();
        }
    }
}
