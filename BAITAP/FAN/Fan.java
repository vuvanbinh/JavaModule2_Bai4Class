package Bai4_Class.BAITAP.FAN;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = SLOW;
    private boolean on ;
    private double  radius = 5;
    private String color = "blu";



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public static boolean getOn(){
        return false;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Fan(){
    }

    public String toString(){
        if(on){
           return  " speed : "+ speed+
                   ", color : "+ color+
                   ", radius : "+ radius+
                   ", Fan is on ";
        }else return  " speed : "+ speed+
                    ", color : "+ color+
                    ", radius : "+ radius+
                    ", Fan is off ";
    }
}
