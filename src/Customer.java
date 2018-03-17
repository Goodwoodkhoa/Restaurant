import java.util.*;

public class Customer {
		protected String name;
		protected List<Food> orders;

		protected Customer(String name) {
				this.name = name;
				orders = new ArrayList<>();
		}

		public List<Food> getOrders() {
				return orders;
		}

		public String getName() {
				return name;
		}

		public void addOrder(Food order) {
				orders.add(order);
		}
}