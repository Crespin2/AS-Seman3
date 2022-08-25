package com.jamc.app_s1;

public class operaciones {
    double dato1;
    double dato2;

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    public operaciones(){

    }

    public operaciones(double dato1, double dato2){
        this.dato1=dato1;
        this.dato2=dato2;
    }

    public double Sumar(double a, double b){
        double sum;
        sum=a+b;
        return sum;
    }

    public double Restar(double a, double b){
        double res;
        res=a-b;
        return res;
    }

    public double Multiplicar(double a, double b){
        double mul;
        mul=a*b;
        return mul;
    }

    public double Dividir(double a, double b){
        double divi;
        divi=a/b;
        return divi;
    }
}
