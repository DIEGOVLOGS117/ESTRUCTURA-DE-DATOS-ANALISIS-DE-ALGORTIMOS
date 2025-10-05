package Taller1_EDA.Punto1;

// Clase abstracta Ave que extiende AnimalesVertebrados
public abstract class Ave extends AnimalesVertebrados {
    
    // Atributos propios de las aves
    private String especie; // especie del ave
    private boolean puedeVolar; // indica si puede volar o no
             
    // Constructor vacío
    public Ave(){}
    
    // Constructor que recibe color, especie y si puede volar; por defecto las aves tienen 2 patas
    public Ave(String color, String especie, boolean puedeVolar){ 
        super(color, 2); // llama al constructor padre con color y número de patas = 2
        this.especie = especie;
        this.puedeVolar = puedeVolar;
    }

    // Constructor que solo recibe especie
    public Ave(String especie) {
        this.especie = especie;
    }

    // Getters y setters para especie
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    // Método que indica si el ave puede volar, siempre retorna true (se puede mejorar)
    public boolean ispuedeVolar(){
        return true;
    }
    
    // Método que indica si las aves tienen dientes, siempre false porque tienen pico
    @Override
    public boolean tieneDientes() { 
        System.out.println("Las Aves Tienen Pico");
        return false;
    }
}