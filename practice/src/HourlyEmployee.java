public abstract class HourlyEmployee extends Employee {
    //fields
    double hoursPerWeek;
    double hourlyWage;
    boolean hasBenefits;

    //Constructors
    HourlyEmployee(){
        hourlyWage = 0;
        hoursPerWeek = 0;
    }
    //Methods
    public HourlyEmployee(String name, int hireYear, double hoursPerWeek, double hourlyWage) {
        super(name, hireYear);
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyWage = hourlyWage;
    }

    abstract boolean hasBenefits();

}
