package entHerançaPolimorfismo;

import entEnums.Color;

public class rectangle extends shape {

	private double width;
	private double height;
	
	public rectangle() {
		super();
	}

	public rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
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
		return width*height;
	}

}
