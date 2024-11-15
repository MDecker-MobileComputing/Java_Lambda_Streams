package de.mide.streamdemo.personen;

import java.util.List;


/**
 * Demonstration für parallele Abarbeitung von Streams.
 */
public class Main7 {

	public static void main( String[] args ) {

		System.out.println();

		final List<String> stringListe = List.of( "a", "b", "c", "d" );

		stringListe.stream().forEach( str -> {
			
			System.out.println( Thread.currentThread().getName() + " - " + str );
		});

		System.out.println();

		stringListe.parallelStream().forEach( str -> {
			
			System.out.println( Thread.currentThread().getName() + " - " + str );
		});

		System.out.println();
	}

}
