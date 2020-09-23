package com.geometrie.etude.figure;

public class Triangle extends Polygone {
private static final int NBR_COTES = 2;
	private double base ;
	private double hauteur ;
	
	public Triangle(double base, double hauteur) {
		super(NBR_COTES);
		this.base = base;
		this.hauteur = hauteur;
	}
	
	@Override
	public double calculerSurface() {
		return base * hauteur / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
}
