package Level1to3;

public class MonsterMain {
    public static void main(String[] args) {
        Monster slime = new Monster("슬라임", 30, 5);
        Monster thanos = new Monster("타노수", 7, 67);
        slime.attack(thanos); 
        Monster.PrintStatus(thanos);
        thanos.heal(2);
        Monster.PrintStatus(thanos);
        thanos.heal(20);
        // hp 0 으로 출력
        // System.out.println(thanos.getName() + "의 hp : " + thanos.getHp());
        // get 메소드로 private 객체에 멤버 변수 접근
        Monster.PrintStatus(thanos);
    }

}
