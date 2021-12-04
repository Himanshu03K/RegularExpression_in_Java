// Use of function in Pattern

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REdemo3 {
    public static void main(String[] args) {
        String str = "b%#@abcdbbb9087 &";
        /*

                    +      atleast one
        Pattern p = Pattern.compile("[b]+");   // pattern provided here

                    *
        Pattern p = Pattern.compile("[b]*");

                     ?
        Pattern p = Pattern.compile("[b]?");

                    \s
        Pattern p = Pattern.compile("\\s");

                    \S
        Pattern p = Pattern.compile("\\S");

                    \d
        Pattern p = Pattern.compile("\\d");

                    \D
        Pattern p = Pattern.compile("\\D);

                    \w
        Pattern p = Pattern.compile("\\w");

                    \W
        Pattern p = Pattern.compile("\\W");

         */

        Pattern p = Pattern.compile("//W");
        Matcher m = p.matcher(str);   // target string provided here
        int c=0;
        while(m.find())
        {
            System.out.println(m.start() + " -------- "+m.end() +" ----- "+m.group());
            c++;
        }
        System.out.println("number of counts = "+c);
    }
}
