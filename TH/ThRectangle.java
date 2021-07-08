package Bai4_Class.TH;

import Bai4_Class.TH.Rectangle;

import java.util.Scanner;

public class ThRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Width :");
        int weight =sc.nextInt();
        System.out.println("Enter the Height :");
        int height = sc.nextInt();
        Rectangle rectangle = new Rectangle(weight,height);
        System.out.println(" The width of the rectangle is : "+ rectangle.getWidth());
        System.out.println(" The height of the rectangle is : "+ rectangle.getHeight());
        System.out.println(" The perimeter of the rectangle is : "+ rectangle.getPerimeter());
        System.out.println(" The area of the rectangle is : "+ rectangle.getArea());
    }
}
