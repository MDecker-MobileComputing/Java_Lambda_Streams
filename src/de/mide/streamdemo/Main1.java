package de.mide.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Diese Klasse enthält ein einführendes Beispiel für die Verwendung von Streams. 
 */
public class Main1 {

	/**
	 * Stream-Schritte:
	 * <ul>
	 * <li>Es werden nur Element "durchgelassen", die mit dem Buchstaben "a" oder "A" anfangen.</li>
	 * <li>Jeder der durchgelassenen Strings wird in Großbuchstaben umgewandelt.</li>
	 * <li>Die Strings werden sortiert.</li>
	 * <li>Die Strings werden auf der Konsole ausgegeben.</li>
	 * </ul>
	 * <br><br>
	 * 
	 * Ausgabe:
	 * <pre>
	 * ABC
	 * ABX
	 * </pre> 
	 */
	public static void main( String[] args ) {
		
		System.out.println();
		
		final List<String> stringList = Arrays.asList( "ABx", "abc", "xbc", "cAB", "bex" );
		
		final Stream<String> stringStream = stringList.stream();
		
		stringStream.filter( str -> str.toLowerCase().startsWith( "a") )
		            .map( str -> str.toUpperCase() )
		            .sorted()
		            .forEach( System.out::println );
				
		System.out.println();
	}
	
}
