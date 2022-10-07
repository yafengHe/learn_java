public class VarPaarameter {
    String age = "18";
    public static void main(String[] args) {
        VarPaarameter varPaarameter = new VarPaarameter();
        System.out.println(varPaarameter.score("Henry", 90, 70));
        System.out.println(varPaarameter.score("Henry", 90, 70, 1));
        System.out.println(varPaarameter.score("Henry", 90, 70, 10, 10, 10));

        varPaarameter.scope();
    }

    public String score(String name, int... num) {
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        return name + total;
    }

    public void scope() {
        String age = "333";
        System.out.println(age);
    }
}
