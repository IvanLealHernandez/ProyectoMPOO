/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import empleados.Acomodador;
import empleados.Gerente;
import empleados.Vendedor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import productos.Audifonos;
import productos.Bocina;
import productos.DiscosM;
import productos.DiscosV;
import productos.Generador;
import productos.USB;
import productos.cargadoresCelular;
import static proyecto.Ingreso.ingreso;
import static proyecto.Proyecto.reader;

/**
 * Clas eprincipal donde de corre todo el prigrama
 * @author Leal Hernandez Haziel Ivan
 */
public class Proyecto {
    
     /**
     * Colecciones de datos que se vana usar durante el programa
     */
    
    static ArrayList<DiscosM> discosm = new ArrayList();
    static ArrayList<DiscosV> discosv = new ArrayList();
    static ArrayList<Gerente> gerentes = new ArrayList();
    static ArrayList<Vendedor> vendedores = new ArrayList();
    static ArrayList<Acomodador> acomodadores = new ArrayList();
    static ArrayList<Audifonos> audifonos = new ArrayList();
    static ArrayList<Bocina> bocinas = new ArrayList();
    static ArrayList<cargadoresCelular> cargadores = new ArrayList();
    static ArrayList<USB> usb = new ArrayList();
    static Scanner reader = new Scanner(System.in);

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Generador generador = new Generador();
        generador.definirDiscosM(discosm);
        generador.definirDiscosV(discosv);
        generador.definirAudifonos(audifonos);
        generador.definirBocinas(bocinas);
        generador.definirCargadores(cargadores);
        generador.definirUSB(usb);
        int opcion = 0;
        Gerente jefe = new Gerente();
        jefe.setNombre("Alan");
        jefe.setCelular(552898);
        jefe.setUsuario("Alan");
        jefe.setContra("Jefe");
        jefe.setTipo(1);
        gerentes.add(jefe);
        Vendedor vende = new Vendedor();
        Acomodador acomoda = new Acomodador();
        do {
            opcion = menu();
            if (opcion == 1) {
                switch (ingreso(gerentes, vendedores, acomodadores)) {
                    case 1:
                        jefe.opciones(discosm, discosv, vendedores, gerentes, acomodadores, audifonos, bocinas, cargadores, usb);
                        break;
                    case 2:
                        vende.opciones(discosm, discosv, audifonos, bocinas, cargadores, usb);
                        break;
                    default:
                        acomoda.opciones(discosm, discosv, audifonos, bocinas, cargadores, usb);
                        break;
                }
            }
        } while (opcion != 2);
        System.out.println("Hasta luego");
    }
    
    /**
     * Menú de opciones
     */

    public static int menu() {
        int opcion;
        System.out.println("¿Que deseas hacer?");
        System.out.println("1) Iniciar sesion");
        System.out.println("2) Salir");
        opcion = reader.nextInt();
        return opcion;
    }
}
