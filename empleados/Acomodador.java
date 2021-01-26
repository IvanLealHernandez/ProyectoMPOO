/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import productos.Audifonos;
import productos.Bocina;
import productos.DiscosM;
import productos.DiscosV;
import productos.USB;
import productos.cargadoresCelular;

/**
 * Clase que modela un empleado acomodador y hereda de Empleados
 * @author Leal Hernandez Haziel Ivan
 */
public class Acomodador extends Empleados{
    
     /**
 * Constructor vacio
 */
    public Acomodador() {
    }

         /**
 * Constructor con argumentos
 * @param celular
 * @param nombre
 * @param tipo
 * @param usuario
 * @param contra
 */
    public Acomodador(String nombre, double celular, int tipo, String usuario, String contra) {
        super(nombre, celular, tipo, usuario, contra);
    }
 
          /**
 * Método para escoger la actividad del acomodador
 * @param discosm
 * @param discosv
 * @param audifonos
 * @param bocinas
 * @param cargadores
 * @param usb
     * @throws java.io.IOException
 */  
    public void opciones(ArrayList<DiscosM> discosm, ArrayList<DiscosV> discosv,
            ArrayList<Audifonos> audifonos, 
            ArrayList<Bocina> bocinas,
            ArrayList<cargadoresCelular> cargadores,
            ArrayList<USB> usb) throws IOException{
        int opcion = 0;
        Scanner reader = new Scanner(System.in);
        do{
            menu();
            opcion = reader.nextInt();
            switch(opcion) {
                case 1:
                    inventario(discosm,discosv,audifonos, bocinas, cargadores, usb);
                    break;
                case 2:
                    tocar(discosm, discosv);
                    break;
                case 3:
                    buscar(discosm,discosv);
                    break;
                case 4:
                    System.out.println("Excelente jornada laboral, nos vemos mañana");
                    break;
                default:
                    System.out.println("Opcion no valida\n");
                    break;
            }
        }while(opcion != 4);
    }
    
            /**
 * Ménu de opciones para el acomodador
 */
    public void menu(){
        System.out.println("¿Que deseas hacer?");
        System.out.println("1) Inventario");
        System.out.println("2) Estereo");
        System.out.println("3) Buscar disco");
        System.out.println("4) Cerrar sesion");
    }
}
