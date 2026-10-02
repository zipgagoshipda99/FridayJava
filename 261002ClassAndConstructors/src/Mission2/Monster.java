package Mission2;

public class Monster {
    String name;
    String introduction;
    int hp;
    int attackPower;
    //생성자 : 맴버 변수 초기화
    //⚠️생성자 메소드 이름은 반드시 클래스 이름과 동일
    Monster(String name,  String indroduction, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.introduction = indroduction;
    }
}
