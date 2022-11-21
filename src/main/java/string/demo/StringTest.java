package string.demo;

import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.*;

public class StringTest {
    public static void main(String[] args) {
      String name = "   ",value="nithish", value2="Nithish";
        String val="5687686",sen="";
        String s = "educative";
        int offset = 3;
        int maxWidth = 5;
        String abbrMarker = "...";
        System.out.println(isBlank(name));
        System.out.println(abbreviate(s, abbrMarker, offset, maxWidth));
        System.out.println(capitalize(value));
        System.out.println(chop(value));
        System.out.println(equalsAnyIgnoreCase(value,value2));
        System.out.println(isNumeric(val));
        System.out.println(isWhitespace(sen));
        System.out.println(isMixedCase(value));
        System.out.println(join(value,value2));
        System.out.println(length(value));
        System.out.println(indexOf(sen,"World"));
    }
}

