public enum Market {
    Food("pasta",9.68),
    Alcohol("beer", 32.1),
    DairyFood("cashew milk", 5.5),
    Pastry("bread",5.90);

    private final String name;
    private final double price;

    Market(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    private final double tax = 0.05;

    public double totalPrice(Market product){
        return product.price+ product.price*tax;
    }
}
