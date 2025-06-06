import java.util.Scanner;

public class Task020 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        char[] name = scanner.nextLine().toCharArray();
        System.out.println("Hello "+new String(name)+"!");
        int n = name.length;
        System.out.println("There are "+n+" letters in your name");
        System.out.println("Displaying all letters in your name");
        for (int i =0;i<n;i++){
            System.out.println(name[i]);
        }
    }
}
