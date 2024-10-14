//8 - Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo. 

import java.util.Scanner;

public class Clase1_Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un valor entero: ");
		int numero = teclado.nextInt();
		
		if (numero > 0) {
			System.out.println("El número es positivo.");
		} else if (numero == 0){
			System.out.println("El número es nulo.");
		} else {
			System.out.println("El número es negativo.");
		}
	}

}
