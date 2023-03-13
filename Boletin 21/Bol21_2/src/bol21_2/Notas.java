package bol21_2;

import java.util.Scanner;

/**
 *
 * @author JayBGB
 */
public class Notas {
    
     // Declarar y crear el array de notas y de nombres
        int[] notas = new int[30];
        String[] nombres = {"Juan", "Pedro", "Ana", "María", "Luis", "Sofía", "David", "Elena", "Mario", "Lucía",
                            "Pablo", "Marta", "Isabel", "Jorge", "Carmen", "Rafael", "Sara", "Miguel", "Lucas", "Eva",
                            "José", "Natalia", "Antonio", "Carla", "Diego", "Cristina", "Héctor", "Paula", "Rubén", "Laura"};
        
        public void ponerNotas(){
        
            // Rellenar el array de notas con números aleatorios del 1 al 10
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10) + 1;
        }
        }

        public void calcularAprSusMed (){
        
            // Calcular el número de aprobados, de suspensos y la nota media
        int aprobados = 0;
        int suspensos = 0;
        int sumaNotas = 0;
        int notaMaxima = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            sumaNotas += notas[i];
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
        }
        double notaMedia = (double) sumaNotas / notas.length;
        
         // Visualizar el número de aprobados, de suspensos, la nota media y la nota máxima
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
        System.out.println("Nota media de la clase: " + notaMedia);
        System.out.println("Nota máxima de la clase: " + notaMaxima);
        }
        
        public void verAlumno(){
        
             // Visualizar la nota de un alumno determinado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine();
        int indiceAlumno = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreAlumno)) {
                indiceAlumno = i;
                break;
            }
        }
        if (indiceAlumno == -1) {
            System.out.println("No se ha encontrado el alumno.");
        } else {
            System.out.println("La nota de " + nombreAlumno + " es " + notas[indiceAlumno]);
        }
        }
        
        public void verAprobados(){
        
            // Visualizar una lista con el nombre de los alumnos aprobados
        System.out.println("Lista de alumnos aprobados:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i]);
            }
        }
        }
        
        public void ordenar (){
        
            // Ordenar las notas de menor a mayor
        for (int i = 0; i < notas.length - 1; i++) {
             for (int j = 0; j < notas.length - 1 - i; j++) {
                 if (notas[j] > notas[j + 1]) {
            // Intercambiar notas
                    int auxNota = notas[j];
                     notas[j] = notas[j + 1];
                    notas[j + 1] = auxNota;
            // Intercambiar nombres
                    String auxNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxNombre;
                        }
                     }
                    }
        
        // Visualizar la lista ordenada
                    System.out.println("Lista de alumnos ordenada por nota:");
                    for (int i = 0; i < notas.length; i++) {
                    System.out.println(nombres[i] + ": " + notas[i]);
                            }
                                         }
        
        public void verNotaAlumno(){
        
            // VIsualizar nota de alumno

            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el nombre del alumno: ");
            String nombreAlumno = scanner.nextLine();
            int indiceAlumno = -1;
            for (int i = 0; i < nombres.length; i++) {
                if (nombres[i].equalsIgnoreCase(nombreAlumno)) {
                indiceAlumno = i;
                 break;
                }
            }
            if (indiceAlumno == -1) {
                System.out.println("No se ha encontrado el alumno.");
            } else {
                System.out.println("La nota de " + nombreAlumno + " es " + notas[indiceAlumno]);
                }
        }
        
        
}
