package hw02.OOP.projects;

public class salary {
    int monthlySalary;
    public salary(int initialMonthlySalary) { // I don't get this part maybe hooking new monthly salary as input
        this.monthlySalary = initialMonthlySalary;
    }
    
    public int getYearlySalary(){ // first object method for yearly salary
        return monthlySalary*12;
    }

    public int getDoubleSalary(){ // second object method for double salary
        return monthlySalary*2;

    }
}

