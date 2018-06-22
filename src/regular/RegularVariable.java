package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularVariable {
    public static void main(String[] args) {
        Pattern p4 = Pattern.compile("[0-9]+");
        Matcher m4 = p4.matcher("1222");
        while(m4.find()){
            System.out.println(m4.start() + " - " + m4.group() + ", ");
        }
        System.out.println("");
    }
}
