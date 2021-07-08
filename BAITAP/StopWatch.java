package Bai4_Class.BAITAP;
public class StopWatch {
   private long starTime;
   private long endTime;
   public StopWatch(){
   }
   public long start(){
       return this.starTime = System.currentTimeMillis();
   }
    public long stop(){
       return this.endTime = System.currentTimeMillis();
   }
   public long getElapsedTime(){
       return endTime - starTime;
   }
}
