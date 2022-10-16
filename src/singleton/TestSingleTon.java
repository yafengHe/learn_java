package singleton;

public class TestSingleTon {
    public static void main(String[] args) {
        SingleTon singleTon1 = SingleTon.getSingleTon();
        SingleTon singleTon2 = SingleTon.getSingleTon();
        System.out.println(singleTon1);
        System.out.println(singleTon2);
    }
}
