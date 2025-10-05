package Taller1_EDA.Punto1;

// Clase Tiburon que extiende Pez
public class Tiburon extends Pez {

    // Constructor vacío
    public Tiburon() {
    }

    // Constructor con parámetros
    public Tiburon(boolean viveEnElMar, String color, int numeroDePatas) {
        super(viveEnElMar, color, numeroDePatas);
    }
    
    // Movimiento del tiburón
    @Override
    public void hacerMovimiento() {
        System.out.println("El Tiburo Nada En El Mar");
    }
    
    // Sonido del tiburón
    @Override
    public void hacerSonido() {
        System.out.println("El Tiburon No Hace Sonido Se Caracteriza Por Ser Un Pez Silencioso" ); 
    }
    
    // Indica que tiene dientes
    @Override
    public boolean tieneDientes() {
        return true;
    }
}