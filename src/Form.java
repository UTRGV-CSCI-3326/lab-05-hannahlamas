import java.util.Scanner;

public class Form {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight (in lbs): ");
        double weight = scanner.nextDouble();

        System.out.print("Are you a smoker? (true/false): ");
        boolean isSmoker = scanner.nextBoolean();

        System.out.println("Medical Form");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + "lbs");
        System.out.println("Smoker: " + isSmoker);

    }
}
