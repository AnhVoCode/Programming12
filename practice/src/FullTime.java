public class FullTime extends HourlyEmployee {
    //fields
    boolean hasBenefits;

    //Constructor
    public FullTime(String name, int hireYear, int hoursPerWeek, int hourlyWage) {
        super(name, hireYear, hoursPerWeek, hourlyWage);
    }

    //Methods

    @Override
    boolean hasBenefits() {
        return hasBenefits;
    }

    @Override
    double annualSalary() {
        return this.hourlyWage * this.hoursPerWeek * 52;
    }

    @Override
    double monthSalary() {
        double annual =  this.hourlyWage * this.hoursPerWeek * 52;
        return annual/12;
    }
}
