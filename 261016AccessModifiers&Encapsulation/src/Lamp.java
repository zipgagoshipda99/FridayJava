public class Lamp {
    //필드
    private int brightness; 
    
    //getter
    public int getBrightness() {
        return brightness;
    }

    //setter
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    //생성자로 필드 초기화잉
    Lamp(int brightness){
        this.brightness = brightness;
    }

}
