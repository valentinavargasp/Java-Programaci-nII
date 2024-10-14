import java.util.Scanner;

public class Clase2_Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de números que desea cargar: ");
		int n = teclado.nextInt();
		
		int contador = 0;
		int pares = 0;
		int impares = 0;
		
		while (contador < n) {
			System.out.println("Ingrese un número: ");
			int valor = teclado.nextInt();
			
			if (valor % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
			contador++;
		}
		
		System.out.println("Cantidad de números pares: " + pares);
		System.out.println("Cantidad de números impares: " + impares);
	}

}
