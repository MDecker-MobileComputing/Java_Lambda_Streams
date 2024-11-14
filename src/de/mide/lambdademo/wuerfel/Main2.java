package de.mide.lambdademo.wuerfel;


/**
 * Beispiel für Implementierung von Interface {@link IWuefel} mit
 * einem Lambda-Ausdruck.
 */
public class Main2 {

    public static void main(String[] args) {

    	final IWuerfel w12Wuerfel = () -> (int) ( Math.random() * 12 ) + 1;

		final int zahl = w12Wuerfel.wuerfeln();
		System.out.println( "\nGewürfelte Zahl: " + zahl + "\n" );	
    }

}
