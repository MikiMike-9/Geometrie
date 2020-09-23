package com.geometrie.etude.test;

import com.geometrie.etude.figure.Figure;
import com.geometrie.etude.figure.Carre;
import com.geometrie.etude.figure.Triangle;
import com.geometrie.etude.figure.Rectangle;

public final class TestFigure {

	public static void main(String[] args) {
		//objet//
		Figure f = new Triangle(23, 44);
		afficherSurface(f);
		
		f = new Carre(25);
		afficherSurface(f);
		
		Triangle t = new Triangle(9, 32);
		afficherSurface(t);
		Rectangle r = new Rectangle(11,22);
		
		afficherSurface(r);
	}
	public static void afficherSurface(Figure figure) {
		if (figure instanceof Triangle) {
			double base = ((Triangle)figure).getBase();
			System.out.println("Base du triangle est " + base);
		}
		System.out.println(" Surface =" + figure.calculerSurface());
		
	}

}
