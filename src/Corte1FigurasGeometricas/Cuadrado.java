package Corte1FigurasGeometricas;

public class Cuadrado extends Rectangulo {

    public Cuadrado() {}

    public Cuadrado(double lado, int puntoX, int puntoY) {
        super(lado, lado, puntoX, puntoY);  // base y altura iguales
    }

    public double getLado() {
        return base; // o altura, son iguales
    }

    public void setLado(double lado) {
        this.base = lado;
        this.altura = lado;
    }

}