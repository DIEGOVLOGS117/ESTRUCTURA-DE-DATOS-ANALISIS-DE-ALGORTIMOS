package Taller1_EDA.Punto1;

// Clase Gallo que extiende Ave
public class Gallo extends Ave{

    // Constructor vacío
    public Gallo() {
    }

    // Constructor que recibe color, especie y si puede volar (especie siempre "Ave De Corral")
    public Gallo(String color, String especie, boolean puedeVolar) {
        super(color, "Ave De Corral", puedeVolar);
    }
    
    // Indica que el gallo puede volar (aunque corto)
    @Override
    public boolean ispuedeVolar(){
        return true;
    }
    
    // Sonido del gallo
    @Override
    public void hacerSonido() {
        System.out.println("El gallo hace: Kikiriki!");
    }

    // Movimiento del gallo
    @Override
    public void hacerMovimiento() {
        System.out.println("El Gallo Camina Y Vuela Cortas Distancias");
    }
    
    // Indica que no tiene dientes porque tiene pico
    @Override
    public boolean tieneDientes() {
        System.out.println("Los Gallos Tienen Pico");
        return false;
    }
}