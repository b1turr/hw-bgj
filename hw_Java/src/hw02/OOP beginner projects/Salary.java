package hw02.OOP.projects;

public class Salary {
    int monthlySalary;
    public salary(int initialMonthlySalary) { // we haven't covered this part, but I have to use it for hooking the input just in time
        this.monthlySalary = initialMonthlySalary;
    }
    
    public int getYearlySalary(){ // first object method for yearly salary
        return monthlySalary*12;
    }

    public int getDoubleSalary(){ // second object method for double salary
        return monthlySalary*2;

    }
}


