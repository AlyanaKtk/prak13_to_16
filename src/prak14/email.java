package prak14;
import java.util.*;
import java.util.regex.*;
public class email
{
    public static void main(String[] args)
    {
        System.out.println("Введите email");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(Pattern.matches("\\w+([\\.-]?\\w+)*@\\w+\\.\\w{2,4}", text));
    }
}
