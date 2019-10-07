package UI;

import Model.Items;

import Model.Pizza;
import Tools.Order;
import Tools.Restaurant;
import Tools.Time.Hour;
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

        //Try sample orders
        ArrayList<Items> pizza = new ArrayList<>();
        pizza.add(new Pizza("Vegan",13.90,false));

    }


}
