import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SalaryEmployee("Icy",2010,72000));
        employees.add(new PartTime("Mike",2017,18,14));
        employees.add(new FullTime("Michelle",2018,30,26));


    }
}