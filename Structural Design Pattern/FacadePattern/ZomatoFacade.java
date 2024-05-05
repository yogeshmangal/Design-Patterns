public class ZomatoFacade {
    private Delivery delivery;
    private Restaurant restaurant;
    private Zomato zomato;

    public ZomatoFacade() {
        delivery = new Delivery();
        restaurant = new Restaurant();
        zomato = new Zomato();
    }

    public void placeOrder() {
        zomato.orderPlaced();
        restaurant.prepareOrder();
        delivery.assignDeliveryBoy();
    }
}
