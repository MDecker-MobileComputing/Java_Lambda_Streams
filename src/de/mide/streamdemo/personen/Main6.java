package de.mide.streamdemo.personen;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Die Klasse zeigt, wie mit {@code Collectors.toMap()} die Termina-Operation
 * {@code collect()} eine Map zurückgeben kann.
 */
public class Main6 {

	public static void main( String[] args ) {

		System.out.println();

		List<Person> personenListe =
							List.of(
									 new Person( "Bob"   , "Becker"    , 1972 ),
									 new Person( "Alice" , "Armbruster", 1960 ),
									 new Person( "Claire", "Cain"      , 1995 )
								   );

		Map<String, Person> map = personenListe.stream()
				                               .collect( 
				                            		  Collectors.toMap( Person::getNachname, 
				                            				            Function.identity() )
				                               );				
		System.out.println( map );
	}

}
