
package laboratorio2_2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String input = sc.nextLine().toLowerCase();
        char[] caracteres = input.toCharArray();
        char caracterMasRepetido = ' ';
        int cantidadMasRepetido = 0;

        for (char c : caracteres) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                int cantidad = contarCaracter(input, obtenerCaracterMasRepetido(input));
                if (cantidad > cantidadMasRepetido) {
                    caracterMasRepetido = obtenerCaracterMasRepetido(input);
                    cantidadMasRepetido = cantidad;
                }
                c = caracterMasRepetido;
            }
            System.out.print(c);
        }
        System.out.println("\nCaracter más repetido: " + caracterMasRepetido + " (" + cantidadMasRepetido + " veces)");
        reversarpalabra(input);
    }

    public static char obtenerCaracterMasRepetido(String input) {
        char[] caracteres = input.toCharArray();
        char caracterMasRepetido = ' ';
        int cantidadMasRepetido = 0;

        for (char c : caracteres) {
            int cantidad = contarCaracter(input, c);
            if (cantidad > cantidadMasRepetido) {
                caracterMasRepetido = c;
                cantidadMasRepetido = cantidad;
            }
        }
        return caracterMasRepetido;
    }

    public static int contarCaracter(String input, char c) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    
    public static void reversarpalabra(String input){
        
        String nstr="";
		char ch;
        
    for (int i=0; i<input.length();i++)
	{
		ch= input.charAt(i);
		nstr= ch+nstr; 
	}
	System.out.println("Palabra Invertida: "+ nstr);
	} 
    
}