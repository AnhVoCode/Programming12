package Model;

public class Pasta extends Items {
    boolean isDeluxe;

    public Pasta(String name, double price, boolean deluxe){
        super(name, price);
        isDeluxe = deluxe;
    }

    //if deluxe add 2 bucks
    @Override
    public double getHowMuch() {
        if(isDeluxe=true){
            double price = this.getHowMuch()+3;
            return price;
        }
        return this.getHowMuch();
    }
}
