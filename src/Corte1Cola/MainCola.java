package Corte1Cola;

public class MainCola {
    
    public static void main(String[] args) {
        
        Cola colitagud = new Cola();
        
        System.out.println(" === Welcome A La Cola En Estructura De Datos Y Analisis De Algoritmos === ");
        // agregar elementos a mi cola con el metodo push
        colitagud.push(15);
        colitagud.push(7);
        colitagud.push(150);
        
        // impresion gud
        System.out.println(" === Impresion De La Cola Con Los Elementos Ingresados === ");
        colitagud.imprimirColitagud();
        
        // mostrar el primer elemento
        System.out.println(" === Mostrar Primer Elemento De La Cola === ");
        colitagud.peek();
        
        // decir tamaño de la cola
        System.out.println(" === El Tamanho De La Cola Es: === " + colitagud.getTamanho());
        colitagud.getTamanho();
        
        // sacar un elemento 
        System.out.println(" === Sacando Un Elemento De La Cola === ");
        colitagud.pop();
        
        // impresion gud despues de sacar el elemento
        System.out.println(" === Impresion De La Cola Con Los Elementos Sacados === ");
        colitagud.imprimirColitagud();

        // vaciar la cola
        System.out.println(" === Vaciar La Cola Completamente === ");
        colitagud.eliminarCola();
        
        // intento de impresion la cola vacia
        colitagud.imprimirColitagud();
        
        // intento sacar elemento de la cola vacia
        colitagud.pop();
        
        // intento tamaño de la cola
        colitagud.getTamanho();
                        
    }  
}