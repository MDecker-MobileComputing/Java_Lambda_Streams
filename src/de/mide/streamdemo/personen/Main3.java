package de.mide.streamdemo.personen;

import java.util.List;


/**
 * Diese Klasse demonstriert die zustandsbehaftete Zwischen-Operation {@code sorted()};
 * hierfür muss das Interface {@code Comparable} von der Klasse {@code Person} implementiert 
 * werden. 
 */
public class Main3 {

	public static void main( String[] args ) {
		
		System.out.println();
		
		List<Person> personenListe = 
				List.of( 
						 new Person( "Bob"   , "Becker"    , 1972 ),
						 new Person( "Alice" , "Armbruster", 1960 ),
						 new Person( "Claire", "Cain"      , 1995 ), 
						 new Person( "Alice" , "Armbruster", 2001 )
					   );
				                           		
		personenListe.stream()
				     .sorted()
				     .forEach( pers -> System.out.println( pers ) );
		
		System.out.println();
	}
	
}
