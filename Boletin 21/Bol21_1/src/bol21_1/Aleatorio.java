package bol21_1;

import java.util.Random;

/**
 *
 * @author JayBGB
 */
public class Aleatorio {

    public void aleatorio(){
    
         int[] numeros = new int[6];
        Random random = new Random();
        
        // Rellenar el array con números aleatorios del 1 al 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }
        
        // Visualizar el array en el orden inverso
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
   
