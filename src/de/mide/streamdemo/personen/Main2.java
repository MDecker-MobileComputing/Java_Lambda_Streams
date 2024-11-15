package de.mide.streamdemo.personen;

import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

	/**
	 * Demonstration der Stream-Operation {@code distinct()} (zustandsbehaftete Zwischen-Operation),
	 * die von jedem Objekt nur eines durchlässt. 
	 * <br><br>
	 * 
	 * Weil in der Klasse {@link Person} die Methoden {@code hashCode()} und {@code equals()}
	 * nur die Attribute Vor- und Nachname berücksichtigen, werden Personen mit selben
	 * Vor- und Nachnamen aber unterschiedlichen Geburtsjahren nicht als unterschiedliche
	 * Personen erkannt.
	 * <br><br>
	 * 
	 * Ausgabe des Programms:
	 * <pre>
	 * Alice Armbruster (1960)
     * Bob Becker (1972)
	 * </pre>
	 */
	public static void main( String[] args ) {
		
		System.out.println();
		
		List<Person> personenListe = 
				List.of( new Person( "Alice" , "Armbruster", 1960 ),
						 new Person( "Bob"   , "Becker"    , 1972 ),
						 new Person( "Alice" , "Armbruster", 2001 ) // noch eine "Alice Armbruster", aber anderes Geb-Jahr!
					   );
				                           
		List<Person> eindeutigePersonenListe = 
				personenListe.stream()
		                     .distinct() // zustandsbehaftete Zwischen-Operationen
		                     .collect( Collectors.toList() );
		
		eindeutigePersonenListe.forEach( p -> System.out.println( p ) ); 
		
		System.out.println();
	}
	
}
