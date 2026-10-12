package Question28and29;

public class Monster {
    String name;
    int hp;
    int attackPower;
    Monster(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }
    public int Attack(Monster target){
        return (target.hp -= attackPower);
    }
    public int TakeDamage(int damage){
        return damage;
    }
    public boolean isAlive(){
        if(hp > 0 )
            return true;
        else
            return false;
    }

}
