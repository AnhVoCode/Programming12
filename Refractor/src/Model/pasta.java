package Model;

public class Pasta extends Items {
    boolean isDeluxe;
    double price;

    public Pasta(String name, double price, boolean deluxe){
        super(name, price);
        this.price = price;
        isDeluxe = deluxe;
    }

    //if the pasta is deluxe, add 2 bucks to the price
    @Override
    public double getHowMuch() {
        if(isDeluxe==true){
            price+=2;
        }
        return price;
    }
}
