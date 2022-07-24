package lesson3;

public class HomeWork2F {
    public static void main(String[] args) {
        HomeWork2F loops = new HomeWork2F();
        loops.maxInt(5, 7, 3);
    }

    public void maxInt(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }


        }

    }


















