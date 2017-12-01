import java.util.Observer;


public abstract class Capteur implements Observer {

	private int pos;
	
	//représente le nombre de voitures qui sont passées devant pendant un laps de temps
	private int etat;
	//représente les infos à afficher
	private String infos;
	
	/**
	 * 
	 */
	public Capteur() {
		// TODO Auto-generated constructor stub
	}
	
	/*METHODES QU'IL VA FALLOIR IMPLENTER
	 * 
	 * Alerte()
	 * 		Print infos, incrémente etat, puis vide info.
	 * 
	 * Reset()
	 * 		Remet l'état à zero
	 */

}
