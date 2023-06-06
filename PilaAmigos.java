
package practicas02;

import java.util.Scanner;
import java.util.Stack;

public class PilaAmigos {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        Stack<String> amigos = new Stack<>();
    
        System.out.println("Ingrese la cantidad de amigos:");
        int TotalAmigos = lec.nextInt();
        
        System.out.println("Ingrese el nombre de sus amigos: ");
        for (int i = 0; i <= TotalAmigos; i++) {
            
            String nomAmigo = lec.nextLine();
            amigos.push(nomAmigo);
            
        }
        
        System.out.println("Sus AMIGOS :) :");
        while(!amigos.isEmpty()){
            System.out.println(amigos.pop());
            
        }
    }
}
