package com.jamc.app_s3;

public class Operaciones {
    private double n1,n2;
//Constructor
    public Operaciones(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
//Constructor Vacio
    public Operaciones() {
    }
//Metodos Getter and Setter
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

//Metodos para las Operaciones
    public double Sumar(double n1, double n2){
        double Suma;
        Suma = n1+n2;
        return Suma;
    }
    public double Restar(double n1, double n2){
        double Resta;
        Resta = n1-n2;
        return Resta;
    }
    public double Multiplicar(double n1, double n2){
        double Multiplicacion;
        Multiplicacion = n1*n2;
        return Multiplicacion;
    }
    public double Dividir(double n1, double n2){
        double Division;
        Division = n1/n2;
        return Division;
    }
}
