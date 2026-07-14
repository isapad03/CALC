//This work is licensed under a Creative Commons Attribution NonCommercial NoDerivatives 4.0 International License
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicCalculator implements ActionListener {

    //attributes
    protected double o1,o2,result;
    protected char op;

    protected JTextField box;
    protected JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd;
    protected JButton add, sub, mul, div,mod,com,clr;
    protected JFrame cw;
    protected JPanel kp;

//constructors
    public BasicCalculator() {
            clean();
    }

//methods
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            box.setText(box.getText() + "1");
        }
        if(e.getSource() == b2) {
            box.setText(box.getText() + "2");
        }
        if(e.getSource() == b3) {
            box.setText(box.getText() + "3");
        }
        if(e.getSource() == b4) {
            box.setText(box.getText() + "4");
        }
        if(e.getSource() == b5) {
            box.setText(box.getText() + "5");
        }
        if(e.getSource() == b6) {
            box.setText(box.getText() + "6");
        }
        if(e.getSource() == b7) {
            box.setText(box.getText() + "7");
        }
        if(e.getSource() == b8) {
            box.setText(box.getText() + "8");
        }
        if(e.getSource() == b9) {
            box.setText(box.getText() + "9");
        }
        if(e.getSource() == b0) {
            box.setText(box.getText() + "0");
        }
        if(e.getSource() == bd) {
            box.setText(box.getText() + ".");
        }
        if(e.getSource() == add) {
            String text = box.getText();
            if(!text.isEmpty()) {
                o1 = Double.parseDouble(box.getText());
                op = '+';
                box.setText("");
            }

        }
        if(e.getSource() == sub) {
            String text = box.getText();
            if(box.getText().trim().equals("")) {

                box.setText("-");
            }else{
                if (!text.isEmpty()) {
                    o1 = Double.parseDouble(box.getText());
                    op = '-';
                    box.setText("");
                }
            }
        }
        if(e.getSource() == mul) {
            String text = box.getText();
            if(!text.isEmpty()) {
                o1 = Double.parseDouble(box.getText());
                op = '*';
                box.setText("");
            }
        }
        if(e.getSource() == div) {
            String text = box.getText();
            if(!text.isEmpty()) {
                o1 = Double.parseDouble(box.getText());
                op = '/';
                box.setText("");
            }
        }
        if(e.getSource() == mod) {
            String text = box.getText();
            if(!text.isEmpty()) {
                o1 = Double.parseDouble(box.getText());
                op = '%';
                box.setText("");
            }
        }
        if(e.getSource() == com) {
            String text = box.getText();
            if(!text.isEmpty()) {
                o2 = Double.parseDouble(box.getText());
                box.setText("");
                calculate();
            }
        }
        if(e.getSource() == clr) {
            box.setText("");
            clean();
        }

    }

    public void calculate() {

        if(op == '+'){
            result = o1 + o2;
        }else if(op == '-'){
            result = o1 - o2;
        }else if(op == '*'){
            result = o1 * o2;
        }else if(op == '/'){
            result = o1 / o2;
        }else if(op == '%'){
            result = o1 % o2;
        }
        box.setText(String.valueOf(result));
    }





    public void clean() {
        o1 = 0;
        o2 = 0;
        op = ' ';
    }

    public void CreateUserInterface(){
        cw = new JFrame("Isaac Paden's Calculator");
        kp = new JPanel();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bd = new JButton(".");

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");
        com = new JButton("=");
        clr = new JButton("C");

        box = new JTextField(20);

        kp.add(box);
        kp.add(clr);
        kp.add(b1);
        kp.add(b2);
        kp.add(b3);
        kp.add(b4);
        kp.add(b5);
        kp.add(b6);
        kp.add(b7);
        kp.add(b8);
        kp.add(b9);
        kp.add(b0);
        kp.add(bd);
        kp.add(com);
        kp.add(add);
        kp.add(sub);
        kp.add(mul);
        kp.add(div);
        kp.add(mod);
        cw.getContentPane().add(kp);
        cw.setSize(300,300);
        cw.show();

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bd.addActionListener(this);
        add.addActionListener(this);
        mul.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clr.addActionListener(this);
        com.addActionListener(this);

    }


}
