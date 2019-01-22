import java.io.*;

public class SerializeCustomObject {
    private static class Course implements Serializable {

        String name;
        Integer numberOfStudents;

        Course(String _name, int numsOfStudents){
            this.name = _name;
            this.numberOfStudents = numsOfStudents;
        }

        private int getSize(){
            return this.numberOfStudents;
        }

        private String getName(){
            return this.name;
        }
    }

    public static void main(String[] args) {

        Course javaAdvanced = new Course("JavaAdvanced", 6);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\course.ser"))){
            oos.writeObject(javaAdvanced);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\course.ser"))) {
            Course softUniBestCourse = (Course) ois.readObject();
            System.out.println(softUniBestCourse.getName());
            System.out.println(softUniBestCourse.getSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
