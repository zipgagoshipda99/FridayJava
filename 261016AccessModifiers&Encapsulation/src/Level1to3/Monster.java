package Level1to3;

public class Monster {
    private String name;
    private int maxHp;
    private int hp;
    private int attackPower;
    private boolean isAlive;


    Monster(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attackPower = attackPower;
        this.isAlive = this.hp > 0;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        fixHp();
    }

    public void attack(Monster target) {
        target.takeDamage(this.attackPower);
        System.out.println( name + "에게 공격당함");
    }

    public void heal(int amount) {
        if (!isAlive)
            return;
        hp += amount;
        System.out.println("heal " + amount);
        fixHp();
    }

    private void fixHp() { // hp 관련 보호막 메소드
        if (hp < 0) {
            isAlive = false;
            hp = 0;
        }
        if (hp > maxHp) {
            hp = maxHp;
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public static void PrintStatus(Monster target) {
        if (target.isAlive) {

            System.out.println(target.getName() + "의 HP : " + target.getHp() + "/" + target.getMaxHp());
        } else {
            System.out.println(target.getName() + "의 HP : " + target.getHp() + "/" + target.getMaxHp());
            System.out.println("사망");
        }
    }

}
