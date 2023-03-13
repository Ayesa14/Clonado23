package bol18;

/**
 *
 * @author JayBGB
 */

public class ConversorTemperaturas {

    private static final float TEMPERATURA_MINIMA = 80.0f;

    public static float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion("Temperatura inferior a 80 grados Celsius.");
        }

        float fharenheit = (9.0f / 5.0f * centigrados) + 32.4f;
        return fharenheit;
    }

    public static float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion("Temperatura inferior a 80 grados Celsius.");
        }

        float reamur = (4.0f / 5.0f * centigrados);
        return reamur;
    }
}
