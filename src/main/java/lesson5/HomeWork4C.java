package lesson5;


import java.util.ArrayList;
import java.util.Collections;

public class HomeWork4C {

    public void arrayListName(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Tom");
        arrayList.add("Steve");
        arrayList.add("Tim");
        arrayList.add("Tom");
        arrayList.add("Anna");
        arrayList.add("Angela");
        arrayList.add("Anna");
        Collections.sort(arrayList);
        {
            System.out.println(arrayList);

        }

    }
}
