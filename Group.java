import java.util.ArrayList;
public class Group {
    private Student leader;
    private ArrayList<Student> students;
    private ArrayList<String> tasks;
    public Group(Student leader) {
        this.leader = leader;
        students = new ArrayList<>();
        tasks = new ArrayList<>();
        students.add(leader);
    }
    public void changeLeader(Student newLeader) {leader = newLeader;}
    public void addStudent(Student student) {students.add(student);}
    public void removeStudent(Student student) {
        if (student.equals(leader)) {
            System.out.println("Sorry, you can't remove student that is the leader of the group!");
        } else {
            students.remove(student);
        }
    }
    public void renameStudent(Student student, String firstName, String lastName) {
        student.setFirstName(firstName);
        student.setLastName(lastName);
    }
    public void addTask(String task) {tasks.add(task);}
    public void markTaskAsDone(Student student, String task) {
        int index = tasks.indexOf(task);
        if (index != -1) {
            int studentIndex = students.indexOf(student);
            if (studentIndex != -1) {
                tasks.set(index, tasks.get(index) + " (done by " + student.getFirstName() + student.getLastName() + ")");
            }
        }
    }
    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }
}