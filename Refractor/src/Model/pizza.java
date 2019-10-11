package Model;

public class Pizza extends Items {
    boolean isDeluxe;
    double howMuch;

    public Pizza(String name, double howMuch, boolean deluxe){
        super(name,howMuch);
        this.howMuch = howMuch;
        isDeluxe = deluxe;
    }

    //if the pizza is deluxe, add 3 bucks to the price
    @Override
    public double getHowMuch() {
        if (isDeluxe==true){
            howMuch+=3;
        }
        return howMuch;
    }

}
