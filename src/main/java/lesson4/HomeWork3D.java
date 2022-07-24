package lesson4;

public class HomeWork3D {
    public static void main(String[] args) {
        HomeWork3D homeWork3D = new HomeWork3D();
        String result = homeWork3D.addChars("red");
        System.out.println(result);

    }



    public String addChars(String str) {
        char i = str.charAt(str.length()-1);
        return i + str + i;
    }

}
