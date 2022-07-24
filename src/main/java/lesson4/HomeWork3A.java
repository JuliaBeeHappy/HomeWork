package lesson4;

public class HomeWork3A {

    public static void main(String[] args) {
        HomeWork3A homeWork3A = new HomeWork3A();
        homeWork3A.compareStrings("Category", "Cat");
    }
    public void compareStrings(String a, String b) {
        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        }
        if (a.equals(b)) {
            System.out.println("The Strings are the same");
        } else if (a.contains(b)) {
            System.out.println("Cat is the part of Category");

        }
    }
}