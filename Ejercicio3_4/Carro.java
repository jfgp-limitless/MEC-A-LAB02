import javax.swing.JOptionPane;

public class Carro {
    Carro(){}
    
    public static void arreglo(int arreglo) {
       
        String []marca= new String[arreglo];
        String []color= new String[arreglo];
  
        int []modelo= new int[arreglo];
        int []km=new int[arreglo];
        
      
        for(int i=0; i<arreglo ; i++){
            
           String marca_str = JOptionPane.showInputDialog(null, "Introduce la Marca:");
           marca[i]=marca_str;
           
           int modelo_int = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Modelo:"));
           modelo[i]=modelo_int;
           
           String color_str = JOptionPane.showInputDialog(null, "Introduce el Color:");
           color[i]=color_str;
           
           int km_int = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Kilometraje:"));
           km[i]=km_int;
            
        }
        System.out.println(" ");
        System.out.println("Marca - Modelo - Color - Km");
        for(int i=0;i < arreglo;i++){
            System.out.println(marca[i]+" - "+ modelo[i]+ " - "+color[i]+" - "+km[i]);
        }
        
        int n = arreglo;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (modelo[j] > modelo[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = modelo[j];
                    modelo[j] = modelo[j + 1];
                    modelo[j + 1] = temp;
                }
            }
        }
        
         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (km[j] > km[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = km[j];
                    km[j] = km[j + 1];
                    km[j + 1] = temp;
                }
            }
        }
         
        System.out.println("");
        System.out.println("Lista organizada por km");
        for(int i=0; i<arreglo ; i++){
               
            System.out.print(km[i]+" ");    
        }
        
        System.out.println("");
        System.out.println("Lista organizada por modelo");
        for(int i=0; i<arreglo ; i++){
               
            System.out.print(modelo[i]+" ");
               
        }
        System.out.println("");
        
         
    }
}
