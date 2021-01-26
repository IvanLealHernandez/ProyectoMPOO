/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 * Clas que modela un cargador de celular y hereda de Productos
 * @author Leal Hernandez Haziel Ivan
 */
public class cargadoresCelular extends Productos {

      /**
 * Atrubutos de la clase
 */
    private String marca;
    private String tipoCelular;
    private String color;

     /**
 * Constructor vacio
 */ 
    public cargadoresCelular() {
    }

         /**
 * Constructor con argumentos
 * @param marca
 * @param tipoCelular
 * @param color
 * @param nombre
 * @param codBarras
 * @param precio
 * @param cantidad
 */
    public cargadoresCelular(String marca, String tipoCelular, String color, String nombre, int codBarras, double precio, int cantidad) {
        super(nombre, codBarras, precio, cantidad);
        this.marca = marca;
        this.tipoCelular = tipoCelular;
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
 * Metodo que para ingresar la marca
 * @param marca
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }

     /**
 * Metodo que regresa el tipo de celualr
 * @return tipoCelular
 */
    public String getTipoCelular() {
        return tipoCelular;
    }

         /**
 * Metodo que para ingresar el tipo de celular
 * @param tipoCelular
 */
    public void setTipoCelular(String tipoCelular) {
        this.tipoCelular = tipoCelular;
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
        return "CargadoresCelular{" + "marca=" + marca + ", tipoCelular=" + tipoCelular + ", color=" + color + '}';
    }
}
