
public class FormeFactory {
	
	public Forme getForme(FormeType type) {
	
		switch (type) {
		case CARRE: return new Carre();
		case CERCLE: return new Cercle();
		case RECTANGLE: return new Rectangle();
		default:return null;
		}
	}

}
