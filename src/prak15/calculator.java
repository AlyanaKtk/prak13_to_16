package prak15;

public class calculator
{
    public double calc ( double n1, String op, double n2)
    {
        return switch (op) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> 0;
        };
    }
}
