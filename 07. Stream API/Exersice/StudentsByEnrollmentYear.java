import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentsByEnrollmentYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Student> students = new ArrayList<>();

        while (!"end".equalsIgnoreCase(input[0])) {
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
            String phone = input[10];
            Student current = new Student(facNum, firstName, lastName, email, age, group, grades, phone);
            students.add(current);
            input = scanner.nextLine().split("\\s+");
        }

        int year = 11;

        for (int i = 0; i < 9; i++) {
            int finalYear = year;
            List<Student> filter = students.stream().filter(s -> s.getfNum().endsWith(String.valueOf(finalYear)))
                    .collect(Collectors.toList());
            filter.sort(Comparator.comparing(Student::getFirstName)
                    .thenComparing((a,b) -> a.getLastName().compareTo(b.getLastName())));
            System.out.println("20" + String.valueOf(year)+":");
            for (Student student : filter) {
                System.out.println("-- " + student.firstName + " " + student.lastName);
            }
            year++;
        }

    }
}
