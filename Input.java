import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("Number is: " + num);

        // String name = sc.nextLine();
        // System.out.println("Name: " + name);

        String fullName = sc.next(); //will return only first word
        System.out.println(fullName);
        sc.close();
    }
}
