public class StudentMain {
    public static void main(String[] args) {
        Student Cassidy = new Student("채윤", 76);
        Cassidy.getGrade();
        System.out.println(Cassidy.name + " : " + Cassidy.getGrade());
    }
}
