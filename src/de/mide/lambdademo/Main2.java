package de.mide.lambdademo;

import de.mide.lambdademo.stringHelfer.IStringBearbeiter;


/**
 * Beispiel für Implementierung von SAM-Interface {@link IStringBearbeiter}
 * mit einer anonymen Klasse. 
 */
public class Main2 {

	public static void main( String[] args ) {
		
		final IStringBearbeiter sb = new IStringBearbeiter() {
			
			@Override
			public String stringBearbeiten( String inputString ) {
			
				String ergebnisString = inputString.trim();
				final int laenge = ergebnisString.length();

				ergebnisString += " (" + laenge + ")";
				return ergebnisString;
			}
		};
		
		final String ergebnis = sb .stringBearbeiten( "Leberwurst" );
		System.out.println( ergebnis );
	}
	
}
