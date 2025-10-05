package Taller1_EDA.Punto1;

public class TallerPunto1Main {
    
    public static void main(String[] args) {
        
        /* Instancia del gato */
        // Creamos un objeto Gato con color, raza y nombre
        Gato gatico = new Gato("Negro", "Felidae", "Simon");
        System.out.println(" ------ Gato ------");
        System.out.println("Nombre: " + gatico.getNombre());
        System.out.println("Color: " + gatico.getColor());
        gatico.hacerMovimiento();    // Muestra como se mueve el gato
        gatico.hacerSonido();        // Muestra el sonido del gato
        gatico.verificarPatas();     // Indica si tiene patas o no
        System.out.println("Tiene Dientes?: " + (gatico.tieneDientes() ? "Si" : "No"));
        
        /* Instancia del perro */
        // Creamos un objeto Perro con color, numero de patas, raza y nombre
        Perro perrito = new Perro("Dorado", 4, "Labrador", "Toby");
        System.out.println(" ------ Perro ------");
        System.out.println("Nombre: " + perrito.getNombre());
        System.out.println("Color: " + perrito.getColor());
        perrito.hacerMovimiento();
        perrito.hacerSonido();
        perrito.verificarPatas();
        System.out.println("Tiene Dientes?: " + (perrito.tieneDientes() ? "Si" : "No"));
        
        /* Instancia del gallo */
        // Creamos un objeto Gallo con color, especie y si puede volar
        Gallo gallito = new Gallo("Rojo Con Blanco", "Ave de Corral", true);
        System.out.println(" ------ Gallo ------");
        System.out.println("Color: " + gallito.getColor());
        gallito.hacerMovimiento();
        gallito.hacerSonido();
        gallito.verificarPatas();
        System.out.println("Tiene Dientes?: " + (gallito.tieneDientes() ? "Si" : "No"));
        System.out.println("Puede volar?: " + (gallito.ispuedeVolar() ? "Si" : "No")); // Muestra si el gallo puede volar
        
        /* Instancia del pato */
        // Creamos un objeto Pato con color, especie y si puede volar
        Pato patico = new Pato("Blanco", "Anade Real", true);
        System.out.println(" ------ Pato ------");
        System.out.println("Color: " + patico.getColor());
        patico.hacerMovimiento();
        patico.hacerSonido();
        patico.verificarPatas();
        System.out.println("Tiene Dientes?: " + (patico.tieneDientes() ? "Si" : "No"));
        System.out.println("Puede volar?: " + (patico.ispuedeVolar() ? "Si" : "No")); // Muestra si el pato puede volar
        
        /* Instancia del tiburon */
        // Creamos un objeto Tiburon que vive en el mar, con color y numero de patas
        Tiburon tiburoncito = new Tiburon(true, "Gris", 0);
        System.out.println(" ------ Tiburon ------");
        System.out.println("Color: " + tiburoncito.getColor());
        tiburoncito.hacerMovimiento();
        tiburoncito.hacerSonido();
        tiburoncito.verificarPatas();
        System.out.println("Tiene Dientes?: " + (tiburoncito.tieneDientes() ? "Si" : "No"));
        System.out.println("Vive en el mar?: " + (tiburoncito.isViveEnElMar() ? "Si" : "No")); // Indica si vive en el mar
        
        /* Instancia del bocachico */
        // Creamos un objeto Bocachico que NO vive en el mar, con color y numero de patas
        Bocachico bocachicito = new Bocachico(false, "Plateado", 0);
        System.out.println(" ------ Bocachico ------");
        System.out.println("Color: " + bocachicito.getColor());
        bocachicito.hacerMovimiento();
        bocachicito.hacerSonido();
        bocachicito.verificarPatas();
        System.out.println("Tiene Dientes?: " + (bocachicito.tieneDientes() ? "Si" : "No"));
        System.out.println("Vive en el mar?: " + (bocachicito.isViveEnElMar() ? "Si" : "No")); // Indica que no vive en el mar
    }
    
}