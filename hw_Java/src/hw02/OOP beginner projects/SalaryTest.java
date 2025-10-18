package hw02.OOP.projects;

public class SalaryTest {
    public static void main(String[] args) {
        salary marksSalary = new salary(3000);
        int result_year = marksSalary.getYearlySalary();
        System.out.println("Mark's annual salary: " + result_year);
        int result_double = marksSalary.getDoubleSalary();
        System.out.println("Mark's double salary: " + result_double);
    }
}


