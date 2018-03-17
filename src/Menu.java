import java.util.*;

public class Menu {
    protected List<Food> appetizers;
    protected List<Food> entrees;
    protected List<Food> desserts;

    // Default Menu object
    public Menu() {
        createDefaultAppetizers();
        createDefaultEntrees();
        createDefaultDesserts();
    }

    public Menu(List<Food> appetizers, List<Food> entrees, List<Food> desserts) {
        this.appetizers = appetizers;
        this.entrees = entrees;
        this.desserts = desserts;
    }

    public List<Food> getAppetizersNames() {
        return appetizers;
    }

    public List<Food> getEntreesNames() {
        return entrees;
    }

    public List<Food> getDessertsNames() {
        return desserts;
    }

    public void addAppetizers(Food appetizer) {
        if (appetizers != null) {
            appetizers.add(appetizer);
        }
    }

    public void addEntrees(Food entree) {
        if (entrees != null) {
            entrees.add(entree);
        }
    }

    public void addDesserts(Food dessert) {
        if (desserts != null) {
            desserts.add(dessert);
        }
    }        

    public double getPrice(Food food) {
        Food foundFood = getFood(food.getName());
        return foundFood != null ? foundFood.getPrice() : 0.0;
    }

    public Food getFood(String name) {
        if (isOrderValid(name)) {
            Food food = new Food(name, 0.0); // This is bad coding, soz

            if (appetizers.contains(food)) {
                return Utils.find(appetizers, food);
            } else if (entrees.contains(food)) {
                return Utils.find(entrees, food);
            } else if (desserts.contains(food)) {
                return Utils.find(desserts, food);
            }
        }
        return null;
    }

    public boolean isOrderValid(String name) {
        Food food = new Food(name, 0.0);
        return appetizers.contains(food) || entrees.contains(food) || desserts.contains(food);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----- Appetizers -----");
        sb.append(appetizers.toString().substring(1, appetizers.toString().length()));
        sb.setLength(sb.length() - 1);
        sb.append("\n------- Entrees -------");
        sb.append(entrees.toString().substring(1, entrees.toString().length()));
        sb.setLength(sb.length() - 1);
        sb.append("\n------ Desserts ------");
        sb.append(desserts.toString().substring(1, desserts.toString().length()));
        sb.setLength(sb.length() - 1);
        sb.append("\n");
        return sb.toString();
    }

    private void createDefaultAppetizers() {
        appetizers = new ArrayList<>();
        appetizers.add(new Food("salad", 5.5));
        appetizers.add(new Food("bread sticks", 4.0));
        appetizers.add(new Food("toast", 3.2));
    }

    private void createDefaultEntrees() {
        entrees = new ArrayList<>();
        entrees.add(new Food("waffles", 9.0));
        entrees.add(new Food("steak and eggs", 8.0));
        entrees.add(new Food("chicken and grits", 8.5));
        entrees.add(new Food("spaghetti and meatballs", 10.5));
    }

    private void createDefaultDesserts() {
        desserts = new ArrayList<>();
        desserts.add(new Food("ice cream", 6.5));
        desserts.add(new Food("molten lava cake", 8.5));
        desserts.add(new Food("this dick", 6.9));
    }
}