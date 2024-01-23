package InterfaceSegregation.Corrected;

// since we have segregated the
public class waiter implements WaiterInterface{
    @Override
    public void serveCustomers() {
        System.out.println("serves the customers");
    }

    @Override
    public void takeOrders() {
        System.out.println("takes orders");
    }
}
