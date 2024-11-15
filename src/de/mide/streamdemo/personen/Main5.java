package de.mide.streamdemo.personen;

import java.util.List;
import java.util.Optional;


/**
 * Diese Klasse demonstriert die Terminal-Operation {@code max()}, der hier eine Methodenreferenz übergeben wird.
 */
public class Main5 {

	public static void main( String[] args ) {

		System.out.println();

		List<Person> personenListe =
				List.of(
						 new Person( "Bob"   , "Becker"    , 1972 ),
						 new Person( "Alice" , "Armbruster", 1960 ),
						 new Person( "Claire", "Cain"      , 1995 ),
						 new Person( "Alice" , "Armbruster", 2001 )
					   );

		Optional<Integer> maxGebJahrOptional =
								personenListe.stream()
								             //.filter( pers -> pers.getNachname().startsWith("M") )
								             .map( pers -> pers.getGebJahr() )
											 //.max( (jahr1, jahr2) -> Integer.compare(jahr1, jahr2) );
								             .max( Integer::compare );

		if ( maxGebJahrOptional.isPresent() ) {

			int maxJahr = maxGebJahrOptional.get();
			System.out.println( "Maximales Geb-Jahr: " + maxJahr );

		} else {

			System.out.println( "Maximales Geb-Jahr konnte nicht bestimmt werden." );
		}

		System.out.println();
	}

}
