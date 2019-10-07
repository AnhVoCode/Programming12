package Model;

public class Pasta extends Items {
    boolean isDeluxe;

    public Pasta(String name, double price, boolean deluxe){
        super(name, price);
        isDeluxe = deluxe;
    }

    //if the pasta is deluxe, add 2 bucks to the price
    @Override
    public double getHowMuch() {
        if(isDeluxe=true){
            double price = this.getHowMuch()+2;
            return price;
        }
        return this.getHowMuch();
    }
}
