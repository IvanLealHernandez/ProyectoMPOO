/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.Arrays;

/**
 * Clase que modela un Disco y hereda de Productos
 * @author Leal Hernandez Haziel Ivan
 */
public class Discos extends Productos{

      /**
 * Atrubutos de la clase
 */
    private String artista;
    private int numCanciones;
    private String[] canciones;

     /**
 * Constructor vacio
 */
    public Discos() {
    }

         /**
 * Constructor con argumentos
 * @param artista
 * @param numCanciones
 * @param canciones
 * @param nombre
 * @param codBarras
 * @param precio
 * @param cantidad
 */
    public Discos(String artista, int numCanciones, String[] canciones, String nombre, int codBarras, double precio, int cantidad) {
        super(nombre, codBarras, precio, cantidad);
        this.artista = artista;
        this.numCanciones = numCanciones;
        this.canciones = canciones;
    }

         /**
 * Metodo que regresa el Artista
 * @return artista
 */
    public String getArtista() {
        return artista;
    }

         /**
 * Metodo que para ingresaf un artista
 * @param artista
 */ 
    public void setArtista(String artista) {
        this.artista = artista;
    }

         /**
 * Metodo que regresa el numero de canciones
 * @return numCanciones
 */
    public int getNumCanciones() {
        return numCanciones;
    }

         /**
 * Metodo para ingresar el numero de canciones
 * @param numCanciones
 */ 
    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

         /**
 * Metodo que regresa la lista de canciones
 * @return canciones
 */
    public String[] getCanciones() {
        return canciones;
    }

  /* * Metodo que inserta una liesta de canciones
 * @param canciones
 */   
    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }

 /* Metodo sobreescrito para imprimr info del objeto
 * @return cadena de datos
 */ 
    @Override
    public String toString() {
        return "Discos{" + "artista=" + artista + ", numCanciones=" + numCanciones + ", canciones=" + Arrays.toString(canciones) + '}';
    }
}
