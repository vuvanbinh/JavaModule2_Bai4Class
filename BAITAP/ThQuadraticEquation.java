package Bai4_Class.BAITAP;

import java.util.Scanner;

public class ThQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a :");
        double a = sc.nextDouble();
        System.out.println("Enter b :");
        double b = sc.nextDouble();
        System.out.println("Enter c :");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()<0){
            System.out.println("Phuong trinh vo nghiem ");
        }else {
            System.out.println(" Nghiem cua phuong trinh la : " +
                    quadraticEquation.getRoot1() +" , "+
                    quadraticEquation.getRoot2());
        }
    }
}
