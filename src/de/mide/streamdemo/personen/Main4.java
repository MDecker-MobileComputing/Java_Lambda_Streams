package de.mide.streamdemo.personen;

import java.util.List;


/**
 * Diese Klasse demonstriert die Terminal-Operation {@code count()}.
 */
public class Main4 {

	public static void main( String[] args ) {
		
		System.out.println();
		
		List<Person> personenListe = 
				List.of( 
						 new Person( "Bob"   , "Becker"    , 1972 ),
						 new Person( "Alice" , "Armbruster", 1960 ),
						 new Person( "Claire", "Cain"      , 1995 ), 
						 new Person( "Alice" , "Armbruster", 2001 )
					   );
				                           		
		long anzahl = personenListe.stream()
				                   .filter( pers -> pers.getGebJahr() <= 1975 )
				                   .count();
		
		System.out.println( "Anzahl Personen, die 1975 oder früher geboren sind: " + anzahl + "\n" );
	}
	
}
