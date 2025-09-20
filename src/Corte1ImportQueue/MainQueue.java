package Corte1ImportQueue;

import java.util.Queue;
import java.util.LinkedList;

public class MainQueue {
    
    public static void main(String[] args) {
        
        Queue<Integer> gudcola = new LinkedList<Integer>();
        
        gudcola.add(1);
        gudcola.add(2);
        gudcola.add(3);
        gudcola.add(4);
        gudcola.add(5);     
        
        System.out.println(" El Tamanho " + gudcola.size());
        System.out.println(" El Primero De La Lista " + gudcola.peek());
        System.out.println(" Eliminar El Primero De La Cola " + gudcola.poll());
        System.out.println(" El Tamanho Nuevo Es: " + + gudcola.size());
        
        for (Integer elemento : gudcola) {
        System.out.println(elemento);
}
   
    }
}