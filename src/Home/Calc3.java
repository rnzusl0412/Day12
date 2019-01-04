package Home;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Calc3 extends Frame {
	@SuppressWarnings("unused")
	private int a;
	@SuppressWarnings("unused")
	private int b;
	TextField TextA, TextB;
	Choice C1;
	Button B1, B2;
	TextArea res;
	Calc calc;

	public Calc3() {
		calc = new Calc();
		TextA = new TextField("", 10);
		TextB = new TextField("", 10);
		C1 = new Choice();
		C1.add("+");
		C1.add("-");
		C1.add("*");
		C1.add("/");
		B1 = new Button("=");
		B2 = new Button("%");
		res = new TextArea(1, 10);

	}

	public void Run() {
		setFont(new Font("고딕", Font.BOLD, 30));
		setBackground(Color.gray);
		setLayout(new FlowLayout());
		setSize(800, 180);
		setVisible(true);
		add(TextA);
		add(C1);
		add(TextB);
		add(B1);
		add(B2);
		add(res);

		addWindowListener(new myevent());
		B1.addActionListener(new myevent());
		B2.addActionListener(new myevent());
		C1.addItemListener(new myevent());

	}

	class myevent extends WindowAdapter implements ItemListener, ActionListener {
		public void View_B1() {
			int a = Integer.parseInt(TextA.getText());
			int b = Integer.parseInt(TextB.getText());

			if (C1.getSelectedItem().equals("+")) {
				res.setText(String.valueOf(a + b));
			}
			if (C1.getSelectedItem().equals("-")) {
				res.setText(String.valueOf(a - b));

			}
			if (C1.getSelectedItem().equals("*")) {
				res.setText(String.valueOf(a * b));

			}
			if (C1.getSelectedItem().equals("/")) {
				res.setText(String.valueOf(a / b));

			}
		}

		public void View_new() {
			
			calc.setA(Integer.parseInt(TextA.getText()));
			calc.setB(Integer.parseInt(TextB.getText()));
			if (C1.getSelectedItem().equals("+")) {
				res.setText(String.valueOf(calc.getHap()));
			}
			if (C1.getSelectedItem().equals("-")) {
				res.setText(String.valueOf(calc.getSub()));

			}
			if (C1.getSelectedItem().equals("*")) {
				res.setText(String.valueOf(calc.getMul()));

			}
			if (C1.getSelectedItem().equals("/")) {
				res.setText(String.valueOf(calc.getDiv()));
			}
			
			Frame f = new Frame();
			TextField tf = new TextField();
			tf.setText(String.valueOf(calc));
			f.add(tf);
			f.setSize(300, 300);
			f.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getActionCommand().equals("=")) {
				View_B1(); // =을 클릭하면 연산하는 코드
			}
			if (arg0.getActionCommand().equals("%")) {
				View_new();
			}
		}

		@Override
		public void itemStateChanged(ItemEvent arg0) {

		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Calc3().Run();
	}
}
