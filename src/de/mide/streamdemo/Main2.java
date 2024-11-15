package de.mide.streamdemo;
	
import java.util.List;


/**
 * Diese Klasse enthält ein Beispiel für die Verwendung der zustandsbehafteten 
 * Zwischen-Operation {@code sorted()}. 
 */
public class Main2 {

	public static void main( String[] args ) {
		
		System.out.println();
		
		final List<Integer> intList = List.of( 5, 3, 0, 7, 1 );
		
		intList.stream()
		       .sorted()
		       .forEach( i -> System.out.println( i ) );
		
		System.out.println();
	}
	
}
