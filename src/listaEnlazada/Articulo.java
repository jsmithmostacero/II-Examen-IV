/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEnlazada;

/**
 *
 * @author HP
 */
public class Articulo {
    private String descripcion;
    private double precio;
    private int stock;
    private String tipo;

    public Articulo(String descripcion, double precio, int stock, String tipo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nDescripcion : " + descripcion + "\nPrecio : " 
                + precio + "\nStock : " + stock + "\nTipo : " + tipo;
    }
   
    
}
