package com.test01;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MTest02 extends Frame implements ActionListener {
	Button bt01, bt02;
	Panel p;

	public MTest02() {
		super("abc");
		bt01 = new Button(" + ");
		bt02 = new Button(" - ");
		p = new Panel();
	}


	public void go() {

		bt01.addActionListener(this);
		bt02.addActionListener(this);

		p.add(bt01);
		p.add(bt02);
		add(p);

		setFont(new Font("°íµñ", Font.BOLD, 30));

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		}); // addWindowListener(WinodwListener __)
		setSize(300, 300);
		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand() + "¸¦ ´­·¶¾î");
	}

	public static void main(String[] args) {
		new MTest02().go();

	}

}
