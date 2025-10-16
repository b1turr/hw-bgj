public class salaryTest {
    public static void main(String[] args) {
    salary marksyearSalary = new salary(); // creating object for annual salary and its method
    marksyearSalary.monthlySalary = 30000; // declaration of monthly salary
    marksyearSalary.math = marksyearSalary.monthlySalary*12; // total salary information to math variable

    int totalyearmark = marksyearSalary.getYearlySalary(marksyearSalary.math);
        System.out.println("Mark's total annual salary is: " + totalyearmark);

    salary marksdoubleSalary = new salary(); // creating object for double salary and its method
    marksdoubleSalary.monthlySalary = 30000; // declaration of monthly salary
    marksyearSalary.math = marksdoubleSalary.monthlySalary*2; // double salary declaration to math
    int doublemark = marksdoubleSalary.getDoubleSalary(marksyearSalary.math);
        System.out.println("Mark's double salary is: " + doublemark);


    }
}
