package com.geometrie.etude.figure;

public class Rectangle extends Polygone {
	
	
	// Constante toujours en majuscule "NBR_COTES"
	private static final int NBR_COTES = 4; 
	// final resultat ne peut être modifié

	
	private double base;
	private double hauteur;
	
	public Rectangle(double base, double hauteur) {
		super( NBR_COTES );
		this.base = base ;
		this.hauteur = hauteur ;
		
	}
	
	 
	@Override
	public double calculerSurface() {
		return base * hauteur;
	}

	public double getBase() {
		return base ;
		
	}
	public double getHauteur() {
		return hauteur;
	}
}
