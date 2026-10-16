package shop;
import phone.Phone;
public class SmartPhone extends Phone {
    void show(){
        System.out.println("모델 :  " + model); //protected
        System.out.println("소유주 : " + owner);
        //System.out.println("충전 상태: " + batteryLife); 패키지(폴더) 동일 하지 않으므로 오류!
    }
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.show();
    }
}
