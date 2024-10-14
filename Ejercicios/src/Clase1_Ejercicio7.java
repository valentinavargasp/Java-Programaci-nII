//7 - Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".

import java.util.Scanner;

public class Clase1_Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la primer nota: ");
		double nota1 = teclado.nextDouble();
		
		System.out.println("Ingrese la segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		System.out.println("Ingrese la tercer nota: ");
		double nota3 = teclado.nextDouble();
		
		double promedio = (nota1 + nota2 + nota3) / 3;
		
		if (promedio >= 7) {
            System.out.println("Promocionado");
        } else {
            System.out.println("No promocionado");
        }
	}

}
