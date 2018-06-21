package equal_string;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("a");
        list.add("bbbbbb");
        list.add("qqqqq");
        list.add("ccccccccc");
        list.add("c");

        Collator collator = Collator.getInstance();
        Collections.sort(list,collator);

        for (String s : list){
            System.out.println(s);
        }

    }
}
