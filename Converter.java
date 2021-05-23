package main;
import java.util.Scanner;  // Import the Scanner class

public class Converter {
	
	public static void main(String[] args) {
		int menuSelection=0;
		while(menuSelection != 4) {
			//menuDisplay();
			menuSelection=optionSelected();
			getChoice(menuSelection);
		}
		
	}
	
	public static void menuDisplay() {
		System.out.println("Please select an option:\n");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit\n");	 
	}
	public static int optionSelected() {
		 menuDisplay();
		 @SuppressWarnings("resource")
		 Scanner scanObj = new Scanner(System.in);
		 System.out.println("Insert option: ");
		 int menuSelection = scanObj.nextInt();
		 return menuSelection;
	}
	
	public static void getChoice(int menuSelection) {
		
		switch(menuSelection) {
			case 1:
				 Scanner scanObject = new Scanner(System.in);
				 System.out.println("Please insert the number of cups: ");
				 int numberOfCups = scanObject.nextInt();
				 System.out.println(numberOfCups);
				 System.out.println(numberOfCups+ " cup is about " + cupToTeaspoon(numberOfCups)+" Teaspoons\n");
				 break;
			case 2:
				 Scanner Obj = new Scanner(System.in);
				 System.out.println("Please insert the number of Miles: ");
				 int numberOfMiles = Obj.nextInt();
				 System.out.println(numberOfMiles);
				 System.out.println(numberOfMiles+ " Miles is about " + milesToKilometer(numberOfMiles)+" Kilometers\n");				
				 break;
				 
			case 3:
				 Scanner galObj = new Scanner(System.in);
				 System.out.println("Please insert the number of Gallons: ");
				 double numberOfGals = galObj.nextDouble();
				 System.out.println(numberOfGals);
				 System.out.println(numberOfGals+ " Gallons is about " + gallonToImperialGallon(numberOfGals)+" Imperial Gallons\n");
				 break;
			case 4:
				System.out.println("Program has ended");
				break;
			default:
				System.out.println("Error"+menuSelection 
						+"is not an option");
		}
	}
	
	public static int cupToTeaspoon(int cup) {
		final int teaSpoon=16;
		int conversion= cup *teaSpoon;
		//System.out.println(cup+ "cup is about " + conversion+"Teaspoons");
		return conversion;
	}
	
	public static double milesToKilometer(double miles) {
		final double kilometer=1.609344;
		double conversion=miles*kilometer;
		
		return conversion;
	}
	
	public static double gallonToImperialGallon(double usGal) {
		final double imperailGal=0.83267384;
		double conversion = usGal * imperailGal;
		//Imperial gal = US gal x 0.83267384
		return conversion;
	}
}	
