/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 * Clase que modela udifionos y hereda de productos
 * @author Leal Hernandez Haziel Ivan
 */
public class Audifonos extends Productos{

  /**
 * Atrubutos de la clase Audifonos
 */
    private String color;
    private String marca;

 /**
 * Constructor vacio
 */
    public Audifonos() {
    }

     /**
 * Constructor con argumentos
 * @param color
 * @param marca
 * @param nombre
 * @param codBarras
 * @param precio
 * @param cantidad
 */
    public Audifonos(String color, String marca, String nombre, int codBarras, float precio, int cantidad) {
        super(nombre, codBarras, precio, cantidad);
        this.color = color;
        this.marca = marca;
    }

 /**
 * Metodo que regresa el color
 * @return color
 */  
    public String getColor() {
        return color;
    }
     /**
 * Metodo para ingresar el color
 * @param color
 */ 
    public void setColor(String color) {
        this.color = color;
    }

     /**
 * Metodo que regresa la marca
 * @return marca
 */ 
    public String getMarca() {
        return marca;
    }

     /**
 * Metodo para ingresar la marca
 * @param marca
 */ 
    public void setMarca(String marca) {
        this.marca = marca;
    }

         /**
 * Metodo sobreescrito para imprimr info del objeto
 * @return cadena de datos
 */ 
    @Override
    public String toString() {
        return "Audifonos{" + "color=" + color + ", marca=" + marca + '}';
    }
}
