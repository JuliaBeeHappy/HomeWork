package lesson3;

public class HomeWorl2A {
    public static void main(String[] args) {
        HomeWorl2A loops = new HomeWorl2A();
        loops.printLoop();

    }


    public void printLoop() {
        for (int i = 1; i <= 100; i++) {

             if (i % 2 ==1){
               System.out.println("The number " + i + " is odd");
            }
             else if (i % 3 == 0 && i % 2 == 0){
                System.out.println("The number " + i + " divisible by two and three");
            }
             if (i % 3 == 0){
                System.out.println("The number " + i + " divisible by three");
            }
            else  if (i % 2 == 0){
                 System.out.println("The number " + i + " is even");
             }


        }
    }
}
