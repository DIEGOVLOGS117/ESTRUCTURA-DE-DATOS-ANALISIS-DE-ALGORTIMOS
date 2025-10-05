package Taller1_EDA.Punto1;

// Clase abstracta que representa los animales vertebrados, no se puede instanciar directamente
public abstract class AnimalesVertebrados { 

    // Atributos protegidos para que las clases hijas puedan acceder directamente
    protected String color;      
    protected int numeroDePatas;
    
    // Constructor vacío
    public AnimalesVertebrados (){}
    
    // Constructor que recibe color y número de patas para inicializar los atributos
    public AnimalesVertebrados (String color, int numeroDePatas){  
        this.color = color;
        this.numeroDePatas = numeroDePatas;      
    }
    
    /* Getters y Setters */

    public String getColor() {  
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    
    // Métodos abstractos que deben implementar las clases hijas
    public abstract void hacerMovimiento(); 
    public abstract void hacerSonido();
    public abstract boolean tieneDientes();
    
    // Método que verifica si el animal tiene patas y lo imprime
    public void verificarPatas() { 
        if(this.numeroDePatas > 0) {
            System.out.println("El Animal Tiene Patas");
        } else {
            System.out.println("El Animal No Tiene Patas");
        }
    }  
    
    // Método toString sobrescrito para mostrar información  del animal
    @Override
    public String toString() {
        return "El animal es de color " + color + " y tiene " + numeroDePatas + " patas.";
    }
}
