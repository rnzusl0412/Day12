package com.test01;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MTest01 extends Frame {
	Button bt;

	public MTest01() {
		super("abc");
		bt = new Button("click");

	}

	public void go() {
		add(bt);
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭했다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getWhen());
				System.out.println(e.getID());
				System.out.println(e.getSource());
				Button res = (Button) e.getSource();
				System.out.println("내가 선택한 버튼의 정보");
				System.out.println(res.getActionCommand());
				System.out.println(res.getLabel());
				System.out.println(res.getX() + "," + res.getY());

			}

		});

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		}); // addWindowListener(WinodwListener __)
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MTest01().go();
	}

}
