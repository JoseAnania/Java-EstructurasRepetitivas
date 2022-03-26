
package tareaguía3;

import java.util.Scanner;

public class TareaGuía3 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        int contN=0;
        int contPU=0;
        int contMU=0;
        int contMA=0;
        float acumTotal=0;
        float acumMA=0;
        
        int antiguedad=1;
        
        while(antiguedad !=0)
        {
            System.out.println("Ingrese la antiguedad del auto");
            antiguedad=SC.nextInt();
            
            if(antiguedad>=1 && antiguedad<=5)
            {
                System.out.println("NUEVO");
                contN++;
            }
            if (antiguedad>=6 && antiguedad<=10)
            {
                System.out.println("POCO USO");
                contPU++;
            }
            if(antiguedad>=11 && antiguedad<=20)
            {
                System.out.println("MUCHO USO");
                contMU++;
            }
            
            if(antiguedad>20)
            {
                System.out.println("MUY ANTIGUO");
                contMA++;
                acumMA+=antiguedad;
            }
            
            acumTotal+=antiguedad;
            
        }
                    
        int cantTotal=contN+contPU+contMU+contMA;
        System.out.println("Cantidad de autos ingresados " + cantTotal);
        
        System.out.println("Cantidad de autos POCO USO " + contPU);
        
        float promedio=(acumTotal-acumMA)/(contN+contPU+contMU);
        System.out.println("Promedio de antiguedad de autos que no son MUY ANTIGUOS " + promedio);
    }
    
}
