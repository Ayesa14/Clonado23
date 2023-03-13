package bol21_2;

 import java.util.Scanner;

public class Bol21_2 {

  public static void main(String[] args) {
      
      Notas nota = new Notas();
      
      nota.ponerNotas();
      System.out.println("****************************************");
      nota.calcularAprSusMed();
      System.out.println("****************************************");
      nota.verAlumno();
      System.out.println("****************************************");
      nota.verAprobados();
      System.out.println("****************************************");
      nota.ordenar();
      System.out.println("****************************************");
      nota.verNotaAlumno();
      System.out.println("****************************************");
        
    }
    
}
