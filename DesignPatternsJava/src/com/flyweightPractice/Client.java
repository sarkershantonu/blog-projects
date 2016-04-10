package com.flyweightPractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client extends JFrame{
	public static final long serial = 1L;
	JButton myButton;
	int width = 1024;
	int hight=768;
	Color[] myColors = {Color.white,Color.black,Color.orange, Color.red, Color.yellow,Color.blue, Color.pink, Color.cyan, Color.magenta,Color.gray};
	public Color getRandomeColors(){
		Random randomeGenerate = new Random();
		int colorId = randomeGenerate.nextInt(10);
		return myColors[colorId];
	}
	public int getRandomWeight(){
		return (int)(Math.random()*width);
	}
	public int getRandomHight(){
		return (int)(Math.random()*hight);
	}
	public static void main(String[] args) {
		new Client();
	}
	public Client(){
		this.setSize(width,hight);
		this.setLocationRelativeTo(null);
		this.setTitle("Shantonu Test drawing");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());
		final JPanel drawingPanel = new JPanel();
		myButton = new JButton("Test button");
		contentPanel.add(drawingPanel, BorderLayout.CENTER);
		contentPanel.add(myButton, BorderLayout.SOUTH);
		myButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent arg0) {
				Graphics myGfx = drawingPanel.getGraphics();
				long startTime = System.currentTimeMillis();
				for(long i=0; i<=1000000;i++){
					Rect myRect = RectMaker.getRect(getRandomeColors());
					myRect.draw(myGfx, getRandomWeight(),getRandomHight(),getRandomWeight(),getRandomHight());
				}
				long endTime = System.currentTimeMillis();
				System.out.println("The time : "+(endTime-startTime) +" MS");
			}
		});
		this.add(contentPanel);
		this.setVisible(true);
	}

}
