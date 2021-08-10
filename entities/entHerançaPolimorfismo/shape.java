package entHerançaPolimorfismo;

import entEnums.Color;

public abstract class shape {

	private Color color;
	
	public shape() {

	}

	public shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
}
