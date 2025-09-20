package Corte1ImportLinkedList;

import java.util.LinkedList;

public class MainLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList linkedgud = new LinkedList();
        
        linkedgud.add(7);
        linkedgud.add(17);
        linkedgud.add(15);
        
        int tamanho = linkedgud.size();
        int i =0;
        System.out.println("Inicio");
        while(i<tamanho){
            System.out.println(" -> " + linkedgud.get(i));
            i++;
        }
        System.out.println(" -> Null");
        
        linkedgud.removeFirst();
        linkedgud.removeLast();
        linkedgud.remove(1); 
        
    }
}