package com.flyweightPractice;
import java.awt.Color;
import java.awt.Graphics;
public class Rect {
	private Color color = Color.BLACK;
	private int x, x1, y, y1;
	public static long i=0;
	public Rect(Color color){
		this.color=color;
		System.out.println("Object Number : "+i++);
	}
	public void draw(Graphics graphics, int upperX, int upperY, int lowerX, int lowerY){
		graphics.setColor(this.color);
		graphics.fillRect(upperX,upperY,lowerX,lowerY);
		//graphics.fill3DRect(upperX, upperY, lowerX, lowerY, true);
		//graphics.fillOval(upperX, upperY, lowerX, lowerY);		
	}
}
