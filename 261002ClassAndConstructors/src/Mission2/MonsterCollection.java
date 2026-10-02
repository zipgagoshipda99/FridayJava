package Mission2;


public class MonsterCollection {
    public static void main(String[] args) {
        Monster ghost = new Monster("고스트","Spooky.", 60, 6);
        Monster walker = new Monster("워커", "Dont get bit.", 100, 10);
        Monster rumi = new Monster("이루미", "세상에서 가장 바보인 여자.",1000, 67);
        PrintMonsterInfo(ghost);
        PrintMonsterInfo(walker);
        PrintMonsterInfo(rumi);
        
        //제가 지난 미션에서도 생성자 매겨변수를 사용하였지만 그래도 소감을 말해보자면
        //생성자 매겨변수 없이 일일이 한줄 한줄 생성된 객체의 맴버 변수들을 
    }
    public static void PrintMonsterInfo(Monster monster){
        System.out.printf("이름: %s / HP: %f / 공격력: %f / *%s ", monster.name, monster.hp, monster.attackPower);
        System.out.println("\n");
    }
}
