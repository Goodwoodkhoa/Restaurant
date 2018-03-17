import java.util.*;
import java.util.Scanner;
import java.io.IOException;

// Will read and take the order of the customer
public class Waiter {
    Scanner scanner;

		public Waiter() {
				scanner = new Scanner(System.in);
		}

		public void greetCustomers() {
				this.print("Welcome to Khoa's Kitchen!");
		}

		public int getPartySize() {
				this.print("How big is your party?");
				int party = Integer.parseInt(scanner.nextLine());
				this.print("Great! There is definitely a table for " + party);
				return party;
		}

		public String getCustomerName(int size, int currentNum) {
				if (currentNum == 0) { 
						this.print("Can I please get your name?");
				} else {
						this.print("alright, and who else?");
				}
				if (size == 1) this.print("*coughloser*cough");
				return scanner.nextLine();
		}

		public void readMenu(Menu menu) {
				this.print("Would you like to take a look at our selection?");
				if (scanner.nextLine().equalsIgnoreCase("yes")) {
						this.print(menu.toString());
				} else {
						this.print("Oh ok, that's fine!");
				}
		}

		public String findNextCustomer() {
				this.print("Whose order do I take first?");
				return scanner.nextLine();
		}

		public String takeOrderFor(String customerName) {
				this.print("Hi " + customerName + ", what would you like?");
				return scanner.nextLine();
		}

		public String takeOrderBecauseOfError(String orderName) {
				this.print(orderName + " doesn't appear to be on the menu. Can I get you something else or is that all?");
				return scanner.nextLine();
		}

		public String takeAdditionalOrders() {
				this.print("alright, anything else?");
				return scanner.nextLine();
		}

		public boolean isCustomerFinished(String orderName) {
				return orderName.matches("(done)|(that's all)|(no)");
		}

		public void readCustomersOrder(Customer customer) {
				this.print("Alright " + customer.getName() +  ", here is your receipt: ");
				this.print(customer.getOrders().toString());
		}

		public void readCustomersTotal(double total) {
				this.print("Your total is $" + Utils.formatPrice(total));
		}

		private void print(Object str) {
				System.out.println(str.toString());
		}
}