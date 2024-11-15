package de.mide.streamdemo.personen;

import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

	public static void main( String[] args ) {
		
		System.out.println();
		
		List<Person> personenListe = 
				List.of( new Person( "Alice" , "Armbruster", 1960 ),
						 new Person( "Bob"   , "Becker"    , 1972 ),
						 new Person( "Claire", "Cain"      , 1995 ) 
					   );
				                           
		List<String> volleNamenListe = null;
		
		volleNamenListe = personenListe.stream()
				                     .map( p -> p.getVorname() + " " + p.getNachname() )
				                     .collect( Collectors.toList() );
		
		volleNamenListe.forEach( str -> System.out.println( str ) );
		
		System.out.println();
	}
	
}
