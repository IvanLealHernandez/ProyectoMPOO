/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 * Clase que modela discos musicales y hereda de Discos
 * @author Leal Hernandez Haziel Ivan
 */
public class DiscosM extends Discos{
    
     /**
 * Constructor vacio
 */
    public DiscosM() {
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
    public DiscosM(String artista, int numCanciones, String[] canciones, String nombre, int codBarras, float precio, int cantidad) {
        super(artista, numCanciones, canciones, nombre, codBarras, precio, cantidad);
    }

             /**
 * Metodo sobreescrito para imprimr info del objeto
 * @return cadena de datos
 */ 
    @Override
    public String toString() {
        return "DiscosM{" + '}';
    }
}
