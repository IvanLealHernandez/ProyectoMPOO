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

/**
 * Clse que modela un inventario (Base de Datos)
 * @author Leal Hernandez Haziel Ivan
 */
public class Inventario {
    
             /**
 * Método para imprimir lo que hay en el inventario
 * @param productos
     * @throws java.io.IOException
 */
    public void imprimirInventario(Hashtable productos) throws IOException {
        int numeroInventario = (int)Math.floor(Math.random()*(100000-1+1)+1);
        File archivo = new File("Inventario-"+numeroInventario+".txt");
        FileWriter escribir = new FileWriter(archivo);
        LocalTime horaActual = LocalTime.now();
        LocalDate fechaActual = LocalDate.now();
        Enumeration<String> nombreProducto = productos.keys();
        Enumeration<Double> precio = productos.elements();
        try (BufferedWriter buffer = new BufferedWriter(escribir); PrintWriter imprimir = new PrintWriter(buffer)) {
            if (!archivo.exists()) {
                archivo.createNewFile();
            } else {
                System.out.println("El inventario ha sido creado con exito");
            }
            imprimir.write("\t+++++++++ INVENTARIO +++++++++ \n");
            imprimir.write("Este inventario fue creado el dia: " + fechaActual+"\n");
            imprimir.write("A la hora: " + horaActual);
            while(nombreProducto.hasMoreElements() && precio.hasMoreElements()){
                imprimir.write("\n"+nombreProducto.nextElement()+" /// Cantidad: "+precio.nextElement());
            }
        }
    }
}
