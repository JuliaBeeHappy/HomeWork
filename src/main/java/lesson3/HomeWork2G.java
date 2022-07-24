package lesson3;

public class HomeWork2G {
    public static void main(String[] args) {

        HomeWork2G loops = new HomeWork2G();
        loops.loveSeven(7, 4);
    }


    public void loveSeven(int a, int b){
        if ( a==7 || b ==7)
        {
            System.out.println("true");

        }
        else if(a+b == 6 || a-b == 6){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }


    }








}







