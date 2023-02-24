
package laboratorio2_1;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Ingrese la longitud del arreglo: ");
        int longitud = sc.nextInt();
        int[] arreglo = new int[longitud];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }
        
        
        System.out.println("Arreglo generado con números aleatorios: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\n");
        
        
        MediayMediana obj1 = new MediayMediana();// envia parametros al constructor(?)
        obj1.media(arreglo); //el obj de clase MediayMediana llama el metodo media de esa clase
        obj1.mediana(arreglo);
        
        Varianza obj2 = new Varianza();// crea obj de varianza constructor(?)
        obj2.varianza(arreglo);
        
        Desviacion_Estandar obj3 = new Desviacion_Estandar();// crea obj de varianza constructor(?)
        obj3.Desviacion_Estandar(arreglo);
        
        Moda obj4 = new Moda();// crea obj de varianza constructor(?)
        obj4.moda(arreglo);
        
    }
}