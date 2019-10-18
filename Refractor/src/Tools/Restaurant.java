package Tools;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;
import java.util.ArrayList;


public class Restaurant {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Items> invent = new ArrayList<>();

    public Restaurant(String name){
        this.name = name;
        makingFood();
    }

    public ArrayList<Items> getInvent() {
        return invent;
    }

    public void makingFood(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }
    public void receiveOrder(Order order){
        orders.add(order);
    }
    
    public void customers(Customer c){
        customers.add(c);
    }

    private void makePizza() {
        invent.add(new Pizza("vegan",13.75,true));
    }
    private void makePasta(){
        invent.add(new Pasta("beef spaghetti",18.79,false));
    }
    private void makeSandwich(){
        invent.add(new Sandwich("beef", Sandwich.Size.LARGE));
    }
}
