package de.mide.lambdademo.wuerfel;


/**
 * Dieses Interface enthält nur eine abstrakte Methode, deshalb ist es
 * ein SAM-Interface (Single Abstract Method, funktionale Schnittstelle) 
 * und kann damit auch durch einen Lambda-Ausdruck implementiert werden. 
 * 
 * Für möglichen Seiten von Würfeln siehe
 * <a href="https://de.wikipedia.org/wiki/Spielw%C3%BCrfel#Die_Standard-W%C3%BCrfel">diese Seite</a>
 * in der deutsch-sprachigen Wikipedia. 
 */
@FunctionalInterface
public interface IWuerfel {

	/**
	 * Methode gibt eine mit Würfel geworfene (Zufalls-)Zahl zurück. 
	 * 
	 * @return Mit Würfel geworfene Zahl 
	 */
	public int wuerfeln();
	
}
