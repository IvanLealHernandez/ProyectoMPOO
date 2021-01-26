/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 * Calse que modela un abocina y hereda de Productos
 * @author Leal Hernandez Haziel Ivan
 */
public class Bocina extends Productos{

 /**
 * Atrubutos de la clase
 */ 
    private String marca;
    private String color;

     /**
 * Constructor vacio
 */
    public Bocina() {
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
    public Bocina(String marca, String color, String nombre, int codBarras, double precio, int cantidad) {
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
 * Metodo que para ingresar la amrca
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
 * Metodo sobrecargado para imprimr info del objeto
 * @return cadena de datos
 */ 
    @Override
    public String toString() {
        return "Bocina{" + "marca=" + marca + ", color=" + color + ", modelo=" + '}';
    }
}
