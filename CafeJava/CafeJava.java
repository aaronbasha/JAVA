
public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String displayUpdatedTotal = "Your new updated total is";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double espressoPrice = 2.5;
        double dripCoffeePrice = 2.0;
        double lattlePrice = 6.0;
        double cappuccinoPrice = 5.0;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:

        // Cindy
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(readyMessage + customer1);
        // ** Your customer interaction print statements will go here ** //

        // Noah
        if (isReadyOrder4) {
            System.out.println(readyMessage + customer4 + displayTotalMessage + cappuccinoPrice);
        }

        // Sam
        System.out.println(customer2 + displayTotalMessage + lattlePrice * 2);
        if (isReadyOrder2) {
            System.out.println(pendingMessage);
        }
        
        // Jimmy
        System.out.println(customer3 + displayTotalMessage + (lattlePrice - dripCoffeePrice));

    }
}
