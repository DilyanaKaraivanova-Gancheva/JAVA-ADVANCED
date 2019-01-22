import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Student {
    public String fNum;

    public String firstName;

    public String lastName;

    public String email;

    public Integer age;

    public Integer group;

    public ArrayList<Integer> grades;

    public int sum;

    public String phone;

    public Student(String facNum, String firstName, String lastName, String email, int age, int group, ArrayList<Integer> grades, String phone) {
    }

    public Student(String fNum, String firstName, String lastName, String email, int age, int group, ArrayList<Integer> grades, int sum, String phone) {
        this.fNum = fNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.group = group;
        this.grades = grades;
        this.phone = phone;
        this.sum = sum;

    }

    public String getfNum() {
        return fNum;
    }

    public void setfNum(String facNum) {
        this.fNum = facNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public int getSum(){
        return  sum;
    }

    public void setSum(ArrayList<Integer> grades){
        int totalSum = 0;
        for (Integer grade : grades) {
            totalSum += grade;
        }
        this.sum = totalSum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
