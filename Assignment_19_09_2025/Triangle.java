package com.Entities;

public class Triangle {
	private double b;
	private double h;
	private double hy=Math.sqrt(((b*b)+(h*h)));
	public Triangle(double b, double h, double hy) {
		this.b = b;
		this.h = h;
		this.hy = hy;
	}
	public Triangle() {
		this.b=b;
		this.h=h;
		this.hy=hy;
	}
	public double CalculateArea(){
		return (b*h)/2;
	}
	public double CalculatePerimeter(){
		return b+h+hy;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getHy() {
		return hy;
	}
	public void setHy(double hy) {
		this.hy = hy;
	}
}
