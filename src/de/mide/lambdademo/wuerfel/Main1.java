package de.mide.lambdademo.wuerfel;


/**
 * Beispiel für Verwendung der Klasse {@link StandardWuerfel},
 * die das Interface {@link IWuerfel} implementiert.
 */
public class Main1 {

	public static void main(String[] args) {
		
		final IWuerfel w6wuerfel = new StandardWuerfel();
		
		final int zahl = w6wuerfel.wuerfeln();
		System.out.println( "\nGewürfelte Zahl: " + zahl + "\n" );		
	}
	
}
