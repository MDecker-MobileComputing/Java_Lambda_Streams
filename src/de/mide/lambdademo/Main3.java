package de.mide.lambdademo;

import de.mide.lambdademo.stringHelfer.IStringBearbeiter;


/**
 * Beispiel für Implementierung von SAM-Interface {@link IStringBearbeiter}
 * mit einem Lambda-Ausdruck. 
 */
public class Main3 {

	public static void main(String[] args) {
		
		String ergebnis = null;
				
		
		// Lambda-Expression 1		
		IStringBearbeiter sb1 = ( String inputString ) -> {
			
			return inputString + " (" + inputString.length() + ")"; 	
		};

		ergebnis = sb1.verarbeiten( "Nudelauflauf" );
		System.out.println( ergebnis );
		
		
		// Lambda-Expression 2: kein Argument in runder Klammer erforderlich
		IStringBearbeiter sb2 = ( inputString ) -> {
			
			return inputString + " (" + inputString.length() + ")"; 	
		};

		ergebnis = sb2.verarbeiten( "Erbsensuppe" );
		System.out.println( ergebnis );


		
		// Lambda-Expression 3: Block-Klammern und "return" weglassen
		IStringBearbeiter sb3 = ( inputString ) -> inputString + " (" + inputString.length() + ")"; 						 	

		ergebnis = sb3.verarbeiten( "Rollmops" );
		System.out.println( ergebnis );
	}
	
}
