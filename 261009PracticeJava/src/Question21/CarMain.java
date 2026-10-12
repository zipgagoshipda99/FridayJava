package Question21;

public class CarMain {
        public static void main(String[] args) {
                Car hundai = new Car("Hundai", 10);
                hundai.accelerate();
                System.out.println("Brand: " + hundai.brand + " / Speed : " + hundai.speed );
        }
}
