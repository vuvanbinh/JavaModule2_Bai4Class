package Bai4_Class.BAITAP;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a,double b ,double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }
    public double getDiscriminant(){
        return b*b-(4*a*c);
    }
    public double getRoot1(){
        return (-b+Math.pow(b*b-(4*a*c),0.5))/a*2;
    }
     public double getRoot2(){
        return (-b-Math.pow(b*b-(4*a*c),0.5))/a*2;
    }
}

