/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 * Clase que modela un pendrive y herda de Productos 
 * @author Leal Hernandez Haziel Ivan
 */
public class USB extends Productos{

      /**
 * Atrubutos de la clase 
 */
    private String marca;
    private String color;

     /**
 * Constructor vacio
 */
    public USB() {
    }

       /**
 * Constructor con argumentos
 * @param marca
 * @param color
 * @param codBarras
 * @param nombre
 * @param precio
 * @param cantidad
 */
    public USB(String marca, String color, String nombre, int codBarras, double precio, int cantidad) {
        super(nombre, codBarras, precio, cantidad);
        this.marca = marca;
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
 * Metodo sobreescrito para imprimr info del objeto
 * @return cadena de datos
 */
    @Override
    public String toString() {
        return "USB{" + "marca=" + marca + ", color=" + color + '}';
    }
}
