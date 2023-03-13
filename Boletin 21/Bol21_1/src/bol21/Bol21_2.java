package bol21;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author JayBGB
 */
public class Bol21_2 {
    
    
    public int [] notasProg (){
        
        int aprobados = 0;
        int suspensos = 0;
        int suma=0;
        int media=0;
        int alta=0;
        
       /** Random rand = new Random();
         int min = 0;
         int max = 10; **/
    
         int [] notas = new int [30];
         
         for(int i=0;i<notas.length;i++){
            // int randomNum= rand.nextInt((max - min)+1)+min;
             int randomNum= (int)(Math.round(Math.random()*10));
             notas[i]=randomNum;
             System.out.println(notas[i]);
             
         }
         
         for (int j=0; j<notas.length;j++){
                 
                 
                 if(notas[j]>=5){
                     aprobados++;
                 }
                 
                 suma+=notas[j];
               
             }
         
             
         suspensos = notas.length-aprobados;
         media=suma/notas.length;
         
         Arrays.sort(notas);
         alta=notas[notas.length-1];
         
         
         System.out.println("Aprobados --> " + aprobados + "\n Suspensos --> "+suspensos+"\n Media --> "+media+"\n Nota más alta --> "+alta);
         
         return notas;
    }
    
    
    //public static String[] notasDeAlumnos (int [] notas, String [] alumnos){
    
        
    //}

}
