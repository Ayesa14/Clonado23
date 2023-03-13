package bol19;

public class Persona implements IPodeCantar {
    
    @Override
    public void cantar (){
    
        String notas = "Do-Re-Mi-Fa-Sol-La-Si-Do";
        System.out.println(notas);
    }

}
