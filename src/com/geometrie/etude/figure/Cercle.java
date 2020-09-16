package com.geometrie.etude.figure;

public class Cercle extends Figure {	
	
	private double rayon ; 
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double calculerSurface() {
		return rayon * rayon * Math.PI;
	}
	
	

}
