package bol19;

public class Canario implements IPodeCantar {
    
    @Override
    public void cantar (){
    
        String cantoCanario = "Pío, pío. Creo que he visto un lindo gatito.";
        System.out.println(cantoCanario);
    }

}
