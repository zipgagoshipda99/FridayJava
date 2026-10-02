package Mission;

public class MonsterMain {
    public static void main(String[] args) {
        //슬라임 객체 생성, (몬스터 멤버변수들을 슬라임 기준으로 초기화)
        MonsterVer1 slime = new MonsterVer1();
        slime.name = "슬라임";
        slime.hp = 30.0f;
        slime.attackPower = 5.0f;
        
        //고블린 객체 생성, (몬스터 맴버 변수들을 고블린 기준으로 초기화)
        MonsterVer1 goblin = new MonsterVer1();
        goblin.name = "고블린";
        goblin.hp = 50.0f;
        goblin.attackPower = 8.0f;
        PrintMonsterStat(slime);
        PrintMonsterStat(goblin);
    }
    public static void PrintMonsterStat(MonsterVer1 monster){
        System.out.println(monster +  " : " + monster.name + " / " + monster.hp + " / " +  monster.attackPower );
    }
}
