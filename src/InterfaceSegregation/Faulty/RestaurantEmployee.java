package InterfaceSegregation.Faulty;

/*
    Interface should be such that client should not implement
    unnecessary functions
*/
public interface RestaurantEmployee {
    void washDishes();
    void serveCustomers();
    void cookFood();
}
