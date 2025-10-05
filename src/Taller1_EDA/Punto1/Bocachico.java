package Taller1_EDA.Punto1;

public class Bocachico extends Pez {

    // Constructor vacío
    public Bocachico() {
    }

    // Constructor con parámetros
    public Bocachico(boolean viveEnElMar, String color, int numeroDePatas) {
        super(viveEnElMar, color, numeroDePatas);
    }
    
    // Override para indicar que no vive en el mar (vive en agua dulce)
    @Override
    public boolean isViveEnElMar() {
        return false;
    }

    // Movimiento del Bocachico
    @Override
    public void hacerMovimiento() {
        System.out.println("El Bocachico Nada En Aguas Dulces");
    }

    // Sonido que emite el Bocachico
    @Override
    public void hacerSonido() {
        System.out.println("El Bocachico No Emite Sonidos, Pero Segun Pescadores Similar A Un Ronquido");
    }

    // Indica que tiene dientes
    @Override
    public boolean tieneDientes() {
        return true;
    }
}