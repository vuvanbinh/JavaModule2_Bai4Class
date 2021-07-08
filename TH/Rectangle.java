package Bai4_Class.TH;

public class Rectangle {
    private int width;
    private int height;

     public Rectangle(){
    }
    public Rectangle(int weight,int height){
         this.width = weight;
         this.height = height;
    }
    public int getWidth(){
         return width;
    }
    public int getHeight(){
         return height;
    }
    public void setWidth(int width){
         this.width=width;
    }
    public void setHeight(int height){
         this.height=height;
    }
    public int getPerimeter(){
         return (width+height)*2;
    }
    public int getArea(){
         return width*height;
    }
}
