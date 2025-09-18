package ImportStack;

import java.util.Stack;

public class MainStack {
    
    public static void main(String[] args) {
        
        Stack pilagud = new Stack();
        
        pilagud.add(1);
        pilagud.add(2);
        pilagud.add(7);
        pilagud.add(4);
        pilagud.push(5);
        
        System.out.println("La Cima De La Pila Es: " + pilagud.peek());
        System.out.println("Sacado Elemento De La Pila: " + pilagud.pop());
        
        
        
        
        
    }
}