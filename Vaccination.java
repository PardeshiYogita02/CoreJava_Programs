/*1.Create abstract class vaccine.Create two variables age(int),nationality(String).create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take the first dose if the user is Indian and age is 18.After vaccination the user has to pay 250rs(which will be displayed on the console). Scenario 2: Users are eligible to take the second dose only after completing the first dose. Scenario 3: create abstract method boosterDose() in abstract class Vaccine.Create one implementation class vaccinationSuccessful, where implement boosterDose() method. Create main class vaccination and invoke all methods accordingly. [Hint:Create constructor to initialize variables age and nationality,Use flow control(Ifelse) to check condition]*/

package Java_Internship;

//Abstract class Vaccine
abstract class Vaccine {
	int age;
	String nationality;
	boolean firstDoseTaken = false;

	// Constructor
	public Vaccine(int age, String nationality) {
		this.age = age;
		this.nationality = nationality;
	}

	// Method for the first dose
	public void firstDose() {
		if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
			System.out.println("First dose successful. Pay 250 Rs.");
			firstDoseTaken = true;
		} else {
			System.out.println("Not eligible for the first dose.");
		}
	}

	// Method for the second dose
	public void secondDose() {
		if (firstDoseTaken) {
			System.out.println("Second dose successful.");
		} else {
			System.out.println("Complete the first dose first.");
		}
	}

	// Abstract method for booster dose
	public abstract void boosterDose();
}

//Concrete class
class VaccinationSuccessful extends Vaccine {

	public VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
	}

	// Implementing boosterDose method
	@Override
	public void boosterDose() {
		if (firstDoseTaken) {
			System.out.println("Booster dose successful.");
		} else {
			System.out.println("Complete first and second doses before the booster dose.");
		}
	}
}

//Main class
public class Vaccination {
	public static void main(String[] args) {
		// Creating an object
		VaccinationSuccessful person = new VaccinationSuccessful(25, "Indian");

		// Calling methods
		person.firstDose();
		person.secondDose();
		person.boosterDose();
	}
}

/* OUTPUT
First dose successful. Pay 250 Rs.
Second dose successful.
Booster dose successful.
*/
 