package Corte1FigurasGeometricas;

public class Circulo extends Figura {
    
    protected double radio;

    public Circulo() {}

    public Circulo(double radio, int Puntox, int Puntoy) {
        super(Puntox, Puntoy);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
        return Math.PI * radio * radio;
    }
    
    @Override
    public double obtenerPerimetro(){
        return 2 * Math.PI * radio ;
    }
    
}