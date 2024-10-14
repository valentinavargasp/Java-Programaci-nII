package gestorNotas;

public class Alumno {
    private String nombre;
    private String[] materias;
    private int[] notas;

    // Constructor
    public Alumno(String nombre, int cantMaterias) {
        this.nombre = nombre;
        this.materias = new String[cantMaterias];
        this.notas = new int[cantMaterias];
    }

    public void setMateria(int index, String materia) {
        this.materias[index] = materia;
    }

    public void setNota(int index, int nota) {
        this.notas[index] = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public String[] getMaterias() {
        return materias;
    }

    public int calcularPromedio() {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}
