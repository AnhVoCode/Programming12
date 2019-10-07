package Model;

public class Pizza extends Items {
    boolean isDeluxe;

    public Pizza(String name, double howMuch, boolean delux){
        super(name,howMuch);
        isDeluxe = delux;
    }

    //if the pizza is deluxe, add 3 bucks to the price
    @Override
    public double getHowMuch() {
        if (isDeluxe=true){
            double price = getHowMuch()+3;
            return price;
        }

        return this.getHowMuch();
    }

}
