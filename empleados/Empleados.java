/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import productos.Audifonos;
import productos.Bocina;
import productos.DiscosM;
import productos.DiscosV;
import productos.Estereo;
import productos.USB;
import productos.cargadoresCelular;

/**
 * Clase que modela a un empleado
 * @author Leal Hernandez Haziel Ivan
 */
public class Empleados {

      /**
 * Atrubutos de la clase Audifonos
 */
    private String nombre;
    private double celular;
    private int tipo;
    private String usuario;
    private String contra;

     /**
 * Constructor vacio
 */
    public Empleados() {
    }

         /**
 * Constructor con argumentos
 * @param celular
 * @param tipo
 * @param nombre
 * @param usuario
 * @param contra
 */
    public Empleados(String nombre, double celular, int tipo, String usuario, String contra) {
        this.nombre = nombre;
        this.celular = celular;
        this.tipo = tipo;
        this.usuario = usuario;
        this.contra = contra;
    }

         /**
 * Metodo que regresa el nombre del empleado
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }

         /**
 * Metodo para ingresar el nombre del empleado
 * @param nombre
 */ 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

             /**
 * Metodo que regresa el celular del empleado
 * @return celualr
 */
    public double getCelular() {
        return celular;
    }

         /**
 * Metodo para ingresar el celular del empleado
 * @param celular
 */ 
    public void setCelular(double celular) {
        this.celular = celular;
    }

             /**
 * Metodo que regresa el tipo de empleado
 * @return ntipo
 */
    public int getTipo() {
        return tipo;
    }

         /**
 * Metodo para ingresar el tipo de empleado
 * @param tipo
 */ 
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

             /**
 * Metodo que regresa el usuario del empleado
 * @return usuario
 */
    public String getUsuario() {
        return usuario;
    }

         /**
 * Metodo para ingresar el usuario del empleado
 * @param usuario
 */ 
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

             /**
 * Metodo que regresa la contraseña del empleado
 * @return contra
 */
    public String getContra() {
        return contra;
    }

         /**
 * Metodo para ingresar la contraseña del empleado
 * @param contra
 */ 
    public void setContra(String contra) {
        this.contra = contra;
    }

             /**
 * Metodo sobreescrito para imprimr info del objeto
 * @return cadena de datos
 */ 
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", celular=" + celular + ", tipo=" + tipo + ", usuario=" + usuario + ", contra=" + contra + '}';
    }

    public void tocar(ArrayList<DiscosM> discosm, ArrayList<DiscosV> discosv) {
        Scanner reader = new Scanner(System.in);
        int n = 0, sino;
        Estereo estereo = new Estereo();
        if (definirTipo() == 1) {
            do {
                estereo.tocarDiscoM(discosm);
                n += 1;
                System.out.println("¿Deseas reproducir otro disco?");
                System.out.println("1) Si");
                System.out.println("2) No");
                sino = reader.nextInt();
                if (sino == 2) {
                    n = 5;
                } else if (n == 4) {
                    System.out.println("Ya no se pueden reproducir mas discos");
                }
            } while (n < 4);
        } else {
            estereo.tocarDiscoV(discosv);
        }
    }

    public static int definirTipo() {
        Scanner reader = new Scanner(System.in);
        int tipo;
        System.out.println("¿Que tipo de disco quieres reproducir?");
        System.out.println("1) Musical");
        System.out.println("2) Video");
        tipo = reader.nextInt();
        return tipo;
    }

         /**
 * Metodo para ingresar productos al inventario
 * @param discosm
 * @param discosv
     * @param audifonos
     * @param bocinas
     * @param cargadores
     * @param usb
     * @throws java.io.IOException
 * 
 */ 
    public void inventario(ArrayList<DiscosM> discosm, ArrayList<DiscosV> discosv,
            ArrayList<Audifonos> audifonos,
            ArrayList<Bocina> bocinas,
            ArrayList<cargadoresCelular> cargadores,
            ArrayList<USB> usb) throws IOException {
        Hashtable<String, Double> productos = new Hashtable<>();
        Inventario inven = new Inventario();
        System.out.println("---------------------");
        System.out.println("Discos musicales");
        System.out.println("---------------------");
        for (int i = 0; i < discosm.size(); i++) {
            System.out.println("Numero " + (i + 1));
            System.out.println("Nombre: " + discosm.get(i).getNombre());
            System.out.println("Artista: " + discosm.get(i).getArtista());
            System.out.println("Cantidad: " + discosm.get(i).getCantidad());
            System.out.println("Precio: " + discosm.get(i).getPrecio());
            System.out.println("Codigo de barras: " + discosm.get(i).getCodBarras());
            System.out.println("---------------------");
            productos.put("Disco musical: " + discosm.get(i).getNombre(), (double) discosm.get(i).getCantidad());
        }
        System.out.println("---------------------");
        System.out.println("Discos de video");
        System.out.println("---------------------");
        for (int i = 0; i < discosv.size(); i++) {
            System.out.println("Numero " + (i + 1));
            System.out.println("Nombre: " + discosv.get(i).getNombre());
            System.out.println("Artista: " + discosv.get(i).getArtista());
            System.out.println("Cantidad: " + discosv.get(i).getCantidad());
            System.out.println("Precio: " + discosv.get(i).getPrecio());
            System.out.println("Codigo de barras: " + discosv.get(i).getCodBarras());
            System.out.println("---------------------");
            productos.put("Disco de video: " + discosv.get(i).getNombre(), (double) discosv.get(i).getCantidad());
        }
        System.out.println("---------------------");
        System.out.println("Audifonos");
        System.out.println("---------------------");
        for (int i = 0; i < audifonos.size(); i++) {
            System.out.println("Numero " + (i + 1));
            System.out.println("Nombre: " + audifonos.get(i).getNombre());
            System.out.println("Marca: " + audifonos.get(i).getMarca());
            System.out.println("Color: " + audifonos.get(i).getColor());
            System.out.println("Cantidad: " + audifonos.get(i).getCantidad());
            System.out.println("Precio: " + audifonos.get(i).getPrecio());
            System.out.println("Codigo de barras: " + audifonos.get(i).getCodBarras());
            System.out.println("---------------------");
            productos.put("Nombre: " + audifonos.get(i).getNombre() + " /// Marca: " + audifonos.get(i).getMarca(), (double) audifonos.get(i).getCantidad());
        }
        System.out.println("---------------------");
        System.out.println("Cargadores");
        System.out.println("---------------------");
        for (int i = 0; i < cargadores.size(); i++) {
            System.out.println("Numero " + (i + 1));
            System.out.println("Nombre: " + cargadores.get(i).getNombre());
            System.out.println("Marca: " + cargadores.get(i).getMarca());
            System.out.println("Color: " + cargadores.get(i).getColor());
            System.out.println("Cantidad: " + cargadores.get(i).getCantidad());
            System.out.println("Precio: " + cargadores.get(i).getPrecio());
            System.out.println("Codigo de barras: " + cargadores.get(i).getCodBarras());
            System.out.println("---------------------");
            productos.put("Nombre: " + cargadores.get(i).getNombre() + " /// Marca: " + cargadores.get(i).getMarca(), (double) cargadores.get(i).getCantidad());
        }
        System.out.println("---------------------");
        System.out.println("USB");
        System.out.println("---------------------");
        for (int i = 0; i < usb.size(); i++) {
            System.out.println("Numero " + (i + 1));
            System.out.println("Nombre: " + usb.get(i).getNombre());
            System.out.println("Marca: " + usb.get(i).getMarca());
            System.out.println("Color: " + usb.get(i).getColor());
            System.out.println("Cantidad: " + usb.get(i).getCantidad());
            System.out.println("Precio: " + usb.get(i).getPrecio());
            System.out.println("Codigo de barras: " + usb.get(i).getCodBarras());
            System.out.println("---------------------");
            productos.put("Nombre: " + usb.get(i).getNombre() + " /// Marca: " + usb.get(i).getMarca(), (double) usb.get(i).getCantidad());
        }
        System.out.println("---------------------");
        System.out.println("Bocinas");
        System.out.println("---------------------");
        for (int i = 0; i < bocinas.size(); i++) {
            System.out.println("Numero " + (i + 1));
            System.out.println("Nombre: " + bocinas.get(i).getNombre());
            System.out.println("Marca: " + bocinas.get(i).getMarca());
            System.out.println("Color: " + bocinas.get(i).getColor());
            System.out.println("Cantidad: " + bocinas.get(i).getCantidad());
            System.out.println("Precio: " + bocinas.get(i).getPrecio());
            System.out.println("Codigo de barras: " + bocinas.get(i).getCodBarras());
            System.out.println("---------------------");
            productos.put("Nombre: " + bocinas.get(i).getNombre() + " /// Marca: " + bocinas.get(i).getMarca(), (double) bocinas.get(i).getCantidad());
        }
        System.out.println("---------------------");
        inven.imprimirInventario(productos);
    }

         /**
 * Metodo para buscar discos
 * @param discosm
 * @param discosv
 */ 
    public void buscar(ArrayList<DiscosM> discosm, ArrayList<DiscosV> discosv) {
        int n = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Como quieres buscar el disco?");
        System.out.println("1) Nombre");
        System.out.println("2) Codigo de barras");
        int opcion = reader.nextInt();
        if (opcion == 1) {
            System.out.println("Ingresa el nombre del disco: ");
            reader.nextLine();
            String buscar = reader.nextLine();
            for (int i = 0; i < discosm.size(); i++) {
                if (discosm.get(i).getNombre().equalsIgnoreCase(buscar)) {
                    System.out.println("Nombre del disco: " + buscar);
                    System.out.println("Artista: " + discosm.get(i).getArtista());
                    System.out.println("Codigo de barras: " + discosm.get(i).getCodBarras());
                    System.out.println("Precio: " + discosm.get(i).getPrecio());
                    System.out.println("Disponibles: " + discosm.get(i).getCantidad());
                    System.out.println("Lista de canciones");
                    String[] arr = discosm.get(i).getCanciones();
                    for (int j = 0; j < arr.length; j++) {
                        System.out.println("Cancion " + (j + 1) + ": " + arr[j]);
                    }
                    n = 1;
                }
                break;
            }
            if (n == 0) {
                for (int i = 0; i < discosv.size(); i++) {
                    if (discosv.get(i).getNombre().equalsIgnoreCase(buscar)) {
                        System.out.println("Nombre del disco: " + buscar);
                        System.out.println("Artista: " + discosv.get(i).getArtista());
                        System.out.println("Codigo de barras: " + discosv.get(i).getCodBarras());
                        System.out.println("Precio: " + discosv.get(i).getPrecio());
                        System.out.println("Disponibles: " + discosv.get(i).getCantidad());
                        System.out.println("Lista de canciones");
                        String[] arr = discosv.get(i).getCanciones();
                        for (int j = 0; j < arr.length; j++) {
                            System.out.println("Cancion " + (j + 1) + ": " + arr[j]);
                        }
                    }
                }
            }
        } else {
            System.out.println("Ingresa el codigo de barras del disco: ");
            reader.nextLine();
            int buscar = reader.nextInt();
            for (int i = 0; i < discosm.size(); i++) {
                if (discosm.get(i).getCodBarras() == buscar) {
                    System.out.println("Nombre del disco: " + discosm.get(i).getNombre());
                    System.out.println("Artista: " + discosm.get(i).getArtista());
                    System.out.println("Codigo de barras: " + discosm.get(i).getCodBarras());
                    System.out.println("Precio: " + discosm.get(i).getPrecio());
                    System.out.println("Disponibles: " + discosm.get(i).getCantidad());
                    System.out.println("Lista de canciones");
                    String[] arr = discosm.get(i).getCanciones();
                    for (int j = 0; j < arr.length; j++) {
                        System.out.println("Cancion " + (j + 1) + ": " + arr[j]);
                    }
                    n = 1;
                }
            }
            if (n == 0) {
                for (int i = 0; i < discosv.size(); i++) {
                    if (discosv.get(i).getCodBarras() == buscar) {
                        System.out.println("Nombre del disco: " + discosv.get(i).getNombre());
                        System.out.println("Artista: " + discosv.get(i).getArtista());
                        System.out.println("Codigo de barras: " + discosv.get(i).getCodBarras());
                        System.out.println("Precio: " + discosv.get(i).getPrecio());
                        System.out.println("Disponibles: " + discosv.get(i).getCantidad());
                        System.out.println("Lista de videos");
                        String[] arr = discosv.get(i).getCanciones();
                        for (int j = 0; j < arr.length; j++) {
                            System.out.println("Cancion " + (j + 1) + ": " + arr[j]);
                        }
                    }
                }
            }
        }
    }
}
