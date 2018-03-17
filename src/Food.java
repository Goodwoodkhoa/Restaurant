import java.util.*;

public class Food {
		protected String name;
		protected double price;

		public Food(String name, double price) {
				this.name = name;
				this.price = price;
		}

		public String getName() {
				return name;
		}

		public double getPrice() {
				return price;
		}

		@Override
		public boolean equals(Object o) {
				if (!(o instanceof Food)) return false;
				Food food = (Food) o;
				return food.name.equalsIgnoreCase(this.name) || food == this;
		}

		@Override
		public String toString() {
				return "\nName: " + name +
							 "\nPrice: $" + Utils.formatPrice(price) + "\n";
		}
}