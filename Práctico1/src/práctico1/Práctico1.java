
package práctico1;

import java.util.Scanner;

public class Práctico1 {


    public static void main(String[] args) {
        
        float acum=0;
        int cont=0;
        
        Scanner SC=new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("Ingrese N°"+i);
            int numero=SC.nextInt();
            
            acum+=numero;
            cont++;
        }
        
        System.out.println("La suma de los números ingresados es: "+acum);
        
        System.out.println("El promedio de los números ingresados es: "+(acum/cont));
    }
    
}
