package practicas02;

public class SumaPeI {
    public static void main(String[] args) {
    int p=0,t=0;
    for(int i = 1; i<= 6; i++){
       
        if(i%2==0){
            
        p +=i;
        
        }
        else{
            
        t+=i;  
        
        }   
    }
    System.out.println("La suma de los tres primeros numeros pares es: "+p);
    System.out.println("La suma de los tres primeros numeros impares es: "+t);
    }
}