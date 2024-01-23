package InterfaceSegregation.Faulty;

/*
    Here, unnecessarily the Waiter function has to implement washDishes
    and cookFood methods even though its not the waiter's job.
    So, we need to segregate interface into role specific interfaces
*/
public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        // valid job
    }

    @Override
    public void cookFood() {
        // not my job
    }
}
