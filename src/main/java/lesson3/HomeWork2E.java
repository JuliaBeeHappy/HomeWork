package lesson3;

public class HomeWork2E {
    public static void main(String[] args) {
        HomeWork2E loops = new HomeWork2E();
        loops.lastDigit(17, 27);
    }


    public void lastDigit(int a, int b) {
        int i = a % 10;
        int j = b % 10;
        if (i == j) {
            System.out.println("true");}
        else {
            System.out.println("false");
        }

        }


    }
