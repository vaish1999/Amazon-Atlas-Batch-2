import java.util.Scanner;
public class Task007{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
        int id = scanner.nextInt();
        System.out.println("password: ");
        String password = scanner.next();
        System.out.println("Hello \nYour login id is: "+id+"\nYour password is: **********");
        scanner.close();
        }
}