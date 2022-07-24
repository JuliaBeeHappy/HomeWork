
package lesson3;

public class HomeWork2B {
    public static void main(String[] args) {
        HomeWork2B loops = new HomeWork2B();
        loops.pyramid(1, 3);

    }


    public void pyramid(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += sum + i;
            System.out.println(sum);
        }

    }
}
