import java.util.Scanner;
public class Task012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your loginid: ");
        String loginid = scanner.nextLine();
        System.out.print("Enter your password: ");
        String pwd = scanner.nextLine();
        int count = 0;
        while (loginid.equals("Vaishakh") && pwd.equals("12345")){
            System.out.println("You have logged in for "+ ++count +" times");
            System.out.print("Enter your loginid: ");
            loginid = scanner.nextLine();
            System.out.print("Enter your password: ");
            pwd = scanner.nextLine();
        }
        System.out.println("Wrong loginid or password");
    }
}
