
public class Principale {

	public static void main(String[] args) {
		
		FormeFactory factory = new FormeFactory();
		
		Carre c1 = (Carre) factory.getForme(FormeType.CARRE);
		c1.dessiner();
		
		Cercle c2 = (Cercle) factory.getForme(FormeType.CERCLE);
		c2.dessiner();
		
		Rectangle c3 = (Rectangle) factory.getForme(FormeType.RECTANGLE);
		c3.dessiner();
		
	}
}
