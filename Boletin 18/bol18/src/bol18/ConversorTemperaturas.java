package bol18;

/**
 *
 * @author JayBGB
 */

public class ConversorTemperaturas {

    private final double LIMITE = 80;
    
    public float centigradosAFahrenheit (float centigrados){
    
        float fahrenheit = (float)(9.0f/5.0f * centigrados + 32.4);
        return fahrenheit;
    }
    
    public void centigradosAReamur (float centigrados){
    
        float reamur = (float)(4.0f/5.0f*centigrados);
    }
}
