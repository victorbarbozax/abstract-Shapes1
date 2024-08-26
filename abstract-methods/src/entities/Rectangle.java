package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private Double width;
	private double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	
}
