package bol21;

import java.util.Random;



/**
 *
 * @author JayBGB
 */
public class Bol21_1 {
    
  
    
       
        
    

    public int [] createRandomArray (){
        
         Random rand = new Random();
         int low = 1;
         int high = 50;

         int [] numbers = new int [6];
         for(int i=0; i<numbers.length; i++){
            
            int randomNum= rand.nextInt((high - low)+1)+low;
            numbers[i]=randomNum;
        }
        
        return numbers;
    }
    
    public void showInvertedArray (int [] numbers){
         try{
         for(int i=5; i<numbers.length; i--){
            System.out.println("Numbers "+i+" --> "+ numbers[i]);
        }
        }catch(ArrayIndexOutOfBoundsException exception){}
    }
    
}
