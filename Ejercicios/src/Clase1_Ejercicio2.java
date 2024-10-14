/*2 – Generar 3 valores aleatorios por teclado, calcular su promedio. 
 Mostrar un mensaje si dicho promedio es mayor o igual a 5 o menor.*/

import java.util.Scanner;

public class Clase1_Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 System.out.println("Ingrese el primer valor:");
	        int valor1 = teclado.nextInt();
	        
	        System.out.println("Ingrese el segundo valor:");
	        int valor2 = teclado.nextInt();
	        
	        System.out.println("Ingrese el tercer valor:");
	        int valor3 = teclado.nextInt();
	        
	        double promedio = (valor1 + valor2 + valor3) / 3;
	        System.out.println("El promedio de los 3 valores es: " + promedio);
	        
	        if (promedio >= 5) {
	            System.out.println("El promedio es mayor o igual a 5.");
	        } else {
	            System.out.println("El promedio es menor que 5.");
	        }
	        
	}
	
}
