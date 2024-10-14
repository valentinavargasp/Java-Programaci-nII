//5 - Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo

import java.util.Scanner;

public class Clase1_Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el lado del cuadrado: ");
		int lado = teclado.nextInt();
		
		int perimetro = lado * 4;
		System.out.println("El perímetro del cuadrado es: " + perimetro);
	}

}
