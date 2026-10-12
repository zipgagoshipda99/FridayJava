public class Student {
    String name;
    int score;

    Student(String _name, int _score) {
        name = _name;
        score = _score;
        // 필드 이름(name)과 매개변수 이름(_name)이 서로 다르면 this 없이도 컴퓨터가 둘을 명확하게 구분할 수 있기 때문에 정상적으로 초기화됨
    }

    public String getGrade() {
        if (score >= 80)
            return "A";
        if (score >= 70)
            return "B";
        if (score >= 60)
            return "C";
        else
            return "D";
    }

}
