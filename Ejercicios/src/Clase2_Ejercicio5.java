// Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc. 
public class Clase2_Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Múltiplos de 8: ");
		int numero = 8;
	
		while (numero <= 500) {
			System.out.println(numero);
			numero += 8; //incremento el número de 8 en 8. Es igual que numero = numero + 8;
		}

	}

}
