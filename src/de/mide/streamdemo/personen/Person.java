package de.mide.streamdemo.personen;

import java.util.Objects;

/**
 * Ein Objekt dieser Klasse repräsentiert eine Person mit den Attributen Vor- und Nachname
 * sowie Geburtsjahr.
 */
public class Person {

	private String _vorname;
	
	private String _nachname;
	
	private int _gebJahr;
	
	
	public Person( String vorname, String nachname, int gebJahr ) {
		
		_vorname  = vorname;
		_nachname = nachname;
		_gebJahr  = gebJahr;
	}

	public String getVorname() {
		
		return _vorname;
	}

	public void setVorname( String vorname ) {
		
		_vorname = vorname;
	}

	public String getNachname() {
		
		return _nachname;
	}

	public void setNachname( String nachname ) {
		
		_nachname = nachname;
	}

	public int getGebJahr() {
		
		return _gebJahr;
	}

	public void setGebJahr( int gebJahr ) {
		
		_gebJahr = gebJahr;
	}
	
	/**
	 * Methode liefert String-Repräsentation des Objekts zurück.
	 * 
	 * @return Vor- und Nachname, Geb-Jahr in Klammer
	 */
	@Override
	public String toString() {
		
		return _vorname + " " + _nachname + " (" + _gebJahr + ")";
	}

	/**
	 * Hash-Wert ("Fingerabdrucks") des Objekts.
	 * 
	 * @return Hash-Wert, für den aber nur Vor- und Nachname (nicht aber das GebJahr) 
	 *         berücksichtigt werden
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash( _vorname, _nachname );
	}

	
	/**
	 * Vergleicht aufrufendes Objekt mit dem als Argument übergebenen Objekt {@code obj};
	 * es werden nur Vor- und Nachname verglichen, nicht aber das Geburtsjahr!
	 * 
	 * @param obj Objekt, das mit aufrufenden Objekt verglichen werden soll.
	 * 
	 * @return {@code true} gdw. {@code obj} auch ein Objekt der Klasse {@link Person}
	 *         ist und Vor- und Nachname übereinstimmen. 
	 */
	@Override
	public boolean equals( Object obj ) {
		
		if ( obj == null ) { return false; }
		
		if ( obj == this ) { return true; }
		
		if ( obj instanceof Person p ) {
			
			return _vorname.equals(  p.getVorname()  ) &&
				   _nachname.equals( p.getNachname() );			
		} else {
			
			return false;
		}
		
	}
		
}
