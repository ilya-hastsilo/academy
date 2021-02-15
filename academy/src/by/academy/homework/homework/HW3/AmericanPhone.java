package by.academy.homework.homework.HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhone implements Validator {
    Pattern pattern = Pattern.compile("\\+1\\d{3}[-.]?\\d{3}[-.]?\\d{4}");

    @Override
    public Boolean validate(String stringAmericanPhone) {
        Matcher matcher = pattern.matcher(stringAmericanPhone);
        if (matcher.matches()==false){
            System.out.println("Неверные данные");
        }
        return matcher.matches();
    }
}