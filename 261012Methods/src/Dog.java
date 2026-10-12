public class Dog {
    //필드(맴버 변수, 속성 ) 생성자(필드 초기화, 클래스 이름과 동일, 반환 타입 없음)
    public String name; 
    public String breed;
    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public void bark(){
        System.out.println("멍멍 짖는다.");
    }
    public void eat(String food){
        System.out.println(food + " 를 냠냠 먹는다.");
    }
}
