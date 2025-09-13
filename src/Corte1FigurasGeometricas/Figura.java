package Corte1FigurasGeometricas;

public abstract class Figura {
    
    protected int Puntox; 
    protected int Puntoy;

    public Figura() {}

    public Figura(int Puntox, int Puntoy) {
        this.Puntox = Puntox;
        this.Puntoy = Puntoy;
    }

    public int getPuntox() {
        return Puntox;
    }

    public void setPuntox(int Puntox) {
        this.Puntox = Puntox;
    }

    public int getPuntoy() {
        return Puntoy;
    }

    public void setPuntoy(int Puntoy) {
        this.Puntoy = Puntoy;
    }
    
    public abstract double obtenerArea();
    public abstract double obtenerPerimetro(); // solo debe ir en ; el { es cuando implemento, y asi
    
}