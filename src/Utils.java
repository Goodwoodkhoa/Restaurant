import java.util.*;

public class Utils {

		private Utils() {}

		public static Food find(List<Food> list, Food food) {
				for(Food f : list) {
						if (f.equals(food)) return f;
				}
				return null;
		}

		public static String formatPrice(double price) {
				return String.format("%.2f", price);
		}
}