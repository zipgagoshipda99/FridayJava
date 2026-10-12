package Mission1;

public class Monster {
    String name;
    int hp;
    int attackPower;
    boolean isWinner;
    Monster(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    void attack(Monster target) {
        target.takeDamage(this.attackPower);
    }

    void takeDamage(int damage) {
        hp = hp - damage;
    }

    boolean isAlive() {
        return (hp > 0);
    }
    public static boolean PrintMonsterInfo(Monster monster) {
        System.out.println(monster.name + " , 생존여부 : " + monster.isAlive());

        return monster.isAlive();
    }
}
