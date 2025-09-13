package Corte1FigurasGeometricas;

/* Ejercicio en clase (para recordar POO): 
1. Debemos crear 5 clases: Figura, Circulo, Rectangulo, Triangulo y Cuadrado 2. Circulo, Rectangulo y Triangulo heredan de la clase 
Figura quien define el punto (x,y) y los métodos abstractos obtenerArea() y obtenerPerimetro() 3. Similarmente la clase Cuadrado hereda 
de la clase Rectangulo. 4. Recordando el concepto de herencia, cada clase hija debe implementar los métodos abstractos de la superclase. 
5. El objetivo es implementar las clases, incluyendo los getters & setters, y además crear la clase Main, donde crearemos una figura de 
cada clase hija e imprimiremos en consola su área y su perímetro. */

public class MainFigurasGeometricas {
    
    public static void main(String[] args) {
        
        Figura circulito = new Circulo(5.2, 0 ,0);
        Figura rectangulito = new Rectangulo(2.5,4.5,0,0);
        Figura triangulito = new Triangulo(2.5,3.5,0,0);
        Figura cuadratito = new Cuadrado(4,0,0);
        
        imprimirFigura("Circulo", circulito);
        imprimirFigura("Rectangulo", rectangulito);
        imprimirFigura("Triangulo", triangulito);
        imprimirFigura("Cuadrado", cuadratito); 
    }
    
    public static void imprimirFigura(String nombre, Figura figura){
        System.out.println(" === "+ nombre + " === ");
        System.out.println(" Area: " + figura.obtenerArea());
        System.out.println(" Perimetro: " + figura.obtenerPerimetro());
        System.out.println(" === ===");
        
    }
    
}