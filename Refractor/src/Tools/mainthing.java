package Tools;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;


import java.util.ArrayList;


public class MainThing {
    private String name;
    private ArrayList<Customer> ppl = new ArrayList<>();
    private ArrayList<Order> ordds = new ArrayList<>();
    private ArrayList<Items> invent = new ArrayList<>();

    public MainThing(String name){
        this.name = name;
        startStuff();
    }

    public ArrayList<Items> getInvent() {
        return invent;
    }

    public void startStuff(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }

    private void makePizza() {
        invent.add(new Pizza("vegan",13.75,true));
    }
    private void makePasta(){
        invent.add(new Pasta("beef spaghetti",18.79,false));
    }
    private void makeSandwich(){
        invent.add(new Sandwich("silica", Sandwich.Size.LARGE));
    }
}
