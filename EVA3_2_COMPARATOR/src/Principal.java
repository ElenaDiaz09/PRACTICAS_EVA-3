
import java.util.Comparator;
import java.util.LinkedList;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Integer>  lista = new LinkedList <Integer> ();
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(11);
        lista.add(158);
        lista.add(4874);
        lista.add(4566);
        lista.add(45);
        lista.add(2);
        lista.add(1);
        System.out.println("/////ORDEN RANDOM/////");
        System.out.println( lista );
        
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int resu;
                //0----> IGUAL
                //+-----> MAYOR
                //-  -----> MENOR
              Integer val1, val2;
              val1 = (Integer) o1;
              val2 = (Integer) o2;
              resu = val1 - val2;
              
              return resu;
            }
        };
        lista.sort(c);
        System.out.println("/////METODO APLICADO/////");
        System.out.println(lista);
        
        
        //ORDENAMOS UNA LISTA CON STRINGS
        LinkedList <String>  listaStr  = new LinkedList <String> ();
        listaStr.add("Hola");
        listaStr.add("***");
        listaStr.add("Mundo");
        listaStr.add("***");
        listaStr.add("Cruel");
        listaStr.add("!!!!");
        
        
        Comparator cmpStr = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
             String cade1 = (String) o1;
             String cade2 = (String) o2;
             //COMPARAMOS CADA ELEMENTO DE LA LISTA
             //AQUI COMPARAMOS EL PRIMER ELEMENTO SUPONIENDO QUE LA LISTA A COMPARAR TIENE MIN 1 ELEMENTO
             char c1 = cade1.charAt(0);
             char c2 = cade2.charAt(0);
              return c1 - c2;
            }
            
        };
        System.out.println("//////ANTES DE ORDENAR LA CADENA DE STRINGS//////");
        System.out.println(listaStr);
        listaStr.sort(cmpStr);
        System.out.println("/////LISTA DE STRINGS YA ORDENADA/////"); 
       System.out.println(listaStr);
       
    }
    
}
