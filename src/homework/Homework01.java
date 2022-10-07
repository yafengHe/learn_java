package homework;

public class Homework01 {
    public static void main(String[] args) {
        A01 a = new A01();

//        A01
        double[] d = { 1.1, 2.2, 3.3};
        System.out.println(a.max(d));

        String[] strArray = {"l", "h", "j"};
        System.out.println(a.find(strArray, "l"));

        Book book = new Book(200);
        System.out.println(book.updatePrice(101));

        int[] arr = {1, 2};
        int[] newArrCopy = a.copyArr(arr);
        System.out.println(newArrCopy[0]);
        arr[1] = 4;
        System.out.println(newArrCopy[1]);

        Circle circle = new Circle(4);
        System.out.println(circle.circleRound());
        System.out.println(circle.area(3.0));

        Cale cale = new Cale();
        System.out.println(cale.add(4,3));
        System.out.println(cale.minus(4,3));
        System.out.println(cale.mutilpy(4,3));
        System.out.println(cale.devide(4,0));

        Dog dog = new Dog("八公", "黄色", 8);
        dog.show();

        Music music = new Music("东风破", 3.14);
        music.play();
        System.out.println(music.getInfo());

        System.out.println(a.compareMax(a.compareMax(10.0, 20.0), 100));

        Employee employee = new Employee("张三", true, 18, "web前端", 12000.5);
        Employee employee1 = new Employee("张三1", true, 181 );
        Employee employee2 = new Employee( "web前端1", 12001.5);

        PassObject passObject = new PassObject();
        passObject.printAreas(circle, 6);
    }
}

