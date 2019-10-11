package UI;

import Model.Items;
import Model.Pizza;
import Tools.Order;
import Tools.Restaurant;
import Tools.Time.Hour;
import Tools.Time.Minute;
import Tools.Time.Second;
import Tools.Time.Time;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Try Restaurants' creating stuff method
        Restaurant dinner = new Restaurant("dinner");
        dinner.startStuff();
        ArrayList<Items> a = dinner.getInvent();
        for(Items i: a){
            System.out.println(i.getName());
        }
        System.out.println("----------------------------------------------------");
        //Try sample orders
        //Pizza
        ArrayList<Items> pizza = new ArrayList<>();
        pizza.add(new Pizza("Vegan",13.90,false));
        pizza.add(new Pizza("Hawaii",14.30,true));

        //Checking the time making the items start: 8:40:00
        Time timeOrder = new Time(new Hour(8),new Minute(40),new Second(0));

        // Got 10 more minutes to make because of not being in the inventory, => end: 9:10:00
        Order orderPizza = new Order(pizza,timeOrder,false);
        System.out.println("Time end: " + orderPizza.getEnd());

        //Find the total price: 13.9+(14.30+3)=31.2$
        System.out.println("Total price: " + orderPizza.getTotalPrice(pizza));




    }


}
