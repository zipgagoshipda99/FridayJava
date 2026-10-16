package Question30;
public class StudentMain {
    public static void main(String[] args) {
        Student chaewon = new Student("chaewon", 90);
        Student Chaewoojoo = new Student("Chaewoojoo", 99);
        Student chaeyun = new Student("chaeyun", 100);
        Student[] students = {chaewon, Chaewoojoo, chaeyun};
        int total = 0;
        double average = 0;
        for (Student student : students) {
            total += student.score;
        }
        average  = ((double)total / students.length);
        System.out.println("DIGITECH AVERAGE BRAIN CELL: " + Math.round(average));
    }
}
