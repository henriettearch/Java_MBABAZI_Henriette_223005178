package com.Entities;

public class Rectangle {
	private double l;
	private double w;
	private static double a;
	private static double b;
	public Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public static void DisplayArea(){
		System.out.println("Area "+(a*b ));
	}
	
	public Rectangle() {
		this.a= l;
		this.b= w;
	}
	public double CalculateArea(){
		return l*w;
	}
	public double CalculatePerimeter(){
		return (l+w)*2;
	}
	public String toString() {
		return "Rectangle [l=" + l + ", w=" + w + ", Area is: "
				+ CalculateArea() + ", Perimeter is: "
				+ CalculatePerimeter() + "]";
	}
	
	
	

}
