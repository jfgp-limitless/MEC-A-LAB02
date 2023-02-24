import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int can_carros;
        can_carros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos que quiere registrar: "));
        
        
        Carro car = new Carro();// envia parametros al constructor(?)
        car.arreglo(can_carros); //el obj de clase MediayMediana llama el metodo media de esa clase
        //obj1.mediana(arreglo);
        
    }
  
    
}