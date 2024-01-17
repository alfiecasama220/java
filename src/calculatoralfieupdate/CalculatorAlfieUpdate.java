package calculatoralfieupdate;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


    
    
   public class CalculatorAlfieUpdate extends JFrame implements ActionListener , KeyListener {
       
       public static void main(String[] args) {
         CalculatorAlfieUpdate calc = new CalculatorAlfieUpdate();
                Color background = new Color(38, 38, 38);
                calc.setSize(470, 510);
                calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                calc.setLocationRelativeTo(null);
                calc.setVisible(true);
                calc.setTitle("Calculator");
                calc.getContentPane().setBackground(background);
                calc.setResizable(false);
                
    }
        JButton button7, button8, button9 , button4, button5,
            button6, button1, button2, button3, buttonC,
            button0, buttonDot, buttonEq, buttonC2, buttonDivide,
            buttonMulti, buttonSub, buttonPlus , calcLogButton;
        
        JLabel Title, alfie, ans ,userTitle;
        JTextField test;
    
   
    double num, answer;
    int calculation;
    
    public void arithmetic_operation() {
        switch(calculation) {
            case 1:
                answer = num + Double.parseDouble(test.getText());
                test.setText(Double.toString(answer));
               break;
               
            case 2:
                answer = num - Double.parseDouble(test.getText());
                test.setText(Double.toString(answer));
               break;
               
            case 3:
                answer = num * Double.parseDouble(test.getText());
                test.setText(Double.toString(answer));
               break;
               
            case 4:
                answer = num / Double.parseDouble(test.getText());
                test.setText(Double.toString(answer));
               break;
        }
    }
    
     CalculatorAlfieUpdate() {
        
//          Color background = new Color(38, 38, 38);
//        this.setSize(470, 510);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLocationRelativeTo(null);
//        this.setVisible(true);
//        this.setTitle("Calculator");
//        this.getContentPane().setBackground(background);
//        this.setResizable(false);
//        this.addKeyListener(this);
          this.addKeyListener(this);
        
        Title = new JLabel();
        Title.setText("Standard Calculator");
        Title.setBounds(20, 15, 320, 30);
        Title.setFont(new Font("Calibri", Font.BOLD, 29));
        Title.setForeground(Color.white);
        
        ans = new JLabel();
        ans.setBounds(380, 15, 120, 30);
        ans.setFont(new Font("Calibri", Font.BOLD, 16));
        ans.setForeground(Color.white);
        ans.setBackground(Color.red);
                
        Color displayColor = new Color(232, 232, 232);
        test = new JTextField();
        test.setText("0");
        test.setBounds(20, 50, 325 + 90, 60);
        test.setBackground(displayColor);
        test.setBorder(BorderFactory.createLineBorder(Color.gray));
        test.setFont(new Font("Calibri", Font.BOLD, 35));
        test.setHorizontalAlignment(JTextField.RIGHT);
        test.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(!Character.isDigit(e.getKeyChar())) {
                    e.consume();
                } 
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyChar()) {
                    case '1': 
                            button1.setBackground(Color.white);
                            button1.setForeground(Color.black);                     
                        break;
                    case '2': 
                            button2.setBackground(Color.white);
                            button2.setForeground(Color.black);                     
                        break;
                    case '3': 
                            button3.setBackground(Color.white);
                            button3.setForeground(Color.black);                     
                        break;
                    case '4': 
                            button4.setBackground(Color.white);
                            button4.setForeground(Color.black);                     
                        break;
                    case '5': 
                            button5.setBackground(Color.white);
                            button5.setForeground(Color.black);                     
                        break;
                    case '6': 
                            button6.setBackground(Color.white);
                            button6.setForeground(Color.black);                     
                        break;
                    case '7': 
                            button7.setBackground(Color.white);
                            button7.setForeground(Color.black);                     
                        break;
                    case '8': 
                            button8.setBackground(Color.white);
                            button8.setForeground(Color.black);                     
                        break;
                    case '9': 
                            button9.setBackground(Color.white);
                            button9.setForeground(Color.black);                     
                        break;
                    case '0': 
                            button0.setBackground(Color.white);
                            button0.setForeground(Color.black);                     
                        break;                     
                }
                
                switch(e.getKeyCode()) {
                    case  8:
                            buttonC2.setBackground(Color.white);
                            buttonC2.setForeground(Color.black);
                        break;
                }
                
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                 switch(e.getKeyChar()) {
                    case '1': 
                            button1.setBackground(Color.black);
                            button1.setForeground(Color.white);                     
                        break;
                    case '2': 
                            button2.setBackground(Color.black);
                            button2.setForeground(Color.white);                     
                        break;
                    case '3': 
                            button3.setBackground(Color.black);
                            button3.setForeground(Color.white);                     
                        break;
                    case '4': 
                            button4.setBackground(Color.black);
                            button4.setForeground(Color.white);                     
                        break;
                    case '5': 
                            button5.setBackground(Color.black);
                            button5.setForeground(Color.white);                     
                        break;
                    case '6': 
                            button6.setBackground(Color.black);
                            button6.setForeground(Color.white);                     
                        break;
                    case '7': 
                            button7.setBackground(Color.black);
                            button7.setForeground(Color.white);                     
                        break;
                    case '8': 
                            button8.setBackground(Color.black);
                            button8.setForeground(Color.white);                     
                        break;
                    case '9': 
                            button9.setBackground(Color.black);
                            button9.setForeground(Color.white);                     
                        break;
                    case '0': 
                            button0.setBackground(Color.black);
                            button0.setForeground(Color.white);                     
                        break;
                }
                 
                 switch(e.getKeyCode()) {
                    case 8:
                            buttonC2.setBackground(Color.black);
                            buttonC2.setForeground(Color.white);
                        break;
                }
            }
        });
        
        
        userTitle = new JLabel();
        userTitle.setBounds(20, 105 , 220, 50);
        userTitle.setFont(new Font("Calibri", Font.PLAIN, 15));
        userTitle.setForeground(Color.white);
        
        calcLogButton = new JButton();
        calcLogButton.setText("Quit");
        calcLogButton.setBounds(355, 115 , 80, 30);
        calcLogButton.setFont(new Font("Calibri", Font.PLAIN, 15));
        calcLogButton.setForeground(Color.red);
        calcLogButton.setBackground(Color.BLACK);
        calcLogButton.setFocusable(false);
        calcLogButton.addActionListener(this);
           
        button7 = new JButton("7");
        button7.setBounds(20, 150 , 70, 70);
        button7.addActionListener(this);
        button7.setBackground(Color.black);
        button7.setForeground(Color.white);
        button7.setFont(new Font("Calibri", Font.PLAIN, 18));
        button7.setFocusable(false);       
        
        button8 = new JButton("8");
        button8.setBounds(100, 150 , 70, 70);
        button8.addActionListener(this);
        button8.setBackground(Color.black);
        button8.setForeground(Color.white);
        button8.setFont(new Font("Calibri", Font.PLAIN, 18));
        button8.setFocusable(false);
        
        button9 = new JButton("9");
        button9.setBounds(180, 150 , 70, 70);
        button9.addActionListener(this);
        button9.setBackground(Color.black);
        button9.setForeground(Color.white);
        button9.setFont(new Font("Calibri", Font.PLAIN, 18));
        button9.setFocusable(false);
        
        button4 = new JButton("4");
        button4.setBounds(20, 150 + 80 , 70, 70);
        button4.addActionListener(this);
        button4.setBackground(Color.black);
        button4.setForeground(Color.white);
        button4.setFont(new Font("Calibri", Font.PLAIN, 18));
        button4.setFocusable(false);
        
        button5 = new JButton("5");
        button5.setBounds(100, 150 + 80 , 70, 70);
        button5.addActionListener(this);
        button5.setBackground(Color.black);
        button5.setForeground(Color.white);
        button5.setFont(new Font("Calibri", Font.PLAIN, 18));
        button5.setFocusable(false);
        
        button6 = new JButton("6");
        button6.setBounds(180, 150 + 80, 70, 70);
        button6.addActionListener(this);
        button6.setBackground(Color.black);
        button6.setForeground(Color.white);
        button6.setFont(new Font("Calibri", Font.PLAIN, 18));
        button6.setFocusable(false);
        
        button1 = new JButton("1");
        button1.setBounds(20, 150 + 160 , 70, 70);
        button1.addActionListener(this);
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setFont(new Font("Calibri", Font.PLAIN, 18));
        button1.setFocusable(false);
        
        button2 = new JButton("2");
        button2.setBounds(100, 150 + 160 , 70, 70);
        button2.addActionListener(this);
        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
        button2.setFont(new Font("Calibri", Font.PLAIN, 18));
        button2.setFocusable(false);
        
        button3 = new JButton("3");
        button3.setBounds(180, 150 + 160, 70, 70);
        button3.addActionListener(this);
        button3.setBackground(Color.black);
        button3.setForeground(Color.white);
        button3.setFont(new Font("Calibri", Font.PLAIN, 18));
        button3.setFocusable(false);
        
        button0 = new JButton("0");
        button0.setBounds(20, 150 + 240 , 70, 70);
        button0.addActionListener(this);
        button0.setBackground(Color.black);
        button0.setForeground(Color.white);
        button0.setFont(new Font("Calibri", Font.PLAIN, 18));
        button0.setFocusable(false);
        
        buttonDot = new JButton(".");
        buttonDot.setBounds(100, 150 + 240 , 70, 70);
        buttonDot.addActionListener(this);
        buttonDot.setBackground(Color.black);
        buttonDot.setForeground(Color.white);
        buttonDot.setFont(new Font("Calibri", Font.PLAIN, 18));
        buttonDot.setFocusable(false);
        
        buttonEq = new JButton("=");
        buttonEq.setBounds(180, 150 + 240, 70, 70);
        buttonEq.addActionListener(this);
        buttonEq.setBackground(Color.black);
        buttonEq.setForeground(Color.white);
        buttonEq.setFont(new Font("Calibri", Font.PLAIN, 18));
        buttonEq.setFocusable(false);
        
        buttonC = new JButton("C");
        buttonC.setBounds(260, 150 , 85, 70);
        buttonC.addActionListener(this);
        buttonC.setBackground(Color.black);
        buttonC.setForeground(Color.white);
        buttonC.setFont(new Font("Calibri", Font.PLAIN, 18));
        buttonC.setFocusable(false);
        
        buttonC2 = new JButton("<");
        buttonC2.setBounds(260 + 90, 150 , 85, 70);
        buttonC2.addActionListener(this);
        buttonC2.setBackground(Color.black);
        buttonC2.setForeground(Color.white);
        buttonC2.setFont(new Font("Calibri", Font.PLAIN, 18));
        buttonC2.setFocusable(false);
        
        buttonDivide = new JButton("/");
        buttonDivide.setBounds(260, 150 + 100, 85, 70);
        buttonDivide.addActionListener(this);
        buttonDivide.setBackground(Color.black);
        buttonDivide.setForeground(Color.white);
        buttonDivide.setFont(new Font("Calibri", Font.PLAIN, 18));
        buttonDivide.setFocusable(false);
        
        buttonMulti = new JButton("x");
        buttonMulti.setBounds(350, 150 + 100, 85, 70);
        buttonMulti.addActionListener(this);
        buttonMulti.setBackground(Color.black);
        buttonMulti.setForeground(Color.white);
        buttonMulti.setFont(new Font("Calibri", Font.PLAIN, 18));
        buttonMulti.setFocusable(false);
        
        buttonSub = new JButton("-");
        buttonSub.setBounds(260, 150 + 175, 85, 70);
        buttonSub.addActionListener(this);
        buttonSub.setBackground(Color.black);
        buttonSub.setForeground(Color.white);
        buttonSub.setFont(new Font("Calibri", Font.PLAIN, 18));
        buttonSub.setFocusable(false);
        
        buttonPlus = new JButton("+");
        buttonPlus.setBounds(350, 150 + 175, 85, 70);
        buttonPlus.addActionListener(this);
        buttonPlus.setBackground(Color.black);
        buttonPlus.setForeground(Color.white);
        buttonPlus.setFont(new Font("Calibri", Font.PLAIN, 18));
        buttonPlus.setFocusable(false);
        
        alfie = new JLabel("");
        alfie.setBounds(80, 150 + 250, 665, 8170);
        alfie.setBackground(Color.black);
        alfie.setForeground(Color.white);
        alfie.setFont(new Font("Calibri", Font.PLAIN, 14));
              

        
        this.add(test);
        this.add(Title);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(buttonC);
        this.add(button0);
        this.add(buttonDot);
        this.add(buttonEq);
        this.add(buttonC2);
        this.add(ans);
        this.add(userTitle);
        this.add(calcLogButton);
          
        this.add(buttonDivide);
        this.add(buttonMulti);
        this.add(buttonSub);
        this.add(buttonPlus);
        this.add(alfie);

        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource() == button7) {
            test.setText(test.getText() + "7");
        }
        
        if(e.getSource() == button8) {
            test.setText(test.getText() + "8");
        }
        
        if(e.getSource() == button9) {
            test.setText(test.getText() + "9");
        }
        
        if(e.getSource() == button4) {
            test.setText(test.getText() + "4");
        }
        
        if(e.getSource() == button5) {
            test.setText(test.getText() + "5");
        }
        
        if(e.getSource() == button6) {
            test.setText(test.getText() + "6");
        }
        
        if(e.getSource() == button1) {
            test.setText(test.getText() + "1");
        }
        
        if(e.getSource() == button2) {
            test.setText(test.getText() + "2");
        }
        
        if(e.getSource() == button3) {
            test.setText(test.getText() + "3");
        }
        
        if(e.getSource() == buttonC) {
            test.setText("");
            ans.setText("");
        }
        
        if(e.getSource() == buttonC2) {
            int length = test.getText().length();
            int numbers = test.getText().length() - 1;
            String store;
            
            if(length > 0) {
                StringBuilder back = new StringBuilder(test.getText());
                back.deleteCharAt(numbers);
                store=back.toString();
                test.setText(store);
            }
        }
        
        if(e.getSource() == button0) {
            test.setText(test.getText() + "0");
        }
        
        if(e.getSource() == buttonDot) {
            test.setText(test.getText() + ".");
        }
        
        if(e.getSource() == buttonEq) {
            arithmetic_operation();
            ans.setText("");
        }
        
        if(e.getSource() == buttonDivide) {
            num = Double.parseDouble(test.getText());
            calculation = 4;
            test.setText("");
            ans.setText(num + " / ");
        }
        
        if(e.getSource() == buttonSub) {
            num = Double.parseDouble(test.getText());
            calculation = 2;
            test.setText("");
            ans.setText(num + " - ");
        }
        
        if(e.getSource() == buttonMulti) {
            num = Double.parseDouble(test.getText());
            calculation = 3;
            test.setText("");
            ans.setText(num + " * ");
        }
        
        if(e.getSource() == buttonPlus) {
            num = Double.parseDouble(test.getText());
            calculation = 1;
            test.setText("");
            ans.setText(num + " + ");
        }
        if(e.getSource() == calcLogButton) {
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure to quit? \n Created by: Alfie Cute", "Confirm", 0, 0 );
            
            if(confirmation == JOptionPane.YES_OPTION) {
                dispose();
            } else {
                return;
            }
        }
    
  }

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
        
 }
    
    
    
