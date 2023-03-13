package bol21;

import com.jay.library.RequestData;

/**
 *
 * @author JayBGB
 */
public class Bol21_4 {

    public void calcularLetraDNI (){
        int numDni=RequestData.requestInt("Introduce tu número de DNI: ");
        int numLetra= numDni%23;
        
}
}
