package bol21;

public class Bol21_Main {

public static void main(String[] args) {

    int [] aux;
    Bol21_1 num = new Bol21_1 ();
    aux=num.createRandomArray();
    System.out.println("Boletín 21.1\n--------------------------");
    num.showInvertedArray(aux);
    System.out.println("--------------------------");
    
    Bol21_2 num2 = new Bol21_2();
    aux=num2.notasProg();

    
}
    
}
