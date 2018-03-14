import java.util.*;
import java.util.Scanner;
import java.io.IOException;

public class Restaurant {
    public static void main(String[] args) {
        String answer, order, guest1, guest2, type;
        Register.calculator(1, 2, "add");
        double total = 0;
        double b =0;

        int party;
        Scanner myScan = new Scanner(System.in);

        System.out.println("Wellcome to Khoa's Kitchen!\n" + "How big is your party?");
        party = myScan.nextInt();
        System.out.println("\nGreat! There is definitely a table for " + party);

        if (party == 1) {
            System.out.println("Can I please get your name? *coughloser*cough ");
        } else {
            System.out.println("Can I please get all of your names?");
        }


        ArrayList<String> GuestList = new ArrayList<String>();
        for (int i = 0; i < (party + 1); ++i) {
            guest1 = myScan.nextLine();
            GuestList.add(guest1);
        }


        System.out.println("Would you like to take a look at our selection?");
        answer = myScan.next();

        if (answer.equals("Yes")) {

            System.out.println("\nAppetizers:");
            Menu.items("Appetizers");

            System.out.println("\nEntres:");
            Menu.items("Entres");

            System.out.println("\nDesserts:");
            Menu.items("Desserts");

        } else if (answer.equals("No")) {

            System.out.println("Oh ok, that's fine!\n");
        }
        System.out.println("\nNow who's name should I put down for the first order?");
        guest2 = myScan.next();


        for (int i = 0; i < (party); i++) {
            System.out.println("\nHi " + guest2 + ", what would you like?");
            type = myScan.nextLine();
            HashMap<String, Double> receipt = new HashMap<String, Double>();

            while (!type.equals("That's all.")) {
                type = myScan.nextLine();
                b = Menu.items(type);

               // total = Register.calculator(total,b,"add");
                total = total+b;
                //receipt.put() //Add items onto list to print all orders!

                //type = myScan.nextLine();
                //System.out.print(total);
            }
        //System.out.println("Here's what you ordered" + );
        System.out.println("Your total is " + total);
        System.out.println("Who would like to go next?");
        guest2 = myScan.nextLine();

        }

    }
}



