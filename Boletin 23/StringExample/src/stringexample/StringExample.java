package stringexample;

public class StringExample {

public static void main(String[] args) {
    
        String name = "Nabuconodosor";
        
        // 1 - Contar nº de letras.
        
        System.out.println(name.length());
        System.out.println("--------------------------------");
        
        // 2 - Cambiar a mayúsculas.
        
        System.out.println(name.toUpperCase());
        System.out.println("--------------------------------");
        
        // 3 - Cambiar a minúsculas.
        
        System.out.println(name.toLowerCase());
        System.out.println("--------------------------------");
        
        // 4 - Comparar con el nombre inicial Nabuconodosor.
        
        System.out.println(name.compareTo("Nabuconodosor"));
        System.out.println("--------------------------------");
        
        // 5 - Comparar con el nombre inicial NaBucoNodosor sin tener en cuenta las mayúsculas y/o minúsculas.
        
        System.out.println(name.compareToIgnoreCase("NaBucoNodosor"));
        System.out.println("--------------------------------");
        
        // 6- Pasar el nombre a un array de char.
        
        char [] ch = name.toCharArray();
        for (char c:ch){
            System.out.println(c);
        }
        System.out.println("--------------------------------");
        
        // 7 - Cortar por la C --> Nabu
        
        String cortado[] = name.split("conodosor");
        for (String corta: cortado){
            System.out.println(corta);
        }
        System.out.println("--------------------------------");
    }
    
}
