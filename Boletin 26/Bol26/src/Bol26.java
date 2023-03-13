
import java.util.ArrayList;

public class Bol26 {
       
         public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(3);

        Operaciones<Integer> operaciones = new Operaciones<>();

        System.out.println("Minimo: " + operaciones.min(list)); // debería imprimir "Minimo: 2"
        System.out.println("Maximo: " + operaciones.max(list)); // debería imprimir "Maximo: 10"
        System.out.println("Posicion del elemento 8: " + operaciones.search(list, 8)); // debería imprimir "Posicion del elemento 8: 3"
        System.out.println("Posicion del elemento 4: " + operaciones.search(list, 4)); // debería imprimir "Posicion del elemento 4: -1"
    }
    }
    

