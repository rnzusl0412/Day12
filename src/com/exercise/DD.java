package com.exercise;

public class DD implements IE{
	public void Disp() {
		System.out.println("�豹��");
	}
	public static void main(String[] args) {
		IE i = new DD();
		i.Disp();
	}
}
