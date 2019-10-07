package UI;

import Model.Items;

import Tools.Restaurant;

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

    }


}
