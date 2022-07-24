package lesson4;

public class HomeWork3C {
    public static void main(String[] args) {
        HomeWork3C homeWork3C = new HomeWork3C();
        String result = HomeWork3C.fizzString("fih");
        System.out.println(result);


    }
    public static String fizzString(String GivenString){
        if ((GivenString.endsWith("b")) && GivenString.startsWith("f")){
            return "FizzBazz";
        }

      else if (GivenString.endsWith("b")){
        return "Bazz";
    }
    else GivenString.startsWith("f"); {
                return "Fizz";
            }
    }
    }

