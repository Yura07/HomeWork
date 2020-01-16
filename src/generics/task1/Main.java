package generics.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        String string = new String("12");
        integerList.add(Integer.parseInt(string));
        System.out.println(integerList);

    }
}


