package de.mide.lambdademo.stringHelfer;

/**
 * Implementierung von SAM-Interface {@link IStringBearbeiter}
 * mit einer separaten Klassen.
 */
public class StringDekorierer implements IStringBearbeiter {

	/**
	 * Implementierung der einzigen Methode aus dem Interface
	 * {@link IStringBearbeiter}. 
	 * 
	 * Diese Methode bearbeitet den Eingabestring, indem sie führende und
	 * nachfolgende Leerzeichen entfernt und dann die Länge des getrimmten
	 * Strings in Klammern an das Ende des Strings anhängt.
	 *
	 * @param inputString Der zu bearbeitende String.
	 *
	 * @return Der bearbeitete String mit angehängter Länge in Klammern;
	 *         Beispiel: Für {@code inputString="abc"} wird {@code "abc (3)"}
	 *         zurückgegeben.
	 */
	@Override
	public String stringBearbeiten( String inputString ) {

		String ergebnisString = inputString.trim();
		final int laenge = ergebnisString.length();

		ergebnisString += " (" + laenge + ")";
		return ergebnisString;
	}

}
