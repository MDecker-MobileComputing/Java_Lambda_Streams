package de.mide.lambdademo.wuerfel;


public class Main1 {

	public static void main(String[] args) {
		
		final IWuerfel w6wuerfel = new StandardWuerfel();
		
		final int zahl = w6wuerfel.wuerfeln();
		System.out.println( "\nGewürfelte Zahl: " + zahl + "\n" );		
	}
	
}
