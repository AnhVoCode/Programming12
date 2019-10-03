package UI;

import Model.Items;
import Model.Pizza;
import Tools.MainThing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MainThing dinner = new MainThing("dinner");
        dinner.startStuff();
        ArrayList<Items> a = dinner.getInvent();
        for(Items i: a){
            System.out.println(i);
        }
        //MainThing main = new MainThing();
        //Try sample orders

    }
}
