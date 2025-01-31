package gestorNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadAlumnos = 2; 
        Examen examen = new Examen(cantidadAlumnos, 6); // Nota mínima de aprobación

        // Creando el primer alumno
        Alumno alumno1 = new Alumno("Juan", 3);
        alumno1.setMateria(0, "Matemáticas");
        alumno1.setNota(0, 7); // Aprobada
        alumno1.setMateria(1, "Historia");
        alumno1.setNota(1, 5); // Reprobada
        alumno1.setMateria(2, "Biología");
        alumno1.setNota(2, 6); // Aprobada

        // Creando el segundo alumno
        Alumno alumno2 = new Alumno("Ana", 3);
        alumno2.setMateria(0, "Matemáticas");
        alumno2.setNota(0, 4); // Reprobada
        alumno2.setMateria(1, "Historia");
        alumno2.setNota(1, 8); // Aprobada
        alumno2.setMateria(2, "Biología");
        alumno2.setNota(2, 9); // Aprobada

        // Agregar alumnos al examen
        examen.agregarAlumno(alumno1);
        examen.agregarAlumno(alumno2);

        int opcion; // Declarar variable para opción del menú.

        do {
            // Menú de opciones
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar estado de las materias de los alumnos");
            System.out.println("2. Mostrar promedio de los alumnos");
            System.out.println("3. Mostrar materias con notas superiores al promedio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer opción del usuario
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    examen.mostrarDatos(); 
                    break;
                case 2:
                    examen.mostrarPromedioAlumnos(); 
                    break;
                case 3:
                    examen.mostrarMateriasSuperioresAlPromedio(); 
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida."); // Manejar opción no válida
            }
        } while (opcion != 4); // Repetir hasta que se seleccione salir

        sc.close(); //Cierro scanner.
    }
}


