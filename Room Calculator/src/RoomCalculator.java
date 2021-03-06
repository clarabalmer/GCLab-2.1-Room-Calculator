import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Hello, user!");
		boolean repeat = true;
		
		
		while (repeat) {
			System.out.print("Enter the length of the room in feet: ");
			double length = scnr.nextDouble();
			System.out.print("Enter the width of the room in feet: ");
			double width = scnr.nextDouble();
			System.out.print("Would you like the volume of the room as well? y/n ");
			String volChoice = scnr.next();
			boolean vol = false;
			if (volChoice.equals("y") || volChoice.equals("Y")) {
				vol = true;
			}
			
			double height = 0;
			if (vol) {
				System.out.print("Enter the height of the room in feet: ");
				height = scnr.nextDouble();
			}
			
			double area = length * width;
			double perimeter = length + length + width + width;
			System.out.println();
			System.out.println("The area is " + area + " square feet.");
			System.out.println("The perimeter is " + perimeter + " feet.");
			if (vol) {
				double volume = area * height;
				System.out.println("The volume is " + volume + " cubic feet.");
			}
			
			System.out.print("Would you like to calculate another room's dimensions? y/n ");
			String repeatChoice = scnr.next();
			if (!repeatChoice.equals("y") && !repeatChoice.equals("Y")) {
				repeat = false;
			} else {
				System.out.println();
			}
		}
		
		System.out.println("Have a nice day!");
		
		
	}

}
