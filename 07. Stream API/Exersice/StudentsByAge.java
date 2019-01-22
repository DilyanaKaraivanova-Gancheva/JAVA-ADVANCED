import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentsByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Student> students = new ArrayList<>();

        while (!"end".equalsIgnoreCase(input[0])){
            String facNum = input[0];
            String firstName = input[1];
            String lastName = input[2];
            String email = input[3];
            int age = Integer.parseInt(input[4]);
            int group = Integer.parseInt(input[5]);
            ArrayList<Integer> grades = new ArrayList<>();
            grades.add(Integer.parseInt(input[6]));
            grades.add(Integer.parseInt(input[7]));
            grades.add(Integer.parseInt(input[8]));
            grades.add(Integer.parseInt(input[9]));
            String phone  = input[10];
            Student current = new Student(facNum, firstName, lastName, email, age, group, grades, phone);
            students.add(current);
            input = scanner.nextLine().split("\\s+");
        }

        List<Student> filtered = students.stream().filter(s-> s.age>= 18 && s.age<=24).collect(Collectors.toList());

        for (Student student : filtered) {
            System.out.println(student.firstName + " " + student.lastName + " " + student.age);
        }
    }
}
