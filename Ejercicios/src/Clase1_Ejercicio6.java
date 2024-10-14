/*6 - Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. 
  Mostrar lo que debe abonar el comprador.*/

import java.util.Scanner;

public class Clase1_Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del artículo: ");
		double precio = teclado.nextDouble();
		
		System.out.println("Ingrese la cantidad de artículos que lleva el cliente: ");
		int cantidad = teclado.nextInt();
		
		double total = precio * cantidad;
		
		System.out.println("El comprador debe abonar el siguiente monto:  $" + total);

	}

}
