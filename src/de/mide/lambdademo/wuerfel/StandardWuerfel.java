package de.mide.lambdademo.wuerfel;

import java.util.Random;


/**
 * Ein Objekt dieser Klasse simuliert einen Standard-Würfel
 * mit sechs Seiten (sog. "W6"-Würfel).
 */
public class StandardWuerfel implements IWuerfel {

	/** Zufallsgenerator. */
	private Random _random = new Random();
	
	
	/** 
	 * Einzige Methode von SAM-Interface {@code IWurfel}
	 * überschreiben.
	 * 
	 * @return Zufallszahl zwischen 1 und 6
	 */
	@Override
	public int wuerfeln() {

		return _random.nextInt( 1, 6 );
	}

}
