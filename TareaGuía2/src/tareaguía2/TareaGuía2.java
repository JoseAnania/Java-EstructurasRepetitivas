
package tareaguía2;

import java.util.Scanner;

public class TareaGuía2 {


    public static void main(String[] args) {
        
        int contClas=0;
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Ingrese el tiempo del ganador en segundos: ");
        int segGanador=SC.nextInt();
        
        for (int i = 2; i <= 10; i++) {
            
            System.out.println("Ingrese el tiempo del corredor que llego en el " + i + "° puesto");
            int segResto=SC.nextInt();
            
            float tiempoClas=(segGanador*0.15f)+segGanador;
            
            if(segResto<tiempoClas)
            {
                System.out.println("Clasificó a la carrera");
                contClas++;
            }
            else
            {
                System.out.println("No clasificó a la carrera");
            }
        }
        
        System.out.println("Cantidad de corredores clasificados a la carrera "+(contClas+1));
    }
    
}
