import java.util.ArrayList;

public class CafeUtil {

public int getStreakGoal() {
    int sum = 1;
    for(int i = 2; i <= 10; i++) {
        sum += i;
    }
    return sum;
}

public double getOrderTotal(double[] prices) {
    double orderTotal = 0;
    for (double price : prices) {
        orderTotal += price;
    }
    return orderTotal;
}

public void displayMenu(ArrayList<String> menuItems) {
    for (int i = 0; i < menuItems.size(); i++){
        System.out.printf("%o %s\n", i, menuItems.get(i));
    }
    System.out.println("");
}

public void addCustomer(ArrayList<String> customers){
    System.out.println("Please Enter Your Name");
    String userName = System.console().readLine();
    System.out.println("Hello " + userName + " !");
    System.out.println("There Are" + customers.size() + "People Infront Of You");
    customers.add(userName);
    System.out.println(customers);
}



}