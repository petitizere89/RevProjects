package Converter;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
	 
		int menuSelection=0,i=0;
		Scanner scan= new Scanner(System.in);
		while(menuSelection != 6) 
		{
			System.out.println("Please select an option");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Teaspoons to Tablespoon");
			System.out.println("3. Miles to Kilometers");
			System.out.println("4. Feet to Meters");
			System.out.println("5. US Gallons to Imperial Gallons");
			System.out.println("6. Quit");
			
			
			menuSelection = scan.nextInt();
			
			switch(menuSelection) {
			
			case 1:
				int cups = 0, teaspoon=48;
				cupsToTeaspoon(cups, teaspoon);
				break;
				
			case 2:
				System.out.println("Teaspoon to Tablespoon case");
				int Tablespoon=0;
				int Teaspoon=3;
				teaspoonToTablespoon(Tablespoon,Teaspoon);
				break;
				
			case 3:
				int miles = 0;
				double kilometer=1.60934d;
				MilesToKilometers(miles,kilometer);
				break;
			case 4:
				System.out.println("4. Feet to Meters");
				double foot = 1d, meter=0.3048d;
				feetToMeters(foot,meter);
				break;
			case 5:
				int USGallon = 0;
				double ImperialGallon=0.832674;
				UsGallonsToImperialGallons(USGallon, ImperialGallon);
				break;
			case 6:
				
				exit(menuSelection);
				break;
			default:
				System.out.println("*******************************");
				System.out.println("* Invalid input               * \n" + 
			                       "* If you'd like to start over * \n" +
						           "* Re-run the system           * ");
				System.out.println("*******************************");
				return;
				
			}
		}
	}
	
	private static void exit(int menuSelection) {
		menuSelection=6;
		System.out.print("System closing");
		sysTerminated();
		System.out.println();
	}

	private static void sysTerminated() {
//		int i=0;
//		   for (int c = 1; c <= 50; c++)//delay function{
//		       for (int d = 1; d <= 322222222; d++)
//		       {}
//		       System.out.print(".");
//		   }
//	//	while(i<50) {System.out.print("."); i++;}
//		
	}

	private static void feetToMeters(double foot, double meter) {
		System.out.println("Pleset enter foot/feet you'd like to convert to meter/meters");
		Scanner Foot = new Scanner(System.in);
		foot = Foot.nextDouble();
		meter = meter*foot;
		if(meter>1) {
			System.out.println("The are "+ meter+ " meters in " + foot +" feet");
		}
		else
		{
			System.out.println("The is "+ meter+ " meter in " + foot +" foot");

		}
	Foot.close();
	}

	private static void teaspoonToTablespoon(int tablespoon, int teaspoon) {
		System.out.println("Please enter number of cups you'd like to convert to teaspoon");
		Scanner Ts = new Scanner(System.in);
		tablespoon = Ts.nextInt();
		teaspoon = (int)tablespoon* teaspoon;
		System.out.println("The teaspoons in "+ tablespoon+" tablespoons"+" are "+teaspoon);
		System.out.println();
	Ts.close();
	}

	private static void UsGallonsToImperialGallons(int USGallon, double ImperialGallon) {
		System.out.println("Please enter number of US Gallons you'd like to convert to Imperial Gallons");
		Scanner usGallons = new Scanner(System.in);
		USGallon = usGallons.nextInt();
		ImperialGallon =(double)USGallon*ImperialGallon;
		System.out.println("The Imperial Gollons in "+ USGallon+" US Liquid Gallon"+" are "+ImperialGallon);
		System.out.println();
	usGallons.close();
	}
	private static void MilesToKilometers(int miles, double kilometer) {
		System.out.println("Please enter number of miles you'd like to convert to kilometer");
		Scanner Miles = new Scanner(System.in);
		miles = Miles.nextInt();
		kilometer =(double)miles*kilometer;
		System.out.println("The kilometer in "+ miles+" Miless"+" are "+kilometer);
		System.out.println();
	Miles.close();
	}
	private static double cupsToTeaspoon(int cups, int teaspoon) {
		System.out.println("Please enter number of cups you'd like to convert to teaspoon");
		Scanner Cups = new Scanner(System.in);
		cups = Cups.nextInt();
		teaspoon = cups*teaspoon;
		System.out.println("The teaspoons in "+ cups+" cups"+" are "+teaspoon);
		System.out.println();	
	Cups.close();
	return teaspoon;
	}
    
}
