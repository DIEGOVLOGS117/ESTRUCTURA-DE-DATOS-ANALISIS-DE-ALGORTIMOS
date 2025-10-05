package Taller1_EDA.Punto1;

// Clase abstracta Pez que extiende AnimalesVertebrados
public abstract class Pez extends AnimalesVertebrados {
    
    // Atributo que indica si vive en el mar o no
    protected boolean viveEnElMar;

    // Constructor vacío
    public Pez() {
    }

    // Constructor que recibe si vive en el mar, color y número de patas
    public Pez(boolean viveEnElMar, String color, int numeroDePatas) {
        super(color, numeroDePatas);
        this.viveEnElMar = viveEnElMar;
    }

    // Getter para viveEnElMar
    public boolean isViveEnElMar() {
        return viveEnElMar;
    }  
}