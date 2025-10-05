package Taller1_EDA.Punto1;

public class Gato extends Mamifero {
    
    // Constructor vacío, permite crear un objeto Gato sin inicializar atributos
    public Gato (){}
    
    // Constructor que recibe color, raza y nombre para inicializar el objeto Gato
    public Gato (String color, String raza, String nombre) {
        // Llama al constructor de la clase padre Mamifero,
        // con el color, número de patas fijo en 4, raza y nombre
        super (color,4,raza,nombre);
    }

    // Sobrescribe el método getNombre para devolver el nombre del gato
    @Override
    public String getNombre() {
        return nombre;
    }
    
    // Sobrescribe el método hacerMovimiento para definir cómo se mueve el gato
    @Override
    public void hacerMovimiento(){
        System.out.println("El Gato Camina En Cuatro Patas, Camina Y Salta ");
    }
    
    // Sobrescribe el método hacerSonido para definir el sonido que hace el gato
    @Override
    public void hacerSonido(){
        System.out.println("El Gato Hace Miauuuuuuuu!"); 
    }
    
    // Sobrescribe el método tieneDientes para indicar que el gato sí tiene dientes
    @Override
    public boolean tieneDientes(){
        return true;
    }
    
}