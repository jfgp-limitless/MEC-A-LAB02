
package laboratorio2_1;

class Varianza{
    Varianza(){}

    public static void varianza(int[] arreglo) {
        
        int contador=0;
        double promedio=0, sumatoria=0, varianza=0;
        
        for (int i = 0; i < arreglo.length; i++) {
           
           contador+=arreglo[i];
        }
        promedio=contador/arreglo.length;
        
        for(int i =0; i < arreglo.length; i++){
            sumatoria+=Math.pow((arreglo[i]-promedio),2.0);
        }
        
        varianza=(sumatoria/arreglo.length-1);
        System.out.println("La varianza es de: "+ varianza);
    }
    
    

}