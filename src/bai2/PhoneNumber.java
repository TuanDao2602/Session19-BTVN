package bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String  PHONENUMBER_REGEX ="^\\d{2}[-][0]\\d{8}$";

    public PhoneNumber() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return  matcher.matches();

    }
}
