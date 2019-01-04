package com.test01;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

// ��ư �̺�Ʈ user class �� ������
class MyEvent extends WindowAdapter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

}

@SuppressWarnings("serial")
public class MTest03 extends Frame {
	Button bt;

	public MTest03() {
		super("abc");
		bt = new Button("click");

	}

	public void go() {
		add(bt);
		bt.addActionListener(new MyEvent());
		addWindowListener(new MyEvent()); // addWindowListener(WinodwListener __)
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MTest03().go();
	}
}
