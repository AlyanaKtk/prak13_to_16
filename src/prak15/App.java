package prak15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JPanel {
    JTextField txt1 = null;
    double res0 = 0;
    double res1 = 0;
    String op = "";

    public App()
    {
            setLayout(null);
            final TextField txt1 = new TextField();
            txt1.setBounds(10, 10, 300, 30);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 270, 50, 50);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 190, 50, 50);

            JButton b2 = new JButton("2");
            b2.setBounds(60, 190, 50, 50);

            JButton b3 = new JButton("3");
            b3.setBounds(110, 190, 50, 50);

            JButton b4 = new JButton("4");
            b4.setBounds(10, 110, 50, 50);

            JButton b5 = new JButton("5");
            b5.setBounds(60, 110, 50, 50);

            JButton b6 = new JButton("6");
            b6.setBounds(110, 110, 50, 50);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);

            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);

            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);

            JButton equals = new JButton("=");
            equals.setBounds(110, 270, 50, 50);

            JButton dot = new JButton(".");
            dot.setBounds(60, 270, 50, 50);

            JButton plus = new JButton("+");
            plus.setBounds(160, 40, 50, 50);

            JButton minus = new JButton("-");
            minus.setBounds(160, 110, 50, 50);

            JButton mlt = new JButton("*");
            mlt.setBounds(160, 190, 50, 50);

            JButton divide = new JButton("/");
            divide.setBounds(160, 270, 50, 50);
            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(equals);
            add(dot);
            add(plus);
            add(minus);
            add(mlt);
            add(divide);
            b1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 1);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 == 0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            b2.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 2);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 == 0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            b3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 3);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 ==0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            b4.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 4);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 ==0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            b5.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 5);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 == 0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            b6.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 6);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 == 0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            b7.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 7);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 == 0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            b8.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 8);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 ==0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            b9.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 9);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 ==0)
                        res0 = temp;
                    else
                        res1 = temp;
                }
            });

            dot.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    if ((!(txt1.getText().contains(".")))&&(!(txt1.getText().isEmpty()))) txt1.setText(txt1.getText() + ".");
                }
            });

            b0.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 0);
                    double temp = Double.parseDouble(txt1.getText().trim());
                    if (res0 ==0) res0 = temp;
                    else res1 = temp;
                }
            });

            plus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res0 = Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });

            minus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res0 = Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });

            mlt.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res0 = Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });

            divide.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res0 = Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });

            equals.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    System.out.println(res0 + " " + op + " " + res1);
                    double num = res0;
                    double num1 = res1;
                    String strOp = op;
                    calculator mc = new calculator();
                    String strRes = String.valueOf(mc.calc(num, strOp, num1));
                    txt1.setText(strRes);
                }
            });


    }
}