/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calse que modela un reproductor de musica
 * @author Leal Hernandez Haziel Ivan
 */
public class Estereo {

   /**
 * Constructor vacio
 */
    public Estereo() {
    }

     /**
 * Método que simula la reproduccion de discos  de la base de datos
 * @param discos
 */
    public void tocarDiscoM(ArrayList<DiscosM> discos) {
        Discos disco = new Discos();
        Scanner reader = new Scanner(System.in);
        int opcion = menu();
        if (opcion == 1) {
            String nombreDisco;
            System.out.println("Ingresa el nombre del disco: ");
            nombreDisco = reader.nextLine();
            for (int i = 0; i < discos.size(); i++) {
                if (discos.get(i).getNombre().equalsIgnoreCase(nombreDisco)) {
                    System.out.println("Reproduciendo el disco: " + discos.get(i).getNombre() + " del artista " + discos.get(i).getArtista());
                } else if (i == discos.size()) {
                    System.out.println("El disco solicitado no fue encontrado");
                }
            }
        } else {
            int codigo;
            System.out.println("Ingresa el codigo de barras del disco: ");
            codigo = reader.nextInt();
            for (int i = 0; i < discos.size(); i++) {
                if (discos.get(i).getCodBarras() == codigo) {
                    System.out.println("Reproduciendo el disco: " + discos.get(i).getNombre() + " del artista " + discos.get(i).getArtista());
                } else if (i == discos.size()) {
                    System.out.println("El disco solicitado no fue encontrado");
                }
            }
        }
    }

     /**
 * Método que simula la reprodución de videos musicales
 * @param discos
 */
    public void tocarDiscoV(ArrayList<DiscosV> discos) {
        Discos disco = new Discos();
        String nombreDisco;
        Scanner reader = new Scanner(System.in);
        int opcion = menu();
        if (opcion == 1) {
            System.out.println("Ingresa el nombre del disco: ");
            nombreDisco = reader.nextLine();
            for (int i = 0; i < discos.size(); i++) {
                if (discos.get(i).getNombre().equalsIgnoreCase(nombreDisco)) {
                    System.out.println("Reproduciendo el disco: " + discos.get(i).getNombre() + " del artista " + discos.get(i).getArtista());
                } else if (i == discos.size()) {
                    System.out.println("El disco solicitado no fue encontrado");
                }
            }
        } else {
            int codigo;
            System.out.println("Ingresa el codigo de barras del disco: ");
            codigo = reader.nextInt();
            for (int i = 0; i < discos.size(); i++) {
                if (discos.get(i).getCodBarras() == codigo) {
                    System.out.println("Reproduciendo el disco: " + discos.get(i).getNombre() + " del artista " + discos.get(i).getArtista());
                } else if (i == discos.size()) {
                    System.out.println("El disco solicitado no fue encontrado");
                }
            }
        }
    }

     /**
 * Método para elegir la busqueda del disco
 * @return opcion
 */
    private int menu() {
        int opcion;
        System.out.println("¿Como deseas buscar el disco?");
        System.out.println("1) Nombre");
        System.out.println("2) Barra de codigo");
        Scanner reader = new Scanner(System.in);
        opcion = reader.nextInt();
        return opcion;
    }

}
