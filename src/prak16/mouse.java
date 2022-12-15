package prak16;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class mouse extends JFrame
{
    public mouse(){
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if ((e.getX() > 150 ) && (e.getY() > 150) && (e.getX() < 300 ) && (e.getY() < 300))
                {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО.", "Нахождение", JOptionPane.INFORMATION_MESSAGE);
                }
                if ((e.getX() < 150 ))
                {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО", "Нахождение", JOptionPane.INFORMATION_MESSAGE);
                }
                if ((e.getX() > 300 ))
                {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО", "Нахождение", JOptionPane.INFORMATION_MESSAGE);
                }
                if ((e.getY() > 300 ))
                {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО", "Нахождение", JOptionPane.INFORMATION_MESSAGE);
                }
                if ((e.getY() < 150 ))
                {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в САО", "Нахождение", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                new mouse();

            }
        });
    }
}