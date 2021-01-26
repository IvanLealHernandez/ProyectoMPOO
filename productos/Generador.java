/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.ArrayList;

/**
 * Calse para genrar la base de datos de productos
 * @author Leal Hernandez Haziel Ivan
 */
public class Generador {

     /**
 * Método para llenar los tipos de discos musicales existentes
 * @param discosm 
 */
    public void definirDiscosM(ArrayList<DiscosM> discosm) {
        DiscosM aux = new DiscosM();
        aux.setNombre("A Night at the Opera");
        aux.setArtista("Queen");
        aux.setNumCanciones(12);
        aux.setCodBarras(1223);
        aux.setPrecio(600);
        aux.setCantidad(6);
        String[] arr = {"Bohemian Rhapsody", "God Save the Queen", "I'm In Love With My Car", "You're My Best Friend", "The Prophet", "Love of My Life"};
        aux.setCanciones(arr);
        discosm.add(aux);

        DiscosM aux1 = new DiscosM();
        aux1.setNombre("Violator");
        aux1.setArtista("Depeche Mode");
        aux1.setNumCanciones(9);
        aux1.setCodBarras(1383);
        aux1.setPrecio(100);
        aux1.setCantidad(9);
        String[] arreglo1 = {"Enjoy the silence", "Policy of Truth", "Blue Dress", "World In My Eyes", "Clean", "Halo", "Waiting fo the Night", "Personal Jesus", "Sweetest Perfection"};
        aux1.setCanciones(arreglo1);
        discosm.add(aux1);

        DiscosM aux2 = new DiscosM();
        aux2.setNombre("Paranoid");
        aux2.setArtista("Black Sabbath");
        aux2.setNumCanciones(8);
        aux2.setCodBarras(2488);
        aux2.setPrecio(250);
        aux2.setCantidad(6);
        String[] arreglo2 = {"War Pigs", "Paranoid", "Planet Caravan", "Iron Man", "Electric Funeral", "Hand of Doom", "Rat Salad", "Faires Wear Boots"};
        aux2.setCanciones(arreglo2);
        discosm.add(aux2);

        DiscosM aux3 = new DiscosM();
        aux3.setNombre("Hunting High and Low");
        aux3.setArtista("A-ha");
        aux3.setNumCanciones(10);
        aux3.setCodBarras(9737);
        aux3.setCantidad(8);
        aux3.setPrecio(99);
        String[] arreglo3 = {"Take on Me", "Train of Thought", "Hunting High and Low", "The Blue Sky", "Living the Boys Advent", "The Sun Always Shine", "And You Tell Me", "Love is Reason", "I Dream Myself Alive", "Here I Stand and Face the Rain"};
        aux3.setCanciones(arreglo3);
        discosm.add(aux3);

        DiscosM aux4 = new DiscosM();
        aux4.setNombre("Mutter");
        aux4.setArtista("Rammstein");
        aux4.setNumCanciones(11);
        aux4.setCodBarras(6294);
        aux4.setPrecio(499);
        aux4.setCantidad(11);
        String[] arreglo4 = {"Mein Herz Brennt", "Links 2-3-4", "Sonne", "Ich Will", "Feuer frei!", "Mutter", "Spieluhr", "Zwitter", "Rein raus", "Adios", "Nebel"};
        aux4.setCanciones(arreglo4);
        discosm.add(aux4);

        DiscosM aux5 = new DiscosM();
        aux5.setNombre("Viva la Vida or Death and All His Friends");
        aux5.setArtista("Coldplay");
        aux5.setNumCanciones(10);
        aux5.setCodBarras(6492);
        aux5.setPrecio(699);
        aux5.setCantidad(4);
        String[] arreglo5 = {"Viva la Vida", "Life in Technicolor", "Yes", "Violet Hill", "Death and All His Frie", "Lovers in Japan", "42", "Lost!", "Cementeries of London", "Strawberry Swing"};
        aux5.setCanciones(arreglo5);
        discosm.add(aux5);

        DiscosM aux6 = new DiscosM();
        aux6.setNombre("Songs from the Big Chair");
        aux6.setArtista("Tears for Tears");
        aux6.setNumCanciones(8);
        aux6.setCodBarras(3048);
        aux6.setPrecio(299);
        aux6.setCantidad(9);
        String[] arreglo6 = {"Shout", "Every Body Wants to Rule the World", "Heads Over Heels", "The Working Hour", "Broken", "Listen", "I Belive", "Mother's Talk"};
        aux6.setCanciones(arreglo6);
        discosm.add(aux6);
    }

         /**
 * Método para llenar los tipos de discos de video
 * @param discosv
 */
    public void definirDiscosV(ArrayList<DiscosV> discosv) {
        DiscosV aux1 = new DiscosV();
        aux1.setNombre("Alan Parsons Project - Collection");
        aux1.setArtista("Alan Pasrsons Project");
        aux1.setNumCanciones(3);
        aux1.setCodBarras(9348);
        aux1.setPrecio(300);
        aux1.setCantidad(8);
        String[] arreglo1 = {"Eye in the Sky", "Games People Play", "Games People Play (LIVE)"};
        aux1.setCanciones(arreglo1);
        discosv.add(aux1);

        DiscosV aux2 = new DiscosV();
        aux2.setNombre("The Best of: Eminem");
        aux2.setArtista("Eminem");
        aux2.setNumCanciones(4);
        aux2.setCodBarras(7623);
        aux2.setPrecio(150);
        aux2.setCantidad(10);
        String[] arreglo2 = {"The Real Slim Shady", "Lose Yourself", "Whithout Me", "Rap God"};
        aux2.setCanciones(arreglo2);
        discosv.add(aux2);

        DiscosV aux3 = new DiscosV();
        aux3.setNombre("Zoe: Unplugged MTV");
        aux3.setArtista("Zoe");
        aux3.setNumCanciones(3);
        aux3.setCodBarras(4820);
        aux3.setPrecio(89);
        aux3.setCantidad(12);
        String[] arreglo3 = {"Sonie", "Labios Rotos", "Luna"};
        aux3.setCanciones(arreglo3);
        discosv.add(aux3);

        DiscosV aux4 = new DiscosV();
        aux4.setNombre("The Best of 60's");
        aux4.setArtista("Varios");
        aux4.setNumCanciones(4);
        aux4.setCodBarras(5767);
        aux4.setPrecio(69);
        aux4.setCantidad(7);
        String[] arreglo4 = {"The House pf the Rising Sun - The Animals", "The End - The Doors", "Visions of Johana - Bob Dylen", "Hey Jude - The Beatles"};
        aux4.setCanciones(arreglo4);
        discosv.add(aux4);
    }

         /**
 * Método para llenar los tipos de audifonos existentes 
 * @param audifonos
 */
    public void definirAudifonos(ArrayList<Audifonos> audifonos) {
        Audifonos aux = new Audifonos();
        aux.setCantidad(8);
        aux.setCodBarras(1886);
        aux.setColor("Negro");
        aux.setMarca("Xiaomi");
        aux.setNombre("Audifonos");
        aux.setPrecio(200);
        Audifonos aux1 = new Audifonos();
        aux1.setCantidad(13);
        aux1.setCodBarras(1887);
        aux1.setColor("Blanco");
        aux1.setMarca("Samsung");
        aux1.setNombre("Audifonos");
        aux1.setPrecio(350);
        audifonos.add(aux);
        audifonos.add(aux1);
    }

         /**
 * Método para llenar los tipos de bocinas existentes
 * @param discosm 
 */
    public void definirBocinas(ArrayList<Bocina> bocina) {
        Bocina aux = new Bocina();
        aux.setCantidad(4);
        aux.setCodBarras(1793);
        aux.setColor("Rojo");
        aux.setMarca("LG");
        aux.setNombre("Bocina");
        aux.setPrecio(300);
        Bocina aux1 = new Bocina();
        aux1.setCantidad(8);
        aux1.setCodBarras(1792);
        aux1.setColor("Azul");
        aux1.setMarca("Samsung");
        aux1.setNombre("Bocina");
        aux1.setPrecio(400);
        bocina.add(aux);
        bocina.add(aux1);
    }

         /**
 * Método para llenar los tipos de cragadores celulares existentes
 * @param cargadores 
 */
    public void definirCargadores(ArrayList<cargadoresCelular> cargadores) {
        cargadoresCelular aux = new cargadoresCelular();
        aux.setCantidad(14);
        aux.setCodBarras(1635);
        aux.setColor("Blanco");
        aux.setMarca("Apple");
        aux.setNombre("Cargador para IPhone");
        aux.setPrecio(230);
        cargadoresCelular aux1 = new cargadoresCelular();
        aux1.setCantidad(10);
        aux1.setCodBarras(1634);
        aux1.setColor("Blanco");
        aux1.setMarca("Huawei");
        aux1.setNombre("Cargador para Huawei");
        aux1.setPrecio(120);
        cargadores.add(aux);
        cargadores.add(aux1);
    }

         /**
 * Método para llenar los tipos de pendrive existentes
 * @param usb
 */
    public void definirUSB(ArrayList<USB> usb) {
        USB aux = new USB();
        aux.setCantidad(16);
        aux.setCodBarras(1179);
        aux.setColor("Roja");
        aux.setMarca("SanDisk");
        aux.setNombre("Memoria USB");
        aux.setPrecio(260);
        USB aux1 = new USB();
        aux1.setCantidad(20);
        aux1.setCodBarras(1178);
        aux1.setColor("Negra");
        aux1.setMarca("Kingston");
        aux1.setNombre("Memoria USB");
        aux1.setPrecio(200);
        usb.add(aux);
        usb.add(aux1);
    }
}
