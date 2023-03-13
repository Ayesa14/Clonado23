package stuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
import stuff.Libro;

public class Metodos{

    String titulo;
    public ArrayList<Libro> engadirLibros(ArrayList<Libro> aux){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Teclee o numero de libros distintos a engadir"));
        for(int i = 0; i < num; i++){
            Libro obx = new Libro(JOptionPane.showInputDialog("Libro nº" + (i+1) + "\nCal é o seu título?"),JOptionPane.showInputDialog("Libro nº" + (i+1) + "\nQuen é o autor?"), JOptionPane.showInputDialog("Libro nº" + (i+1) + "\nCal é o seu ISBN?"), Float.parseFloat(JOptionPane.showInputDialog("Libro nº" + (i+1) + "\nCal é o seu prezo?")), Integer.parseInt(JOptionPane.showInputDialog("Libro nº" + (i+1) + "\nCantas unidades a engadir?")));
            while(obx.getUnidades() < 1){
                obx.setUnidades(Integer.parseInt(JOptionPane.showInputDialog("Unidad incorrecta, non pode ser menor a 1\nIntentelo de novo")));
            }
            aux.add(obx);
        }
        return aux;
    }
  
    public void venderLibro(ArrayList<Libro> aux, String titulo){
    
        Iterator it = aux.iterator();
        Libro li;
        int bandera = 0;
        while(it.hasNext()){
            li = (Libro) it.next();
            if(li.getTitulo().equalsIgnoreCase(titulo) && li.getUnidades() == 0){
                System.out.println("No se puede vender este libro por que no tiene unidades, por favor dé de baixa os libros");
                bandera = 1;
            }
            else if(li.getTitulo().equalsIgnoreCase(titulo) && li.getUnidades() > 0){
                li.setUnidades((li.getUnidades()-1));
                System.out.println("Se ha vendido una unidad de " + li.getTitulo() + " qudan " + li.getUnidades() + " unidades");
                bandera = 1;
            }
        }
        if(bandera == 0){
            System.out.println("Libro no encontrado");
        }
    }
    
    public void amosarLibros(ArrayList<Libro> aux){
        Collections.sort(aux);
        for(Libro elemento : aux){
            System.out.println(elemento);
        }
    }
    
    public void darDeBaixa(ArrayList<Libro> aux){
        Iterator it = aux.iterator();
        Libro li;
        while(it.hasNext()){
            li = (Libro) it.next();
            if(li.getUnidades() == 0){
                System.out.println(li.getTitulo() + " ha sido borrado");
                it.remove();
            }
        }
    }
    
    
    public void consultarLibro(ArrayList<Libro> aux, String titulo){
        Iterator it = aux.iterator();
        Libro li;
        int bandera = 0;
        while(it.hasNext()){
            li = (Libro) it.next();
            if(li.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(li.toString());
                bandera = 1;
            }
        }
        if(bandera == 0){
            System.out.println(titulo + " no encontrado");
        }
    }
    


}