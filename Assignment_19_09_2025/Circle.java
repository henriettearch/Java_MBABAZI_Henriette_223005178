package com.Entities;

public class Circle {
	double r;
//constructor
	public Circle(double r) {
		this.r = r;
	}
	public Circle() {
		
	}
	public double CalculateArea(){
		return Math.PI*(r*r);
	}
	public double CalculateCirc(){
		return 2*Math.PI*r;
	}
	public String toString() {
		return "Circle [r=" + r + ", Area is: =" + CalculateArea()
				+ ", Circumference is: " + CalculateCirc() + "]";
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
}
