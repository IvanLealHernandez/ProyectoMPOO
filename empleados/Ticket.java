/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class Ticket {
    
    //objeto para leer del teclado
    Scanner reader = new Scanner(System.in);
    
         /**
 * Método para imprimir el Ticket en un archivo
 * @param ganancia
 * @param productos
     * @throws java.io.IOException
 */
    public void imprimirTicket(double ganancia, Hashtable productos) throws IOException {
        int numeroTicket = (int)Math.floor(Math.random()*(100000-1+1)+1);
        File archivo = new File("Ticket-"+numeroTicket+".txt");
        FileWriter escribir = new FileWriter(archivo);
        LocalTime horaActual = LocalTime.now();
        LocalDate fechaActual = LocalDate.now();
        Enumeration<String> nombreProducto = productos.keys();
        Enumeration<Double> precio = productos.elements();
        Enumeration<String> nombreProducto1 = productos.keys();
        Enumeration<Double> precio1 = productos.elements();
        try (BufferedWriter buffer = new BufferedWriter(escribir); PrintWriter imprimir = new PrintWriter(buffer)) {
            if (!archivo.exists()) {
                archivo.createNewFile();
            } else {
                System.out.println("El ticket ha sido creado con exito");
            }

            imprimir.write("\n\tTIENDA DE MUSICA");
            imprimir.write("\n\tSUCURSAL: CENTRO");
            System.out.println("\n\nTIENDA DE MUSICA");
            System.out.println("SUCURSAL: CENTRO");
            imprimir.write("\n\tFecha de la compra: " + fechaActual);
            System.out.println("Fecha de la compra: " + fechaActual);
            imprimir.write("\n\tHora de la compra: " + horaActual);
            System.out.println("Hora de la compra: " + horaActual);
            imprimir.write("\n\n\t\tCantidad\t\tProductos\t\tPrecio");
            System.out.println("Cantidad\t\tProductos\t\tPrecio");
            while(nombreProducto.hasMoreElements() && precio.hasMoreElements()){
                System.out.println("    "+nombreProducto1.nextElement()+"           $"+precio1.nextElement());
                imprimir.write("\n\t\t"+nombreProducto.nextElement()+"              $"+precio.nextElement());
            }
            System.out.println("Monto total a pagar: " + ganancia);
            System.out.println("Numero de Ticket: " + numeroTicket+"\n\n");
            imprimir.write("\n\n\tMonto total a pagar: " + ganancia);
            imprimir.write("\n\tNumero de Ticket: " + numeroTicket);
        }
    }
}
