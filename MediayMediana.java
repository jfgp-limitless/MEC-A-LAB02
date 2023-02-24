
package laboratorio2_1;


class MediayMediana{
    MediayMediana(){}
    
    public static void media(int[] arreglo) {
        int contador=0;
        float media=0, mediana=0;
        
        for (int i = 0; i < arreglo.length; i++) {
           
           contador+=arreglo[i];
        }
        media=contador/arreglo.length;
        System.out.println("La media es igual a: "+media);
    }
    
    
    public static void mediana(int[] arreglo) {
        
        int longitud = arreglo.length;
        int[] ordenado = new int[longitud];
        int temp;
        double mediana;
        
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
        
        
        System.out.println("Arreglo ordenado de menor a mayor: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(ordenado[i] + " ");
        }
        System.out.println(" ");
        
        
        
         if (arreglo.length % 2 == 0) { // Longitud par
            mediana = (double) (ordenado[arreglo.length / 2 - 1] + ordenado[arreglo.length / 2]) / 2;
        } else { // Longitud impar
            mediana = ordenado[arreglo.length / 2];
        }
        
        System.out.println("Mediana del arreglo: " + mediana);
        System.out.println(" ");
    }
    
    

}
