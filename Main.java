import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student leader = new Student(1, "Vasyl", "Silchenko");
        Student student1 = new Student(2, "Sasha", "Vash");
        Student student2 = new Student(3, "Daria", "Ryabuha");

        Group group = new Group(leader);

        group.addStudent(student1);
        group.addStudent(student2);

        group.addTask("Learn Java");
        group.addTask("Write a new method");

        group.markTaskAsDone(student1, "Learn Java");

        group.changeLeader(student2);

        group.removeStudent(student1);

        group.renameStudent(student2, "Raya", "Tarasova");

        ArrayList<Student> students = group.getStudents();
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}