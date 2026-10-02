package Mission;
public class MonsterCollection{
    public static void main(String[] args) {
        MonsterVer2 ghost = new MonsterVer2("고스트","Spooky.", 60f, 6f);
        MonsterVer2 walker = new MonsterVer2("워커", "Dont get bit.", 100f, 10f);
        MonsterVer2 rumi = new MonsterVer2("이루미", "세상에서 가장 바보인 여자.",1000f, 67f);
        PrintMonsterInfo(ghost);
        PrintMonsterInfo(walker);
        PrintMonsterInfo(rumi);
    }
    public static void PrintMonsterInfo(MonsterVer2 monster){
        System.out.printf("이름: %s / HP: %f / 공격력: %f/ ", monster.name, monster.hp, monster.attackPower);
        System.out.printf("%s", monster.introduction);
        System.out.println("\n");
    }
}