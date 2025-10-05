package Taller1_EDA.Punto1;

// Clase Perro que extiende Mamifero
public class Perro extends Mamifero {

    // Constructor que recibe color, número de patas, raza y nombre
    public Perro(String color, int numeroDePatas, String raza, String nombre) {
        super(color, 4, raza, nombre);
    }
    
    // Movimiento del perro
    @Override
    public void hacerMovimiento() {
        System.out.println("El Perro Corre, Camina Y Salta ");
    }
    
    // Sonido del perro
    @Override
    public void hacerSonido() {
        System.out.println("El Perro Hace Guau Guau Guau Guau!");
    }

    // Indica que tiene dientes
    @Override
    public boolean tieneDientes() {
        return true;
    }  
}