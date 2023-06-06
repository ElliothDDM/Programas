
package practicas02;

import java.util.Random;
import java.util.Scanner;


public class ArregloAleatorio {
    private int[] miArreglo;
    
    
    
public ArregloAleatorio(){
    
    miArreglo = new int[1];
}

public void tamañoArreglo(){

    Scanner lec = new Scanner(System.in);
    System.out.println("Ingrese el numero de elementos");
    int n = lec.nextInt();
    miArreglo = new int[n];
}
public void generarNumAleatorio(){

    Random numrandom = new Random();
    for (int i = 0; i <miArreglo.length ; i++){
        
        miArreglo[i] = numrandom.nextInt(101);
    }
    
}

public void imprimirArreglo(){
    
    for (int i = 0; i <miArreglo.length ; i++) {
        
        System.out.print(miArreglo[i]+"     ");
    }
    
}

public static void main (String[]args){

    ArregloAleatorio arreglo = new ArregloAleatorio();
    arreglo.tamañoArreglo();
    arreglo.generarNumAleatorio();
    arreglo.imprimirArreglo();
}

}
