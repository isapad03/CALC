//This work is licensed under a Creative Commons Attribution NonCommercial NoDerivatives 4.0 International License
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends BasicCalculator {
protected JButton sqr,log,pct,exp;
    @Override
    public void CreateUserInterface() {
        super.CreateUserInterface();
        sqr = new JButton("sqr");
        log = new JButton("log");
        pct = new JButton("pct");
        exp = new JButton("^");
        sqr.addActionListener(this);
        log.addActionListener(this);
        pct.addActionListener(this);
        exp.addActionListener(this);
        box.setBackground(Color.YELLOW);
        box.setHorizontalAlignment(JTextField.RIGHT);
        b1.setBackground(new Color(18,42,97));
        b2.setBackground(new Color(18,42,97));
        b3.setBackground(new Color(18,42,97));
        b4.setBackground(new Color(18,42,97));
        b5.setBackground(new Color(18,42,97));
        b6.setBackground(new Color(18,42,97));
        b7.setBackground(new Color(18,42,97));
        b8.setBackground(new Color(18,42,97));
        b9.setBackground(new Color(18,42,97));
        b0.setBackground(new Color(18,42,97));
        bd.setBackground(new Color(18,42,97));

        add.setBackground(new Color(196,116,20));
        sub.setBackground(new Color(196,116,20));
        mul.setBackground(new Color(196,116,20));
        div.setBackground(new Color(196,116,20));
        mod.setBackground(new Color(196,116,20));
        exp.setBackground(new Color(196,116,20));

        sqr.setBackground(new Color(196,116,160));
        log.setBackground(new Color(196,116,160));
        pct.setBackground(new Color(196,116,160));


        clr.setBackground(new Color(180,0,0));
        com.setBackground(new Color(5,89,12));

        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);
        b6.setForeground(Color.WHITE);
        b7.setForeground(Color.WHITE);
        b8.setForeground(Color.WHITE);
        b9.setForeground(Color.WHITE);
        b0.setForeground(Color.WHITE);
        bd.setForeground(Color.WHITE);
        add.setForeground(Color.WHITE);
        sub.setForeground(Color.WHITE);
        mul.setForeground(Color.WHITE);
        div.setForeground(Color.WHITE);
        mod.setForeground(Color.WHITE);
        com.setForeground(Color.WHITE);
        clr.setForeground(Color.WHITE);
        sqr.setForeground(Color.WHITE);
        pct.setForeground(Color.WHITE);
        log.setForeground(Color.WHITE);
        exp.setForeground(Color.WHITE);
        kp.add(exp);
        kp.add(sqr,BorderLayout.CENTER);
        kp.add(log,BorderLayout.CENTER);
        kp.add(pct,BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        box.setBackground(Color.YELLOW);
        super.actionPerformed(e);
        if(e.getSource()==sqr){
            String text = box.getText();
            if(!text.isEmpty()) {
                o1 = Double.valueOf(box.getText());
                op = 's';
                calculate();
            }
        }
        if(e.getSource()==log){
            String text = box.getText();
            if(!text.isEmpty()) {
                o1 = Double.valueOf(box.getText());
                op = 'l';
                calculate();
            }
        }
        if(e.getSource()==pct){
            String text = box.getText();
            if(!text.isEmpty()) {
                o1 = Double.valueOf(box.getText());
                op = 'p';
                calculate();
            }
        }
        if(e.getSource()==exp){
            String text = box.getText();
            if(!text.isEmpty()) {
                o1 = Double.valueOf(box.getText());
                op = 'e';
                box.setText("");
            }
        }


    }

    @Override
    public void calculate() {
        super.calculate();
        box.setBackground(Color.GREEN);
        if(op == 's'){
            if(o1>0){
                box.setText(String.valueOf(Math.sqrt(o1)));
            }
        }else if(op == 'l'){

            box.setText(String.valueOf(Math.log(o1)));
        }else if(op == 'p'){
            box.setText(String.valueOf(o1*100));
        }else if(op == 'e'){
            box.setText(String.valueOf(Math.pow(o1,o2)));
        }

    }
}
