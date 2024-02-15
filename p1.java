import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter father's name: ");
        String fathersName = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter section: ");
        char section = scanner.nextLine().charAt(0);

        System.out.print("Enter Department's name: ");
        String department = scanner.nextLine();

        System.out.print("Enter University's name: ");
        String university = scanner.nextLine();

        System.out.println("Student's Name: " + studentName);
        System.out.println("Father's Name: " + fathersName);
        System.out.println("Roll Number: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Department: " + department);
        System.out.println("University: " + university);

        scanner.close();

        switch (roll) {
            case 1:
                System.out.println("Economics");
                break;
            case 2:
                System.out.println("History");
                break;
            case 3:
                System.out.println("Computer Science");
                break;
            default:
                System.out.println("Invalid Department");
        }
    }
}
