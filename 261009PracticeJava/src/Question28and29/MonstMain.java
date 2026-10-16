package Question28and29;

public class MonstMain {
    public static void main(String[] args) {
        Monster slime = new Monster("Slime", 30, 6);
        Monster goblin = new Monster("Goblin", 50, 8);
        
        goblin.Attack(slime);
        goblin.Attack(slime);
        boolean isAlive = slime.isAlive();
        System.out.println("Slime HP: " + slime.hp);
        System.out.println(isAlive ? "Slime is Alive" : "Slime is DEAD.");
        
        
    }
}
