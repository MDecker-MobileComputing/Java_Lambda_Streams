package de.mide.lambdademo;

import de.mide.lambdademo.stringHelfer.IStringBearbeiter;


/**
 * Beispiel für Implementierung von SAM-Interface {@link IStringBearbeiter}
 * mit einem Lambda-Ausdruck. 
 */
public class Main3 {

	public static void main(String[] args) {
		
		final IStringBearbeiter sb = ( String inputString ) -> {
			
			String ergebnisString = inputString.trim();
			final int laenge = ergebnisString.length();

			ergebnisString += " (" + laenge + ")";
			return ergebnisString;			
		};

		final String ergebnis = sb .verarbeiten( "Nudelauflauf" );
		System.out.println( ergebnis );
	}
	
}
