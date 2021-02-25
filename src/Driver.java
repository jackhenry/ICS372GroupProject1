import java.util.Scanner;

/**
 * Driver class for running application. Contains main function.
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Write Code
		System.out.println("Running...");
		System.out.println("Done.");
		UserInterface();

		return;
	}

	public static void UserInterface() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to small co-op blah blah"); //fix introduction
		String menu = "Make a selection, enter: \n"
				+ "1) Enroll a member\n2) Remove a member\n3) Add a product\n"
				+ "4) Check out a member's items\n5) Process a shipment\n"
				+ "6) Change the price of a product\n7) Retrieve product info"
				+ "\n8) Retrieve member info\n9) Print transactions\n"
				+ "10) List all outstanding orders\n11) List all members with member info\n"
				+ "12) List all products with product info\n13) Save\n14) Help \n"
				+ "Press 0 at any time to quit the application";
		System.out.println(menu);
		boolean continueApplication = true;
		while( continueApplication ) {
			int userInput = scanner.nextInt();
			switch( userInput ) {
			case(0):
				System.exit(0);
			case (1):
				//enroll a member
				break;
			case(2):
				//remove a member
				break;
			case(3):
				//add a product
				break;
			case(4):
				//check out a members products
				break;
			case(5):
				//process a shipment
				break;
			case(6):
				//change product price
				break;
			case(7):
				//retrieve prod info
				break;
			case(8):
				//retrieve member info
				break;
			case(9):
				//print transactions
				break;
			case(10):
				//list outstanding orders
				break;
			case(11):
				//list member and member info
				break;
			case(12):
				//list prods and prod info
				break;
			case(13):
				//save
				break;
			case(14):
				System.out.println(menu);
			break;
			default:
				System.out.println("Invalid entry. Enter 14 for help");

			}
		}

	}

}