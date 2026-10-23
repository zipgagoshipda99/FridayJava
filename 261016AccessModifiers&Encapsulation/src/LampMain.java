public class LampMain {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(5);
        //lamp.brightness = 10;
        //System.out.println("램프의 밝기: " + lamp.brightness);
        // 위에 그동안 해왔던 코드. 아무나 lamp의 필드 접근 가능용
        lamp.setBrightness(10);
        System.out.println("램프의 밝기: " + lamp.getBrightness());
        //getter 와 setter 메소드를 사용하여 private 필드를 접근
    }
}
