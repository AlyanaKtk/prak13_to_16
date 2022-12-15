package prak14;
import java.util.*;
public class splittext {
    public static void main(String[] args) {
        String text;
        System.out.println("Введите текст, который нужно разделить на составные части: ");
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        String[] results = text.split("\\W+");
        System.out.println(Arrays.toString(results));
    }
}
