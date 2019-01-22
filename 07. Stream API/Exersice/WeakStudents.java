import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WeakStudents {
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

        Predicate<ArrayList<Integer>> twoWeakGrades = integers -> {
            int count = 2;
            for (int grade : integers) {
                if (grade <= 3){
                    count--;
                }
            }
            return count <= 0;
        };
        List<Student> weakStudents = students.stream()
                .filter(student -> twoWeakGrades.test(student.grades)).collect(Collectors.toList());

        for (Student student : weakStudents) {
            List<Integer> sortedGrades = student.grades.stream().sorted().collect(Collectors.toList());
            System.out.println(student.firstName + " " + student.lastName + " "
                    + sortedGrades.toString().replaceAll("[\\[,\\]]",""));
        }
    }
}
