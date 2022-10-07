package _extend.exercise;

public class PC extends Computer{

    public String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void getPcDetail() {
        System.out.println(this.getDetails() + "--品牌" + this.brand);
    }
}
