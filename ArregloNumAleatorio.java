
package practicas02;


import java.util.Random;
import java.util.Scanner;


public class ArregloNumAleatorio {
    public static void main (String[]args){
        int n;
        Scanner lec = new Scanner(System.in);
        Random numRandom = new Random();
        
        System.out.println("Ingrese los elementos del arreglo");
        n = lec.nextInt();
        int [] aleatorio = new int [n];
        
        for (int i = 0; i < n; i++) {
            
            aleatorio[i]= numRandom.nextInt(101);
            System.out.print(aleatorio[i]+"   ");
            
        }
    
    }
}
