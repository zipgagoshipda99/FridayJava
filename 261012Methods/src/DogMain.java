public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("뽀삐", "웰시코기");
        System.out.println("이름: " + dog.name);
        System.out.println("품종: " + dog.breed);
        dog.bark();
        dog.eat("사료");
    }
}
