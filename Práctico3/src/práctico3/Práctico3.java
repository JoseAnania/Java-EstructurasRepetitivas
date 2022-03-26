
package práctico3;

import java.util.Scanner;

public class Práctico3 {


    public static void main(String[] args) {
     
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Ingrese un número positivo ");
        int nroPositivo=SC.nextInt();
        
        while(nroPositivo <0)
        {
            System.out.println("Debe ingresar un número POSITIVO");
            
            nroPositivo=SC.nextInt();
        }
        
        System.out.println("Se ingresó correctamente un número positivo");
        
    }
    
}
