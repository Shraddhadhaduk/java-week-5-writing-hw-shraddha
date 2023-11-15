package java_week_5_writting_hw;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("Whit");
        c1.add("PINK");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("RED");
        c2.add("GREEN");
        c2.add("BLACK");
        c2.add("PINK");
        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}
