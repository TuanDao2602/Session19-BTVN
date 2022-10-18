package bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ClassNameExample {
    private static final String CLASSNAME_REGEX = "^[C|A|P]\\d{4}[G|H|I|K|L|M]$";

    public ClassNameExample() {
    }
    public boolean validate(String regex){
        Pattern pattern =Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher =pattern.matcher(regex);
        return matcher.matches();
        }
    }

