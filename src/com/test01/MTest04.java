package com.test01;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MTest04 extends Frame {
	Button bt;

	public MTest04() {
		super("abc");
		bt = new Button("click");

	}

	public void go() {
		add(bt);
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
		new MTest04().go();
	}

}
