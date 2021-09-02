package entInterfaces;

import entEnums.Color;

public class circle extends AbstractShape{

	private Double radios;

	public circle(Color color, Double radios) {
		super(color);
		this.radios = radios;
	}
	
	public Double getRadios() {
		return radios;
	}

	public void setRadios(Double radios) {
		this.radios = radios;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radios, 2);
	}
	
	
	
}
