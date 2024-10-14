package gestorNotas;

public class Examen {
    private Alumno[] alumnos;
    private int notaAprobacion;
    private int contador;

    // Constructor
    public Examen(int cantAlumnos, int notaAprobacion) {
        this.alumnos = new Alumno[cantAlumnos];
        this.notaAprobacion = notaAprobacion;
        this.contador = 0;
    }

    public void agregarAlumno(Alumno alumno) {
        if (contador < alumnos.length) {
            alumnos[contador] = alumno;
            contador++;
        }
    }

    public void mostrarDatos() {
        for (Alumno alumno : alumnos) {
            System.out.print("Alumno: " + alumno.getNombre() + " - ");
            for (int i = 0; i < alumno.getMaterias().length; i++) {
                String estado = (alumno.getNotas()[i] >= notaAprobacion) ? "APROBADA" : "REPROBADA";
                System.out.print(alumno.getMaterias()[i] + ": " + estado + " (" + alumno.getNotas()[i] + ") ");
            }
            System.out.println();
        }
    }

    public void mostrarPromedioAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("Promedio de " + alumno.getNombre() + ": " + alumno.calcularPromedio());
        }
    }

    public void mostrarMateriasSuperioresAlPromedio() {
        for (Alumno alumno : alumnos) {
            int promedio = alumno.calcularPromedio();
            System.out.println("Materias superiores al promedio de " + alumno.getNombre() + ":");
            for (int i = 0; i < alumno.getMaterias().length; i++) {
                if (alumno.getNotas()[i] > promedio) {
                    System.out.println(alumno.getMaterias()[i] + " con nota " + alumno.getNotas()[i]);
                }
            }
        }
    }
}


