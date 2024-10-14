//4 -  Calcular el sueldo mensual de un operario conociendo la cantidad de horas trabajadas y el pago por hora.

import java.util.Scanner;

public class Clase1_Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de horas trabajadas en el mes: ");
		int horasTrabajadas = teclado.nextInt();
		
		System.out.println("Ingrese el pago por hora: ");
		double pagoHora = teclado.nextDouble();
		
		double sueldoMes = horasTrabajadas * pagoHora;
		System.out.println("El sueldo mensual del operario es: $" + sueldoMes);

	}

}
