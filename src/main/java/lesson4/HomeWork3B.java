package lesson4;

public class HomeWork3B {
    public static void main(String[] args) {
        HomeWork3B homework3B = new HomeWork3B();
        boolean success = homework3B.reverseString("racecar");
        System.out.println(success);
    }

    public boolean reverseString(String textToReverse) {
        String NewString = "";
        int lastletter = textToReverse.length() - 1;
        for (int i = lastletter; i >= 0; i--) {
            NewString = NewString + textToReverse.charAt(i);
        }
        if (textToReverse.equals(NewString)) {
            return true;
        } else {
            return false;
        }

    }
}

//
//    public boolean isPalindrome(String name);
//    boolean palindrom = true;



