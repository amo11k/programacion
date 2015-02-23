package ejer_player;

	/**
	 * Esta clase contiene el constructor "player" y el metodo compareTo que exstiende player
	 * y nos servira para comparar diferentes players
	 * @author Amo11k
	 * 
	 **/
    /**
     * 
     * El constructor de esta clase necesita dos argumentos. Un string como nombre y un int como fuerza
     *
     */
public class Player implements Comparable<Player> {
	private String name;
	private int strength;

	public Player(String name, int str) {
		this.name = name;
		this.strength = str;
	}

	/**
	 * Este metodo recibe como parametro un player y lo compara con otro.
	 * @return Devuelve 1 si el player "o" es mas fuerte, -1 si es mas debil y 0 si son iguales
	 */
	public int compareTo(Player o) {
		if (strength < o.getStrength()) {
			return 1;
		} else if (strength > o.getStrength()) {
			return -1;
		} else {
			return 0;
		}
	}
	/**
	 * 
	 * @return devuelve la fuerza de un player
	 */
	public int getStrength() {
		return strength;
	}
	
	
	/**
	 * @return Devuelve player en string.
	 * 
	 */
	public String toString() {
		return name + " (" + strength + ")";
	}

}
