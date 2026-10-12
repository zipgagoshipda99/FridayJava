package Question21;
public class Car {

    String brand;
    int speed;

    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public int accelerate(){
        
        return(speed += 10);
    };
}