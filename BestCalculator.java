//This work is licensed under a Creative Commons Attribution NonCommercial NoDerivatives 4.0 International License

import java.awt.event.ActionEvent;

public class BestCalculator extends BetterCalculator {


    @Override
    public void CreateUserInterface() {
        super.CreateUserInterface();
        box.setText("0");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() != com){
            if (box.getText().equals("0")) {
                box.setText("");
            }
          if(hist.size() == 0){
              if(e.getSource() == add || e.getSource() == sub || e.getSource() == mul || e.getSource() == div || e.getSource() == pct || e.getSource() == log || e.getSource() == sqr){
                  box.setText("0");
                  System.out.println("hi");
              }
          }else{
              if(e.getSource() == pct || e.getSource() == log || e.getSource() == sqr){
                  box.setText("0");
              }
          }

        }
        super.actionPerformed(e);

        if(e.getSource() == clr){
            box.setText("0");
        }
        if(place==0){
            box.setText("0");
        }

    }
/**
    @Override
    public void calculate() {

        if(o1 == 0 || o2 == 0){
            if(op == '+' || op == '-'){
                box.setText(String.valueOf(o2));
            }
            if(op == '*'){
                box.setText("0");
            }
            if(op == '/'){
                box.setText("err");
            }
        }else{
            super.calculate();
        }

    }
    **/
}
