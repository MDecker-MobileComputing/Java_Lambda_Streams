package de.mide.lambdademo;


/**
 * Dieses Interface enthält nur eine abstrakte Methode, deshalb ist es
 * ein SAM-Interface (Single Abstract Method, funktionale Schnittstelle) 
 * und kann damit auch als Lambda-Ausdruck geschrieben werden. 	
 */
@FunctionalInterface
public interface IStringBearbeiter {

	/**
	 * Methode, die einen String als Argument übergeben bekommt,
	 * diesen verarbeitet (z.B. Zeichen ersetzt oder vorne/hinten
	 * was anhängt), und dann wieder einen String zurückgibt.
	 * 
	 * @param inputString String, der bearbeitet werden soll
	 * 
	 * @return Ergebnis der Bearbeitung von {@code inputString}
	 */
	public String stringBearbeiten( String inputString );
	
}
