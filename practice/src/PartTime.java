public class PartTime extends HourlyEmployee {
    //fields
    boolean hasBenefit;

    //Constructor
    public PartTime(String name, int hireYear, int hoursPerWeek, int hourlyWage) {
        super(name, hireYear, hoursPerWeek, hourlyWage);
    }

    //methods


    @Override
    double annualSalary() {
        return this.hourlyWage* this.hoursPerWeek*52;
    }

    @Override
    double monthSalary() {
        double annual =  this.hourlyWage* this.hoursPerWeek*52;
        return annual/12;
    }

    @Override
    boolean hasBenefits() {
        return this.hasBenefit;
    }
}
