import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        List<Employee> list = new ArrayList<>();
        employees.add(new SalaryEmployee("Icy",2010,72000));
        employees.add(new PartTime("Mike",2017,18,14));
        employees.add(new FullTime("Michelle",2018,30,26));

        for(Employee e : employees){
            if (e instanceof SalaryEmployee){
                list.add(e);
                List<Employee> salaryEmployees = list.subList(0,list.size());
                System.out.println("Salary Employees: " + salaryEmployees);
                list.clear();
            }
            if(e instanceof PartTime){
                list.add(e);
                List<Employee> partTimes = list.subList(0,list.size());
                System.out.println("Part Time Employees: " + partTimes);
                list.clear();
            }
            if (e instanceof FullTime){
                list.add(e);
                List<Employee> fullTimes = list.subList(0,list.size());
                System.out.println("Full Time Employees: " + fullTimes);
            }
        }

    }
}