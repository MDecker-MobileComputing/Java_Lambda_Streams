package de.mide.lambdademo.swing;

import static java.awt.Font.PLAIN;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


/**
 * Diese Klasse erzeugt mit Hilfe der GUI-Bibliothek Swing ein Fenster, in dem sich zwei
 * Schaltflächen befinden, die beide das Gleiche tun (nämlich eine Zahl hochzählen, wenn
 * sie angeklickt werden). Die Event-Handler für Button 1 wird "konventionell" (d.h. mit
 * einer anonymen Klasse) realisiert, für Button 2 mit einem Lambda-Ausdruck.
 * <br><br>
 *
 * Klasse in Anlehnung an ein Beispiel aus dem Buch "Grundkurs in Programmieren in Java"
 * von Ratz et al. (2024), siehe Kapitel 19.1.1 (Seite 684ff).
 */
@SuppressWarnings("serial")
public class ZaehlButtonsFrame extends JFrame {

	/** Zähler, der mit Button 1 erhöht wird. */
	private int _zaehler1 = 0;

	/** Zähler, der mit Button 2 erhöht wird. */
	private int _zaehler2 = 0;


	/**
	 * Konstruktor, richtet Nutzeroberfläche inkl. Event-Handler für die beiden
	 * Buttons ein.
	 */
	public ZaehlButtonsFrame() {

		final GridLayout layout = new GridLayout( 0, 1, 0, 10 ); // 1 Spalte, beliebig viele Zeile
	    final JPanel panel = new JPanel();
	    panel.setLayout(layout);

		panel.setBorder( new EmptyBorder( 10, 10, 10, 10 ) ); // Abstand an allen vier Seiten zwischen Buttons und Rahmen


		final JButton button1 = new JButton( _zaehler1 + "" );
		final JButton button2 = new JButton( _zaehler2 + "" );

	    final Font font = new Font( "Arial", PLAIN, 20 );
	    button1.setFont( font );
	    button2.setFont( font );

	    // Event-Handler für Button 1: Anonyme Klasse
		final ActionListener al1 = new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				button1.setText( ++_zaehler1 + "" );
			}
		};

	    // Event-Handler für Button 2
		final ActionListener al2 = e -> button2.setText( ++_zaehler2 + "" );

		button1.addActionListener( al1 );
		button2.addActionListener( al2 );

		panel.add( button1 );
		panel.add( button2 );

		final Container container = getContentPane();
		container.add( panel );
	}


	/**
	 * Einstiegspunkt des Programms.
	 */
	public static void main( String[] args ) {

		final ZaehlButtonsFrame fenster = new ZaehlButtonsFrame();

		fenster.setTitle( "Zähl-Buttons" );
		fenster.setSize( 400, 200 );
		fenster.setVisible( true );
		fenster.setDefaultCloseOperation( EXIT_ON_CLOSE );
	}

}
