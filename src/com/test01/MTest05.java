package com.test01;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MTest05 extends Frame {
	Panel p1, p2;
	Label lbx, lby;
	TextField txtX, txtY;

	public MTest05() {
		super("Test");
		p1 = new Panel();
		p2 = new Panel();
		lbx = new Label("X : ");
		lby = new Label("Y : ");
		txtX = new TextField("    0");
		txtY = new TextField("    0");

	}

	public void go() {
		p2.add(lbx);
		p2.add(txtX);
		p2.add(lby);
		p2.add(txtY);
		p2.setBackground(Color.GRAY);
		addWindowListener(new MyEvent());	//frame closing
		p1.addMouseListener(new MyEvent());
		p1.addMouseMotionListener(new MyEvent());
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		setFont(new Font("°íµñ", Font.BOLD, 30));
		setSize(500, 500);
		setVisible(true);

	}
	
	class MyEvent extends WindowAdapter 
	implements MouseListener, MouseMotionListener{

		@Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			System.out.println("mouseClicked");
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			p1.setBackground(Color.WHITE);
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			p1.setBackground(Color.BLACK);
			txtX.setText("00");
			txtY.setText("00");
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			System.out.println("mousePressed");
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			System.out.println("mouseReleased");
		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			//System.out.println("mouseMoved"+e.getSource());
			txtX.setText(String.valueOf(e.getX()));
			txtY.setText(String.valueOf(e.getY()));

		}
		
		
		
	}

	public static void main(String[] args) {
		new MTest05().go();
	}
}
