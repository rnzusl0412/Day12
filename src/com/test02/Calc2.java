package com.test02;

import java.awt.*;
import java.awt.event.*;
// UI
@SuppressWarnings("serial")
public class Calc2 extends Frame {
    
    TextField txtA, txtB, res;
    Choice cho;
    Button bt, new_frame;
    Calc c1;
    
    public Calc2(){
        c1 = new Calc();
        new_frame = new Button("new_frame");
        txtA = new TextField("",10);        
        txtB = new TextField("",10);
        cho = new Choice();
        cho.add("+");
        cho.add("-");
        cho.add("*");
        cho.add("/");
        bt = new Button("=");
        res = new TextField("",10);
    
    }
    public void go() {
        setLayout(new FlowLayout());
        add(txtA);
        add(cho);
        add(txtB);
        add(bt);
        add(new_frame);
        add(res);
        addWindowListener(new MyEvent());
        bt.addActionListener(new MyEvent());
        new_frame.addActionListener(new MyEvent());
        cho.addItemListener(new MyEvent());
        
        setFont(new Font("궁서",Font.BOLD,30));
        setSize(1000, 200);
        setVisible(true);
    }

    
    class MyEvent extends WindowAdapter implements ItemListener,ActionListener{

        public void View_bt() {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            
            if(cho.getSelectedItem().equals("+")) {
//                String hap = String.valueOf(a+b);
//                res.setText(hap);
                res.setText(String.valueOf(a+b));
            }
            if(cho.getSelectedItem().equals("-")) {
                res.setText(String.valueOf(a-b));

            }
            if(cho.getSelectedItem().equals("*")) {
                res.setText(String.valueOf(a*b));

            }
            if(cho.getSelectedItem().equals("/")) {
                res.setText(String.valueOf(a/b));

            }
        }
        
        public void View_new() {
            
            c1.setA(Integer.parseInt(txtA.getText()));
            c1.setB(Integer.parseInt(txtB.getText()));
            res.setText(String.valueOf(c1.getHap()));
            
            Frame f = new Frame();
            TextField tf = new TextField();
            tf.setText(String.valueOf(c1.getHap()));
            f.add(tf);
            f.setSize(300,300);
            f.setVisible(true);
        }
        
        @Override
        public void windowClosing(WindowEvent arg0) {
            System.exit(0);
        }

        @Override
        public void itemStateChanged(ItemEvent arg0) {
//            System.out.println(arg0.getItem());
            
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            
            if(arg0.getActionCommand().equals("=")) {
                View_bt();    // =을 클릭하면 연산하는 코드
            }
            if(arg0.getActionCommand().equals("new_frame")) {
                View_new();    // new_fream을 클릭하게 되면 연산 후 새 창을 띄우는 코드
            }
            
        }
    }
    public static void main(String[] args) {
        new Calc2().go();
        
    }
}
