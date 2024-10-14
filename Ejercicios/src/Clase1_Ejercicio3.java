/*3 – Generar 3 valores aleatorios comprendidos entre 0 y 10. 
 Mostrar el menor de los mismos.*/
public class Clase1_Ejercicio3 {

	public static void main(String[] args) {
		int valor1 = (int) (Math.random() * 11);
        int valor2 = (int) (Math.random() * 11);
        int valor3 = (int) (Math.random() * 11);
        
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("Valor 3: " + valor3);
        
        int menor = Math.min(valor1, Math.min(valor2, valor3)); //método Math.min
        
        System.out.println("El menor valor es: " + menor);
	}

}
