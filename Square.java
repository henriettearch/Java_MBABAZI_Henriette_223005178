package com.Entities;

public class Square {
	double s;
	public Square(double s){
		this.s= s;
	}
	public Square() {
		
	}
	double CalculateArea(){
		return s*s;
	}
	double CalculatePerimeter(){
		return s*4;
	}
	public String toString() {
		return "Area: "+ CalculateArea();
	}
	public double getS() {
		return s;
	}
	public void setS(double s) {
		this.s = s;
	}
	

}
