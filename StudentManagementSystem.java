import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    int rollnumber;
    double grade;

    public Student(String name, int age,int rollnumbet,double grade ) {
        this.name = name;
        this.age = age;
        this.rollnumber=rollnumber;
        this.grade=grade;
        
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                     System.out.print("Enter student rollnumber: ");
                    int rollnumber = scanner.nextInt();
                     System.out.print("Enter student grade: ");
                    double grade = scanner.nextDouble();
                    studentList.add(new Student(name, age,rollnumber,grade));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("List of students:");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(i + ". Name: " + studentList.get(i).name + ", Age: " + studentList.get(i).age+"rollnumber:"+studentList.get(i).rollnumber+"grade"+studentList.get(i).grade);
                        
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of the student to remove: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < studentList.size()) {
                        studentList.remove(index);
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Invalid index. Please enter a valid index.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}