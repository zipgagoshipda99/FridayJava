package Question26;

public class Person {
    String name;
    int age;


    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void introduce(){
        System.out.println("안녕하세요 저는" + this.name + "이고" + this.age +"살");
    }
}
