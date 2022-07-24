package lesson3;

public class HomeWork2I {
    public static void main(String[] args) {
        HomeWork2I homeWork2I = new HomeWork2I();
        boolean result = homeWork2I.equalSlices(8, 3, 3);
        System.out.println(result);

    }

    public static boolean equalSlices(int slices, int recipients, int each){
        if (each*recipients <=  slices){
            return true;
        }
        else {
            return false;
        }
    }


}
