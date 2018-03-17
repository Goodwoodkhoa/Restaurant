import java.util.*;

public class Menu {
    public static double items(String type) {

        ArrayList<String> appetizers = new ArrayList<>();
        appetizers.add("salad");
        appetizers.add("bread sticks");
        appetizers.add("toast");

        ArrayList<String> entres = new ArrayList<>();
        entres.add("waffles");
        entres.add("steak and eggs");
        entres.add("chicken and grits");
        entres.add("spaghetti and meatballs");

        ArrayList<String> desserts = new ArrayList<>();
        desserts.add("ice cream");
        desserts.add("molten lava cake");
        desserts.add("this dick");

        HashMap<String, Double> appetizer_prices = new HashMap<String, Double>();
        appetizer_prices.put(appetizers.get(0), 5.50);
        appetizer_prices.put(appetizers.get(1), 4.00);
        appetizer_prices.put(appetizers.get(2), 3.20);

        HashMap<String, Double> entres_prices = new HashMap<String, Double>();
        entres_prices.put(entres.get(0), 9.00);
        entres_prices.put(entres.get(1), 8.00);
        entres_prices.put(entres.get(2), 8.50);
        entres_prices.put(entres.get(3), 10.50);

        HashMap<String, Double> dessert_prices = new HashMap<String, Double>();
        dessert_prices.put(desserts.get(0), 6.50);
        dessert_prices.put(desserts.get(1), 8.50);
        dessert_prices.put(desserts.get(2), 6.90);

        HashMap<String, Double> all_prices = new HashMap<String, Double>();
        all_prices.putAll(appetizer_prices);
        all_prices.putAll(entres_prices);
        all_prices.putAll(dessert_prices);


        if (type.equals("Appetizers")) {
            for (String appetizer_prices_listed : appetizer_prices.keySet()) {
                System.out.println(" - " + appetizer_prices_listed + " ($" + appetizer_prices.get(appetizer_prices_listed) + ")");
            }
        } else if (type.equals("Entres")) {
            for (String entre_prices_listed : entres_prices.keySet()) {
                System.out.println(" - " + entre_prices_listed + " ($" + entres_prices.get(entre_prices_listed) + ")");
            }
        } else if (type.equals("Desserts")) {
            for (String dessert_prices_listed : dessert_prices.keySet()) {
                System.out.println(" - " + dessert_prices_listed + " ($" + dessert_prices.get(dessert_prices_listed) + ")");
            }
        } else if (all_prices.containsKey(type)) {
            System.out.println("Ok, the " + type);
            System.out.println("Anything else?");
            double b = all_prices.get(type);
            return b;
        }
        double c = 0;
        return c;
    }

}