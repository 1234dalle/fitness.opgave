import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Administration("Claus", "12345-1234", 4));
        employeeList.add(new Instructor("Claus", "12345-1234", 4));
        employeeList.add(new Administration("Claus", "12345-1234", 4));
        employeeList.add(new Administration("Claus", "12345-1234", 4));
        employeeList.add(new Instructor("Claus", "12345-1234", 4));
        printFitnessEmployees(employeeList);


        }
    public static void printFitnessEmployees(List<Employee> list) {
        System.out.println("FITNESS EMPLOYEE");
        System.out.println("\nNAME\tCPR\t\t  HOURS\t    SALARY\tVACATION");
        System.out.println("**********************************************************");

        for(Employee employee : list){
            System.out.println(employee);
        }
        System.out.println("\n" + "======================================================");
    }

}
