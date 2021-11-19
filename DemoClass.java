package program;
import java.util.Scanner;
public class DemoClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MemberFactory staffFactory = new MemberFactory();
        System.out.println("Enter the name of member: ");
        String staffName = input.nextLine();
        Staff s = staffFactory.getStaff(staffName);
        System.out.println("The staff is " + staffName);
        System.out.println("Salary: " + s.getSalary());
        System.out.println("Salary: " + s.getYearsOfWork());
    }
    
}
