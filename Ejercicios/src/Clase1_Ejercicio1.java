//1 -  Generar un valor aleatorio entre 0 y 1000. Mostrar la cantidad de dígitos que tiene dicho número.
public class Clase1_Ejercicio1 {

	public static void main(String[] args) {
		int valor = (int) (Math.random()*1001);
		System.out.println("El número " + valor + " tiene " + Integer.toString(valor).length() + " dígitos"); //investigado en internet.
    }
}
