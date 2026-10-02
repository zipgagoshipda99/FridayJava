package Mission2;

public class MonsterM {
    public static void main(String[] args) {
        Monster slime = new Monster("슬라임", null, 30, 5);
        Monster goblin = new Monster("고블린", null, 50, 8);
        
        System.out.println(slime.name + " : " + slime.hp + ": " + goblin.attackPower);
        System.out.println(goblin.name + " : " + goblin.hp + " : " + goblin.attackPower);
    }
}
