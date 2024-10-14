//Generar un valor aleatorio entre 2 y 100. Luego mostrar todos los valores pares que hay desde 2 hasta dicho valor.
public class Clase2_Ejercicio2 {

	public static void main(String[] args) {
		int aleatorio = 2 + (int)(Math.random() * 99);//Generamos valor aleatorio.
		int x = 2; //iniciamos contador en 2.
		System.out.println("Valores pares entre 2 y " + aleatorio);
		while (x <= aleatorio) {
			System.out.println(x);
			x=x+2; //también podemos usar x+=2;
		}
	}

}
