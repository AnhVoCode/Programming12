public abstract class Employee {
    //fields
    String name;
    int hireYear;

    //Constructor
    Employee(){
        name = null;
        hireYear = 0;
    }
    Employee(String name, int hireYear){
        this.name = name;
        this.hireYear = hireYear;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getHireYear() {
        return hireYear;
    }

    //Methods

    @Override
    public String toString() {
        return "Name: "+name + "\tHire Year: "+ hireYear;
    }

    abstract double annualSalary();

    abstract double monthSalary();
}
