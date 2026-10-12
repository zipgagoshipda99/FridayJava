package Mission1;

import java.util.ArrayList;

public class MonsterMain {
    public static void main(String[] args) {
        ArrayList<String> VictoryVerdicts = new ArrayList<>();

        Monster slime = new Monster("슬라임", 30, 5);
        Monster goblin = new Monster("고블린", 50, 8);
        Monster rumi = new Monster("루미", 100, 67);
        slime.attack(goblin);
        rumi.attack(slime);
        rumi.attack(goblin);
        goblin.attack(rumi);

        if ((Monster.PrintMonsterInfo(slime))) {
            VictoryVerdicts.add("슬라임");
        }
        if (Monster.PrintMonsterInfo(goblin)) {
            VictoryVerdicts.add("고블린");
        }
        if (Monster.PrintMonsterInfo(rumi)) {
            VictoryVerdicts.add("루미");
        }
        System.out.print("최종 승자 : ");
        for (String string : VictoryVerdicts) {
            System.out.print(string);
        }

    }
}
