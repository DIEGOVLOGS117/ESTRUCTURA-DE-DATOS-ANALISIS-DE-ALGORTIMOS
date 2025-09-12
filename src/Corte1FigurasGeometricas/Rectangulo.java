package Corte1FigurasGeometricas;

public class Rectangulo extends Figura {
    
    protected double base;
    protected double altura;

    public Rectangulo() {}

    public Rectangulo(double base, double altura, int Puntox, int Puntoy) {
        super(Puntox, Puntoy);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
    
    
    @Override
    public double obtenerArea(){
        return base*altura;
    }
    
    @Override
    public double obtenerPerimetro(){
        return 2*(base+altura);
    }
    
}