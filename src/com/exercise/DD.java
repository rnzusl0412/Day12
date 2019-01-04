package com.exercise;

public class DD implements IE{
	public void Disp() {
		System.out.println("±è±¹Çö");
	}
	public static void main(String[] args) {
		IE i = new DD();
		i.Disp();
	}
}
