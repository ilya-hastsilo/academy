package by.academy.homework.homework.HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhone implements Validator {
    Pattern pattern = Pattern.compile("\\+?375[- ]?\\d{2}[- ]?\\d{3}[- ]?\\d{2}[- ]?\\d{2}");

    @Override
    public Boolean validate(String stringBelarusPhone) {
        Matcher matcher = pattern.matcher(stringBelarusPhone);
        if (matcher.matches()==false){
            System.out.println("Неверные данные");
        }
        return matcher.matches();
    }
}