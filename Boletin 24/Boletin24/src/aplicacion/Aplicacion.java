package aplicacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import stuff.Libro;
import stuff.Metodos;


public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        ArrayList<Libro> aux = new ArrayList();
        int num;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("1 --> Engadir libros\n2 --> Vender libros\n3 --> Amosar libros\n4 --> Dar de baixa os libros\n5 --> Consultar libro"));
            switch(num){
                case 1:
                    obx.engadirLibros(aux);
                    break;
                case 2:
                    obx.venderLibro(aux, JOptionPane.showInputDialog("Teclee o titulo a vender"));
                    break;
                case 3:
                    obx.amosarLibros(aux);
                    break;
                case 4:
                    obx.darDeBaixa(aux);
                    break;
                case 5:
                    obx.consultarLibro(aux,JOptionPane.showInputDialog("Teclee o titulo do libro a consultar"));
                    break;
                default:
                    System.out.println("Saíndo do programa");
            }
        }while (num > 0 && num < 6);
    }
    
}