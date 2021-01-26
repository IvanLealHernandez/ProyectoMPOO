/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class Productos {

    private String nombre;
    private int codBarras;
    private double precio;
    private int cantidad;

    public Productos() {
    }

    public Productos(String nombre, int codBarras, double precio, int cantidad) {
        this.nombre = nombre;
        this.codBarras = codBarras;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", codBarras=" + codBarras + ", precio=" + precio + '}';
    }
}
