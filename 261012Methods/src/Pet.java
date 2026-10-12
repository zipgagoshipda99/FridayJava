public class Pet {
    // 필드: 이름, name, 행복도(점수) happy
    String name;
    int happiness;

    Pet(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    // 매개변수를 다른 객체를 받는 메소드 예시
    void playWith(Pet friend) {
        this.happiness += 10;
        friend.happiness += 10;
    }

    public static void PrintPetInfo(Pet pet) {
        System.out.println(pet.name + " , 행복지수 : " + pet.happiness);
    }
}
