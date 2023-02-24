
package laboratorio2_1;


public class Moda {
    Moda(){}
        
    public static void moda(int[] arreglo) {
        int moda = 0;
        int modaFrecuencia = 0;
        int[] ordenado = new int[arreglo.length];
        int temp;
        
         //Dando valores a ordenado[]
         for (int i = 0; i < ordenado.length; i++) {
            ordenado[i]=arreglo[i];
        }
        
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (ordenado[j] > ordenado[j + 1]) {
                    temp = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = temp;
                }
            }
        }
        
        
        
        // Contar la frecuencia de cada número
        int frecuencia = 1;
        for (int i = 1; i < arreglo.length; i++) {
            if (ordenado[i] == ordenado[i-1]) {
                frecuencia++;
            } else {
                if (frecuencia > modaFrecuencia) {
                    modaFrecuencia = frecuencia;
                    moda = ordenado[i-1];
                }
                frecuencia = 1;
            }
        }
        
        // Comprobar si el último número es la moda
        if (frecuencia > modaFrecuencia) {
            modaFrecuencia = frecuencia;
            moda = ordenado[arreglo.length-1];
        }
        System.out.println(" ");
        System.out.println("La moda del arreglo es: " + moda + " con frecuencia " + modaFrecuencia);
    }
}