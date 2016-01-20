import java.awt.*;
import java.util.Comparator;

public abstract class FiguraGeometrica02 implements Comparable<Object> {
	protected int codi = 0;
	protected String nom = "";
	protected Color color = Color.white;

	public FiguraGeometrica02(int ncodi, String nnom, Color ncolor) {
		if (ncodi > 0)
			codi = ncodi;
		nom = nnom;
		color = ncolor;
	}

	public FiguraGeometrica02(FiguraGeometrica02 f) {
		this(f.codi, f.nom, f.color);
	}

	public FiguraGeometrica02() {
	}

	public void setCodi(int nouCodi) {
		if (nouCodi >= 0)
			codi = nouCodi;
	}

	public void setNom(String nouNom) {
		nom = nouNom;
	}

	public void setColor(Color nouColor) {
		color = nouColor;
	}

	public int getCodi() {
		return codi;
	}

	public String getNom() {
		return nom;
	}

	public Color getColor() {
		return color;
	}

	public void visualitzar() {
		System.out.println("Codi..........:" + codi);
		System.out.println("Nom...........:" + nom);
		System.out.println("Color.........:" + color);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof FiguraGeometrica02)
			return codi == ((FiguraGeometrica02) obj).codi;
		return false;
	}

	public String toString() {
		return codi + " - " + nom;
	}

	public static class ComparatorFiguraGeometricaSegonsArea implements Comparator<FiguraGeometrica02> {
		public int compare(FiguraGeometrica02 f1, FiguraGeometrica02 f2) {
			double result = f1.area() - f2.area();
			if (result < 0)
				return -1; // Cas en que f1.area() < f2.area();
			if (result > 0)
				return 1; // Cas en que f1.area() > f2.area();
			return 0; // Cas en que f1.area() i f2.area() s�n iguals
		}
	}
	
	   public int compareTo(Object obj) {
		      return codi-((FiguraGeometrica02)obj).codi;
		   }

	abstract public double area();
}