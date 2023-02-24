
package laboratorio2_1;

class Desviacion_Estandar{
    Desviacion_Estandar(){}

    public static void Desviacion_Estandar(int[] arreglo) {
        
        int contador=0;
        double promedio=0, sumatoria=0, des_est=0;
        
        for (int i = 0; i < arreglo.length; i++) {
           
           contador+=arreglo[i];
        }
        promedio=contador/arreglo.length;
        
        for(int i =0; i < arreglo.length; i++){
            sumatoria+=Math.pow((arreglo[i]-promedio),2.0);
        }
        
        des_est=Math.sqrt((sumatoria/arreglo.length-1));
        System.out.println("La Desviacion Estandar es de: "+ des_est);
    }
    
    

}
