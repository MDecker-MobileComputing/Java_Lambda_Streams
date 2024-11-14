package de.mide.lambdademo.bifunction;

import static java.lang.String.format;

import java.util.function.BiFunction;

public class Main {

	/** Array mit Zahlen, die als erstes Argument der Berechnungsfunktion übergeben werden. */
    private static final int[] ZAHLEN_ARRAY_1 = { 1, 2, 3 };
    
    /** Array mit Zahlen, die als zweites Argument der Berechnungsfunktion übergeben werden. */
    private static final int[] ZAHLEN_ARRAY_2 = { 4, 5, 6 };

    
    /**
     * Funktion auf die beiden Zahlenreihen anwenden und Ergebnis auf Konsole schreiben.
     * 
     * @param funktion Funktion, die auf die beiden Zahlenreihen angewendet werden soll.
     */
    private static void berechnungenDurchfuehren( BiFunction<Integer, Integer, Integer> funktion ) {

        for ( int i = 0; i < ZAHLEN_ARRAY_1.length; i++ ) {

            final int ergebnis = funktion.apply( ZAHLEN_ARRAY_1[i], ZAHLEN_ARRAY_2[i] );

            final String ausgabe = format( "Berechnungsergebnis für %d und %d: %d",
            		                       ZAHLEN_ARRAY_1[i], ZAHLEN_ARRAY_2[i],
            		                       ergebnis );
            System.out.println(ausgabe);
        }
    }


    /**
     * Einstiegspunkt für Programmausführung.
     */
    public static void main( String[] args ) {

    	System.out.println();
    	
        final BiFunction<Integer, Integer, Integer> addierFunktion = new AddiererBiFunction();
        berechnungenDurchfuehren( addierFunktion );
        
        System.out.println();

        final BiFunction<Integer, Integer, Integer> multiplizierFunktion = ( int1, int2 ) -> int1*int2;
        berechnungenDurchfuehren( multiplizierFunktion );
        
        System.out.println();
    }

}
