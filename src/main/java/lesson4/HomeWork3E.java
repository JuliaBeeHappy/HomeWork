package lesson4;

public class HomeWork3E {
    public static void main(String[] args) {
        HomeWork3E homeWork3E = new HomeWork3E();
        Boolean result = homeWork3E.isPlural("change");
        System.out.println(result);

    }

    public boolean isPlural(String example) {
        if (example.endsWith("s")) {
            return true;
        }
        else return false;

    }
}
