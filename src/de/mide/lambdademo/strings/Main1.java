package de.mide.lambdademo.strings;


/**
 * Beispiel für Verwendung der Klasse {@code StringDekorierer},
 * die das SAM-Interface {@link IStringBearbeiter} implementiert.
 */
public class Main1 {

	public static void main( String[] args ) {
		
		final IStringBearbeiter sb = new StringLaengeAnhaenger();
				
		final String ergebnis = sb .verarbeiten( "Gurkensalat" );
		System.out.println( ergebnis );
	}
	
}
