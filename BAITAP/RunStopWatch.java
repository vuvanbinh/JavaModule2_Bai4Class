package Bai4_Class.BAITAP;
import java.util.Scanner;
public class RunStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so 1 de bat dau");
        sc.nextInt();
        System.out.println(" time bat dau : " + stopWatch.start());
        System.out.println(" nhan so 0 de ket thuc");
        sc.nextInt();
        System.out.println(" time ket thuc : " + stopWatch.stop());
        System.out.println(" time chenh lech : " +    stopWatch.getElapsedTime());
    }
}
