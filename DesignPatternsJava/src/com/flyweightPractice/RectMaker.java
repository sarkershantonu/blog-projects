package com.flyweightPractice;

import java.awt.Color;
import java.util.HashMap;

public class RectMaker {
	private static final HashMap<Color, Rect> rectsByColors = new HashMap<Color, Rect>();	
	public static Rect getRect(Color aColor){
		Rect myRect = (Rect)rectsByColors.get(aColor);
		if(myRect==null){
			myRect=new Rect(aColor);
			rectsByColors.put(aColor, myRect);
		}
		return myRect;
	}
}
