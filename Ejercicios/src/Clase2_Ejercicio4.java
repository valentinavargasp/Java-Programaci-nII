//Se ingresan un conjunto de n alturas de personas por teclado, ingresar n por teclado. Mostrar la altura promedio de las personas. 

import java.util.Scanner;

public class Clase2_Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
        System.out.print("Ingrese la cantidad de personas: ");
        int n = teclado.nextInt();
        
        // Variables para acumular las alturas y controlar el bucle while.
        double sumaAlturas = 0;
        int contador = 1;
        
        while (contador <= n ) {
        	System.out.println("Ingrese la altura de la  persona " + contador + " en metros");
        	double altura = teclado.nextDouble();
        	sumaAlturas = sumaAlturas + altura; //o sumaAlturas += altura;
        	contador++;
        }
        
     // Calcular el promedio
        double promedio = sumaAlturas / n;
        System.out.println("La altura promedio es: " + promedio + " metros.");
        
	}

}
