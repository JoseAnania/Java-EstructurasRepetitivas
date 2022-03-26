
package práctico2;

import java.util.Scanner;

public class Práctico2 {


    public static void main(String[] args) {
        
        int cont5=0;
        
        Scanner SC=new Scanner (System.in);
        
        System.out.println("Cantidad de números a ingresar: ");
        int cantNros=SC.nextInt();
        
        int numeros=0;
        
        for (int i = 0; i < cantNros; i++) {
            
            System.out.println("Ingrese el N° " + (i+1));
            numeros=SC.nextInt();
            
            if(numeros>5)
            {
                cont5++;
            }
        }
        
        System.out.println("Se ingresaron " + cont5 + " números mayores a 5");
        
    }
    
}
