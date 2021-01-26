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
import productos.USB;
import productos.cargadoresCelular;

/**
 * Calse que modela un vendedor y hereda de Empleados
 * @author Leal Hernandez Haziel Ivan
 */
public class Vendedor extends Empleados{
    
     /**
 * Constructor vacio
 */
    public Vendedor() {
    }

         /**
 * Constructor con argumentos
 * @param tipo
 * @param celular
 * @param nombre
 * @param contra
 * @param usuario
 */
    public Vendedor(String nombre, double celular, int tipo, String usuario, String contra) {
        super(nombre, celular, tipo, usuario, contra);
    }

         /**
 *  Método que elige produtos para vender
 * @param discosm
 * @param discosv
 * @param audifonos
 * @param bocinas
 * @param cargadores
 * @param usb
     * @throws java.io.IOException
 * 
 */
    public void opciones(ArrayList<DiscosM> discosm, ArrayList<DiscosV> discosv,ArrayList<Audifonos> audifonos,
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
                    vender(discosm, discosv,audifonos, bocinas, cargadores,usb);
                    break;
                case 3:
                    tocar(discosm, discosv);
                    break;
                case 4:
                    buscar(discosm,discosv);
                    break;
                case 5:
                    System.out.println("Excelente jornada laboral, nos vemos mañana");
                    break;
                default:
                    System.out.println("Opcion no valida\n");
                    break;
            }
        }while(opcion != 5);
    }
     
         /**
 * Metodo para escoger la activad del vendedor
 */
    public void menu(){
        System.out.println("¿Que deseas hacer?");
        System.out.println("1) Inventario");
        System.out.println("2) Vender");
        System.out.println("3) Estereo");
        System.out.println("4) Buscar disco");
        System.out.println("5) Cerrar sesion");
    }
    
    
         /**
 * Método para vender productos
 * @param discosm
 * @param discosv
 * @param audifonos
 * @param cargadores
 * @param usb
 * @param bocinas
     * @throws java.io.IOException
 **/
    public void vender(ArrayList<DiscosM> discosm, ArrayList<DiscosV> discosv, ArrayList<Audifonos> audifonos, 
            ArrayList<Bocina> bocinas,
            ArrayList<cargadoresCelular> cargadores,
            ArrayList<USB> usb) throws IOException{
        Ticket ticket1 = new Ticket();
        Hashtable<String, Double> productos = new Hashtable<>();
        int venta=0,n=0;
        double ganancia=0;
        Scanner reader = new Scanner(System.in);
        do {
            int aux, cantidad, disminuir;
            System.out.println("¿Que deseas vender?");
            productos();
            switch(reader.nextInt()){
                case 1:
                    System.out.println("¿Que disco deseas vender?");
                    for (int i = 0; i < discosm.size(); i++) {
                        System.out.println((i+1)+") "+discosm.get(i).getNombre());
                        if(i == discosm.size()){
                            n = i;
                        }
                    }
                    aux = reader.nextInt();
                    if (n>(aux-=1) || (aux-1)<0){
                        System.out.println("Opcion invalida");     
                    }
                    else {
                        System.out.println("¿Cuantos discos deseas vender?");
                        cantidad = reader.nextInt();
                        productos.put(cantidad+"\t\t  "+discosm.get(aux).getNombre(), discosm.get(aux).getPrecio());
                        ganancia = ganancia+cantidad*discosm.get(aux).getPrecio();
                        disminuir = discosm.get(aux).getCantidad();
                        discosm.get(aux).setCantidad(disminuir-1);
                    }
                    break;
                case 2:
                    System.out.println("¿Que disco deseas vender?");
                    for (int i = 0; i < discosv.size(); i++) {
                        System.out.println((i+1)+") "+discosv.get(i).getNombre());
                        if(i == discosv.size()){
                            n = i;
                        }
                    }
                    aux = reader.nextInt();
                    if (n>(aux-=1) || (aux-1)<0){
                        System.out.println("Opcion invalida");     
                    }
                    else {
                        System.out.println("¿Cuantos discos deseas vender?");
                        cantidad = reader.nextInt();
                        productos.put(cantidad+"\t\t  "+discosv.get(aux).getNombre(), discosv.get(aux).getPrecio());
                        ganancia = ganancia+cantidad*discosv.get(aux).getPrecio();
                        disminuir = discosv.get(aux).getCantidad();
                        discosv.get(aux).setCantidad(disminuir-1);
                    }
                    break;
                case 3:
                    System.out.println("¿Que audifonos deseas vender?");
                    for (int i = 0; i < audifonos.size(); i++) {
                        System.out.println((i+1)+") "+audifonos.get(i).getMarca());
                    }
                    aux = reader.nextInt();
                    if ((aux-1)<0 || (aux-1)>1){
                        System.out.println("Opcion invalida");     
                    }
                    else{
                        System.out.println("¿Cuantos audifonos deseas vender?");
                        cantidad = reader.nextInt();
                        productos.put(cantidad+"\t\t  "+audifonos.get(aux-1).getNombre(), audifonos.get(aux-1).getPrecio());
                        ganancia = ganancia+cantidad*audifonos.get(aux-1).getPrecio();
                        disminuir = audifonos.get(aux-1).getCantidad();
                        audifonos.get(aux-1).setCantidad(disminuir-1);
                    
                    }
                    break;
                case 4:
                    System.out.println("¿Que bocinas deseas vender?");
                    for (int i = 0; i < bocinas.size(); i++) {
                        System.out.println((i+1)+") "+bocinas.get(i).getMarca());
                    }
                    aux = reader.nextInt();
                    if ((aux-1)<0 || (aux-1)>1){
                        System.out.println("Opcion invalida");     
                    }
                    else{
                        System.out.println("¿Cuantas bocinas deseas vender?");
                        cantidad = reader.nextInt();
                        productos.put(cantidad+"\t\t  "+bocinas.get(aux-1).getNombre(), bocinas.get(aux-1).getPrecio());
                        ganancia = ganancia+cantidad*bocinas.get(aux-1).getPrecio();
                        disminuir = bocinas.get(aux-1).getCantidad();
                        bocinas.get(aux-1).setCantidad(disminuir-1);
                    }
                    break;
                case 5:
                    System.out.println("¿Que cargador deseas vender?");
                    for (int i = 0; i < cargadores.size(); i++) {
                        System.out.println((i+1)+") "+cargadores.get(i).getNombre());
                    }
                    aux = reader.nextInt();
                    if ((aux-1)<0 || (aux-1)>1){
                        System.out.println("Opcion invalida");     
                    }
                    else{
                        System.out.println("¿Cuantos cargadores deseas vender?");
                        cantidad = reader.nextInt();
                        productos.put(cantidad+"\t\t  "+cargadores.get(aux-1).getNombre(), cargadores.get(aux-1).getPrecio());
                        ganancia = ganancia+cantidad*cargadores.get(aux-1).getPrecio();
                        disminuir = cargadores.get(aux-1).getCantidad();
                        cargadores.get(aux-1).setCantidad(disminuir-1);
                    }
                    break;
                case 6:
                    System.out.println("¿Que USB deseas vender?");
                    for (int i = 0; i < usb.size(); i++) {
                        System.out.println((i+1)+") "+usb.get(i).getNombre());
                    }
                    aux = reader.nextInt();
                    if ((aux-1)<0 || (aux-1)>1){
                        System.out.println("Opcion invalida");     
                    }
                    else{
                        System.out.println("¿Cuantos cargadores deseas vender?");
                        cantidad = reader.nextInt();
                        productos.put(cantidad+"\t\t  "+usb.get(aux-1).getNombre(), usb.get(aux-1).getPrecio());
                        ganancia = ganancia+cantidad*usb.get(aux-1).getPrecio();
                        disminuir = usb.get(aux-1).getCantidad();
                        usb.get(aux-1).setCantidad(disminuir-1);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                }
            System.out.println("¿Deseas añadir otra cosa a tu carrito?");
            System.out.println("1) Si");
            System.out.println("2) No");
            venta = reader.nextInt();
            if(venta == 2){
                System.out.println("El total a pagar es de: "+ganancia);
            }
        }while(venta!=2);
        System.out.println("Procediendo a imprimir ticket, aguarde");
        ticket1.imprimirTicket(ganancia, productos);
    }
    
         /**
 * Método del muenú de productos
 */
    public void productos(){
        System.out.println("1) Disco musical");
        System.out.println("2) Disco de video");
        System.out.println("3) Audifonos");
        System.out.println("4) Bocina");
        System.out.println("5) Cargadores");
        System.out.println("6) USB");
    }
}
