package bol18;

import java.util.Scanner;

public class Bol18 {

public static void main(String[] args) {
    
      Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados centigrados: ");
        float centigrados = scanner.nextFloat();

        try {
            float fharenheit = ConversorTemperaturas.centigradosAFharenheit(centigrados);
            System.out.println("Temperatura en grados Fharenheit: " + fharenheit);

            float reamur = ConversorTemperaturas.centigradosAReamur(centigrados);
            System.out.println("Temperatura en grados Reamur: " + reamur);
        } catch (TemperaturaErradaExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
        
    }
    
}
