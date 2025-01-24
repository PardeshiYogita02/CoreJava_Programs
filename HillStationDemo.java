/*2.Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.*/

package Java_Internship;
//Superclass HillStations
class HillStations {
	// Method to display general location
	public void location() {
		System.out.println("General hill station location.");
	}

	// Method to display general information about what the hill station is famous for
	public void famousFor() {
		System.out.println("General hill station is famous for its beauty.");
	}
}

//Subclass Manali
class Manali extends HillStations {
	// Overriding the location method for Manali
	public void location() {
		System.out.println("Manali is in Himachal Pradesh.");
	}

	// Overriding the famousFor method for Manali
	public void famousFor() {
		System.out.println("Manali is famous for snow and adventure sports.");
	}
}

//Subclass Mussoorie
class Mussoorie extends HillStations {
	// Overriding the location method for Mussoorie
	public void location() {
		System.out.println("Mussoorie is in Uttarakhand.");
	}

	// Overriding the famousFor method for Mussoorie
	public void famousFor() {
		System.out.println("Mussoorie is famous for its waterfalls.");
	}
}

//Subclass Gulmarg
class Gulmarg extends HillStations {
	// Overriding the location method for Gulmarg
	public void location() {
		System.out.println("Gulmarg is in Jammu and Kashmir.");
	}

	// Overriding the famousFor method for Gulmarg
	public void famousFor() {
		System.out.println("Gulmarg is famous for skiing.");
	}
}

//Main class to test the program
public class HillStationDemo {
	public static void main(String[] args) {
		// Creating objects of subclasses using the parent class reference
		HillStations manali = new Manali();
		HillStations mussoorie = new Mussoorie();
		HillStations gulmarg = new Gulmarg();

		// Calling methods for Manali
		manali.location();
		manali.famousFor();

		// Calling methods for Mussoorie
		mussoorie.location();
		mussoorie.famousFor();

		// Calling methods for Gulmarg
		gulmarg.location();
		gulmarg.famousFor();
	}
}
/*OUTPUT
Manali is in Himachal Pradesh.
Manali is famous for snow and adventure sports.
Mussoorie is in Uttarakhand.
Mussoorie is famous for its waterfalls.
Gulmarg is in Jammu and Kashmir.
Gulmarg is famous for skiing.

*/
 