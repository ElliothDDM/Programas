package Practicas02;

public class Abecedario {
    
    public static void main(String[] args) {
        char ch = 'a';
        while (ch <= 'z') {
            System.out.print(Character.toUpperCase(ch)+ "" + ch + " ");
            ch++; 
        }
    }
}
