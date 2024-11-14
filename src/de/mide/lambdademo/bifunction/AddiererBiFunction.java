package de.mide.lambdademo.bifunction;

import java.util.function.BiFunction;


/**
 * Diese Klasse implementiert Interface {@code BiFunction}, um zwei Integer-Werte 
 * zu addieren und das Ergebnis als Double zurückzugeben.
 * 
 * @param <T> Der Typ des ersten Eingabe-Arguments der Funktion (Integer).
 * 
 * @param <U> Der Typ des zweiten Eingabe-Arguments der Funktion (Integer).
 * 
 * @param <R> Der Typ des Ergebnisses der Funktion (Integer).
 */
public class AddiererBiFunction implements BiFunction<Integer, Integer, Integer> {

	/**
	 * Überschreibung der einzigen abstrakten Methoden im Interface {@code BiFunction}.
	 * Methode addiert zwei Zahlen und gibt das Ergebnis zurück. 
	 * 
	 * @param summand1 Erste Zahl
	 * 
	 * @param summand2 Zweite Zahl
	 * 
	 * @return Summe
	 */
	@Override
	public Integer apply( Integer summand1, Integer summand2 ) {

		return summand1 + summand2;
	}

}
