package de.mide.lambdademo.strings;


/**
 * Beispiel für Implementierung von SAM-Interface {@link IStringBearbeiter}
 * mit einer anonymen Klasse. 
 */
public class Main2 {

	public static void main( String[] args ) {
		
		final IStringBearbeiter sb = new IStringBearbeiter() {
			
			@Override
			public String verarbeiten( String inputString ) {
			
				return inputString + " (" + inputString.length() + ")"; 
			}
		};
		
		final String ergebnis = sb .verarbeiten( "Leberwurst" );
		System.out.println( ergebnis );
	}
	
}
