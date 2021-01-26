/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 * Clase que modela un MP3
 * @author Leal Hernandez Haziel Ivan
 */
public class MP3 extends Productos{
    
     /**
 * Atrubutos de la clase
 */
     private String modelo;
    private String color;
    private int capacidad;

     /**
 * Constructor vacio
 */
    public MP3() {
    }

         /**
 * Constructor con argumentos
 * @param modelo
 * @param color
 * @param capacidad
 * @param nombre
 * @param codBarras
 * @param precio
 * @param cantidad
 */
    public MP3(String modelo, String color, int capacidad, String nombre, int codBarras, double precio, int cantidad) {
        super(nombre, codBarras, precio, cantidad);
        this.modelo = modelo;
        this.color = color;
        this.capacidad = capacidad;
    }

     /**
 * Metodo que regresa modelo
 * @return color
 */ 
    public String getModelo() {
        return modelo;
    }

         /**
 * Metodo que para ingresar la marca
 * @param modelo
 */ 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

     /**
 * Metodo que regresa el color
 * @return color
 */ 
    public String getColor() {
        return color;
    }

         /**
 * Metodo que para ingresar el color
 * @param color
 */ 
    public void setColor(String color) {
        this.color = color;
    }

     /**
 * Metodo que regresa la capaciad
 * @return capacidad
 */ 
    public int getCapacidad() {
        return capacidad;
    }

         /**
 * Metodo que para ingresar la capacidad
     * @param capacidad
 */ 
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

             /**
 * Metodo sobreescrito para imprimr info del objeto
 * @return cadena de datos
 */
    @Override
    public String toString() {
        return "MP3{" + "modelo=" + modelo + ", color=" + color + ", capacidad=" + capacidad + '}';
    }
}
