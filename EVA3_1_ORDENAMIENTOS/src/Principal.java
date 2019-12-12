
import java.util.Scanner;

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
        // ESTOS SOLO SON BUENOS PARA POCOS ELEMENTOS
        int[] datos = new int[32];
       /* System.out.println("*************RANDOM*******************");
        llenar(datos);
        imprimir(datos);
        long ini, fin; 
          ini = System.nanoTime();
        System.out.println("************SELECTION SORT*****************");
        selectionSort(datos);
          fin = System.nanoTime();
        imprimir(datos);
        System.out.println("TIEMPO SELECTION SORT = " + (fin - ini));
        System.out.println("*************RANDOM2*******************");
        llenar(datos);
        imprimir(datos);
         ini = System.nanoTime();
        System.out.println("************INSERTION SORT*******************");
        insertionSort(datos);
        fin = System.nanoTime();
        imprimir(datos);
        System.out.println("TIEMPO INSERTION SORT = " + (fin - ini));
        System.out.println("*************RANDOM3*******************");
        llenar(datos);
        imprimir(datos);
        ini = System.nanoTime();
        System.out.println("*************BUBBLE SORT*************");
        bubbleSort(datos);
        fin = System.nanoTime();
        imprimir(datos);
        System.out.println("TIEMPO BUBBLE SORT = " + (fin - ini));*/
        //System.out.println("*************QUICK SORT*************");
        llenar(datos);
        imprimir(datos);
        selectionSort(datos);
        imprimir(datos);
        
        
       //BUSQUEDA BINARIA
       Scanner input = new Scanner (System.in);
        System.out.println("QUE VALOR QUIERES BUSCAR:  ");
        int iVal = input.nextInt();
        System.out.println("POSICION:  " + busquedaBin(datos, iVal));
    }
    
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }               
    public static  void imprimir(int[] arreglo){
      for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }  
        System.out.println("");
} // O(N^2)
    //HACE MAS COMPARACIONES Y MENOS INTERCAMBIOS
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length ; i++) {
            int iMin = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if(arreglo[j] < arreglo[iMin])
                    iMin = j;
            }
            //SWAP 
            int iTemp = arreglo[i];
            arreglo[i] = arreglo[iMin];
            arreglo[iMin] = iTemp;
        }
}// O(N^2)
    //HACE MENOS COMPARACIONES Y MAS INTERCAMBIOS 
    public static void insertionSort(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int iTemp = arreglo[i];
            int insP;
            for(insP = i; insP > 0; insP--){
                int iPrev = insP - 1;
                if(arreglo[iPrev] > iTemp){
                    //SWAP
                    arreglo[insP] = arreglo [iPrev];
                }else
                    break;
            }
            arreglo[insP] = iTemp;
        }
    }//ES PARA MAS CANTIDAD DE ELEMENTOS
    //BUBLE SORT
    // O(N^2)
    public static void bubbleSort(int[] arreglo){
        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if(arreglo[j] > arreglo[j +1]){
                    int iTemp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = iTemp;
                }
            }
        }
    }
    //QUICK SORT
    public static void quickSort(int[] arreglo){
        quickSortRec(arreglo, 0, arreglo.length -1);
    }
    public static void quickSortRec(int[] arreglo, int ini, int fin){
        //DETERNOS
        if((ini < fin) && (ini >= 0) && (fin < arreglo.length)){
        int iPiv = ini;
        int too_big = ini + 1;
        int too_small = fin;
        int iTemp;
      while(too_big < too_small){  
        while((too_big < fin) && (arreglo[too_big] < arreglo[iPiv]))
            too_big++;
        
         while((too_small > (ini + 1)) && (arreglo[too_small] > arreglo[iPiv]))
            too_small--;
         
         
        if(too_big < too_small){//NO HAY CRUCE
           //SWAP
           iTemp = arreglo[too_big];
           arreglo[too_big] = arreglo[too_small];
           arreglo[too_small] = iTemp;
        }
    }
      //SWAP EL PIVOTE
      iTemp = arreglo[iPiv];
      arreglo[iPiv] = arreglo[too_small];
      arreglo[too_small] = iTemp;
      
        quickSortRec(arreglo, ini, too_small - 1);//IZQ
        quickSortRec(arreglo, too_small + 1, fin);//DERECHA
    }
    }
    //BUSQUEDA DE DATOS
    //BUSQUEDA BINARIA 
    public static int busquedaBin(int[]  arreglo, int val){
        return busquedaBinRec(arreglo, val, 0, arreglo.length - 1);
    }
    private static int busquedaBinRec(int[] arreglo, int val, int ini, int fin){
        if(ini <= fin){
        int mid = ini + ((fin - ini) / 2);
       
         if(val == arreglo[mid]){//QUE EL DATO SEA IGUAL
             return mid;
         }else if(val > arreglo[mid]){//QUE EL DATO SEA MAYOR
             return busquedaBinRec(arreglo, val, mid + 1, fin);
         }else{//QUE EL DATO SEA MENOR
             return busquedaBinRec(arreglo, val, ini, mid - 1); 
         }
       }else
             return -1;
    }
}


