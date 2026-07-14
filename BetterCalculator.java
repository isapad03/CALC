//This work is licensed under a Creative Commons Attribution NonCommercial NoDerivatives 4.0 International License

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class BetterCalculator extends Calculator {
    protected ArrayList<Status> hist = new ArrayList<>();
    protected JButton undo;
    protected int place;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() != undo) {
            // cut off redo history
            while (hist.size() > place) {
                hist.remove(hist.size() - 1);
            }

            hist.add(new Status(o1, o2, op, box.getText(), box.getBackground()));
            place = hist.size();
        }

        super.actionPerformed(e);




        if (e.getSource() == undo) {
            if (place > 0) {
                place--;

                Status prev = hist.get(place);

                o1 = prev.getO1();
                o2 = prev.getO2();
                op = prev.getOp();
                box.setText(prev.getText());
                box.setBackground(prev.getColor());
            }
        }
        //System.out.println(hist);
        for(Status test: hist){
            System.out.println(test.getO1() + " | " + test.getO2() + " | " + test.getOp() + " | " + test.getText() + " | " + test.getColor());
        }
        System.out.println(place + " | " + hist.size());

    }

    @Override
    public void CreateUserInterface() {
        super.CreateUserInterface();
        undo = new JButton("Undo");
        undo.setBackground(new Color(10, 160, 200));
        undo.setForeground(Color.WHITE);
        undo.addActionListener(this);
        kp.add(undo, BorderLayout.CENTER);

    }


}