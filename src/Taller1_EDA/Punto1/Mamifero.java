package Taller1_EDA.Punto1;

// Clase abstracta Mamifero que extiende AnimalesVertebrados
public abstract class Mamifero extends AnimalesVertebrados {
    
    // Atributos propios de mamíferos
    protected String raza;
    protected String nombre;
    
    // Constructor vacío
    public Mamifero(){}
    
    // Constructor que recibe color, número de patas (por defecto 4), raza y nombre
    public Mamifero (String color, int numeroDePatas, String raza, String nombre) {
        super(color, 4); // mamíferos siempre con 4 patas
        this.raza = raza;
        this.nombre = nombre;
    }

    // Getters y setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // toString personalizado para mamíferos
    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", nombre=" + nombre + '}';
    }  
}