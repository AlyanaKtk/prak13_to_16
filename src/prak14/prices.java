package prak14;
import java.util.*;
import java.util.regex.*;
public class prices
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("[0-9]+[.,][0-9][0-9]\\s(EU|USD|RUB)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
