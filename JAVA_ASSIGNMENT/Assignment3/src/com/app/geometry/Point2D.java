package com.app.geometry;

import java.lang.Math;

public class Point2D{
	
	public double x;
	public double y;
	
	public Point2D(){
		this.x=0;
		this.y=0;
	}
	public Point2D(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public String getDetails() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

	
	public double calculateDistance(Point2D other) {
		double distance=0;
		distance = Math.sqrt(Math.pow((this.x-other.x),2)+ Math.pow((this.y-other.y),2));	
		return distance;		
	}
}