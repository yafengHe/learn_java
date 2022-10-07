package homework;

public class Music {
    String name;
     double times;

     public Music(String name, double times) {
         this.name = name;
         this.times = times;
     }

     public void play() {
         System.out.println("play");
     }

    public String getInfo() {
         return name + "-" + times;
    }
}
