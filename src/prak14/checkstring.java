package prak14;
import java.util.regex.*;
public class checkstring
{
    public static void main(String[] args) {
        String pattern = "abcdefghijklmnopqrstuv18340";
        String test[] = {"abcdefghijklmnopqrstuv18340", "abcdefghijklmnoasdfasdpqrstuv18340", "abcd1900"};
        for (int i = 0; i < 3; i++) {
            System.out.println(Pattern.matches(pattern, test[i]));
        }
    }
}
