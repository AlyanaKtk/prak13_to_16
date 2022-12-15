package prak15;
import javax.swing.*;
public class calcpanel extends JFrame
{
    public calcpanel()
    {
        setBounds(100, 100, 300, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new App());
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new calcpanel();
    }
}