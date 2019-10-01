public class SalaryEmployee extends Employee {
    //fields
    int annualSalary;
    boolean hasBenefits;

    //constructor
    public SalaryEmployee(String name, int hireYear, int annualSalary) {
        super(name, hireYear);
        this.annualSalary = annualSalary;
    }

    //methods


    @Override
    double annualSalary() {
        return this.annualSalary;
    }

    @Override
    double monthSalary() {
        return this.annualSalary/12;
    }
}
