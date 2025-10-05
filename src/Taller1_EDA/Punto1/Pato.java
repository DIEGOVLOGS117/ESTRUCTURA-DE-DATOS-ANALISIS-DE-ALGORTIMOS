package Taller1_EDA.Punto1;

// Clase Pato que extiende Ave
public class Pato extends Ave {

    // Constructor vacío
    public Pato() {
    }

    // Constructor que recibe color, especie y si puede volar (especie fija "Anade Real")
    public Pato(String color, String especie, boolean puedeVolar) {
        super(color, "Anade Real", puedeVolar);
    }
    
    // Indica que el pato puede volar
    @Override
    public boolean ispuedeVolar(){
        return true;
    }
    
    // Sonido del pato
    @Override
    public void hacerSonido() {
        System.out.println("El Pato hace: Cuac Cuac Cuac Cuac !");
    }

    // Movimiento del pato
    @Override
    public void hacerMovimiento() {
        System.out.println("El Pato Camina, Nada Y Vuela");
    }
    
    // Indica que no tiene dientes porque tiene pico
    @Override
    public boolean tieneDientes() {      
        System.out.println("El Pato Tiene Pico");    
        return false;  
    }
}