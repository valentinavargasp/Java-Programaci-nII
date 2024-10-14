package composicion;

public class Cliente {
	//Atributos
	private String nombre;
	private int monto;

	//Constructor
	public Cliente(String nom) {
		nombre = nom;
		monto = 0;
	}

	//Métodos
	public void depositar(int m) {
		monto = monto + m;
	}

	public void extraer(int m) {
		monto = monto - m;
	}

	public int retornarMonto() {
		return monto;
	}

	public void imprimir() {
		System.out.println(nombre + " tiene depositado la suma de " + monto);
	}

}
