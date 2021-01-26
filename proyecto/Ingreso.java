/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import empleados.Acomodador;
import empleados.Gerente;
import empleados.Vendedor;
import java.util.ArrayList;
import static proyecto.Proyecto.reader;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class Ingreso {

     /**
      * Metod estatico para ingresar como un usuario
     * @param gerentes the command line arguments
     * @param vendedores the command line arguments
     * @param acomodadores the command line arguments
     * @return aux
     * 
     */
    public static int ingreso(ArrayList<Gerente> gerentes, ArrayList<Vendedor> vendedores, ArrayList<Acomodador> acomodadores) {
        int aux = 0;
        do {
            System.out.println("Por favor, ingrese su usuario y contraseña");
            reader.nextLine();
            System.out.println("Usuario:");
            String nombre = reader.nextLine();
            System.out.println("Contraseña:");
            String contra = reader.nextLine();
            for (int i = 0; i < gerentes.size(); i++) {
                if (gerentes.get(i).getUsuario().equalsIgnoreCase(nombre) && gerentes.get(i).getContra().equalsIgnoreCase(contra)) {
                    System.out.println("Bienvenido " + gerentes.get(i).getNombre());
                    aux = gerentes.get(i).getTipo();
                    break;
                }
            }
            if (vendedores.size() > 0) {
                for (int j = 0; j < vendedores.size(); j++) {
                    if (vendedores.get(j).getUsuario().equalsIgnoreCase(nombre) && vendedores.get(j).getContra().equalsIgnoreCase(contra)) {
                        System.out.println("Bienvenido " + vendedores.get(j).getNombre());
                        aux = vendedores.get(j).getTipo();
                        break;
                    }
                }
            }
            if (acomodadores.size() > 0) {
                for (int k = 0; k < 10; k++) {
                    if (acomodadores.get(k).getUsuario().equalsIgnoreCase(nombre) && acomodadores.get(k).getContra().equalsIgnoreCase(contra)) {
                        System.out.println("Bienvenido " + acomodadores.get(k).getNombre());
                        aux = acomodadores.get(k).getTipo();
                        break;
                    }
                }
            }
            if (aux == 0) {
                System.out.println("Usuario o contraseña incorrectos, vuelve a intentarlo");
            }
        } while (aux == 0);
        return aux;
    }
}
