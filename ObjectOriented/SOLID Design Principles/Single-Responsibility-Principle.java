/*
S stands for Single Responsibility Principle. 
A class should have one and only one responsibility and reason to change.
This not only helps maintainabilty by only having to change one class,
it also helps with abstraction and hides access that is illegal. 
Try and use a system that combines cohesion and coupling.
We want a high cohesion between classes meaning a focused goal between them
But yet loose coupling allowing for better maintainability and security.
*/
class SingleResponsibilityPrinciple {
    
    public static void main(String[] args) {
        Customer newCustomer = new Customer("Bruce Wayne");
        Order order = new Order(newCustomer);
        order.placeOrder("hot dog");

    }
}
class Customer {
    private String customer;
    public Customer(String customer) {
        this.customer = customer;
    }
    public String getCustomer() {
        return this.customer;
    }
}
class Order {
    private Customer customer;
    public Order(Customer customer) {
        this.customer = customer;
    }
    public void placeOrder(String order) {
        System.out.println(String.format("%s bought %s", customer.getCustomer(), order));
    }
}