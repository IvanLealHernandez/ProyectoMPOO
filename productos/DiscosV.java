/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.Arrays;

/**
 * Calse que modela discos de video y herade de Discos
 * @author Leal Hernandez Haziel Ivan
 */
public class DiscosV extends Discos{
    
      /**
 * Atrubutos de la clase
 */
    private float[] duracion;

     /**
 * Constructor vacio
 */
    public DiscosV() {
    }

         /**
 * Constructor con argumentos
 * @param duracion
 * @param artista
 * @param numCanciones
 * @param canciones
 * @param nombre
 * @param codBarras
 * @param precio
 * @param cantidad
 */
    public DiscosV(float[] duracion, String artista, int numCanciones, String[] canciones, String nombre, int codBarras, float precio, int cantidad) {
        super(artista, numCanciones, canciones, nombre, codBarras, precio, cantidad);
        this.duracion = duracion;
    }

     /**
 * Metodo que regresa la duracion
 * @return duracion
 */  
    public float[] getDuracion() {
        return duracion;
    }

         /**
 * Metodo para ingresar la duracion
 * @param duracion
 */ 
    public void setDuracion(float[] duracion) {
        this.duracion = duracion;
    }

             /**
 * Metodo sobreescrito para imprimr info del objeto
 * @return cadena de datos
 */
    @Override
    public String toString() {
        return "DiscosV{" + "duracion=" + Arrays.toString(duracion) + '}';
    }
}
