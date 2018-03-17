import java.util.*;
import java.util.Scanner;
import java.io.IOException;

public class Restaurant {
    public static void main(String[] args) {
        int partySize;
        Waiter waiter = new Waiter();
        Menu menu = new Menu();
        List<Customer> customers = new ArrayList<>();
        Register.getInstance()          // Instantiates the register
                .setTaxRate(1.0875);

        waiter.greetCustomers();
        partySize = waiter.getPartySize();

        for (int i = 0; i < partySize; i++) {
            String customerName = waiter.getCustomerName(partySize, i);
            Customer customer = new Customer(customerName);
            customers.add(customer);
        }

        waiter.readMenu(menu);

        for (Customer c : customers) {
            String orderName = waiter.takeOrderFor(c.getName());

            outer: do {
                 while (!menu.isOrderValid(orderName)) {
                    if (waiter.isCustomerFinished(orderName)) {
                        break outer;
                    }
                    orderName = waiter.takeOrderBecauseOfError(orderName);
                }

                c.addOrder(menu.getFood(orderName));
                orderName = waiter.takeAdditionalOrders();
            } while(!waiter.isCustomerFinished(orderName));

            waiter.readCustomersOrder(c);
            waiter.readCustomersTotal(Register.getInstance()
                                        .calculateTotal(c.getOrders()));
        }
    }
}