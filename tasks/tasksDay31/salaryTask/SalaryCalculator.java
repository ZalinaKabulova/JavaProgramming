package tasksDay31.salaryTask;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHour;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHour) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;// to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate/100;// to make sure that user does not need to convert the percentage to decimal
        this.weeklyHour = weeklyHour;
    }

    public double salary(){                    // calculates the salary ( hourlyRate * weeklyHour * 52)
        return weeklyHour * hourlyRate * 52;
    }

    public double stateTax() {                //calculates the totalStateTax
        return salary() * stateTaxRate;
    }


    public double federalTax() {               //calculates the total federal tax
    return  salary() * federalTaxRate;
    }


    public double salaryAfterTax() {           // calculates the salary after tax

        return salary() - federalTax() - stateTax();
    }
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHour=" + weeklyHour +
                ", state Tax = $" + stateTax() +
                ", federal Tax = $" + federalTax() +
                ", salary after tax = $" + salaryAfterTax() +
                ", Salary = $" + salary() +
                '}';
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object


 */