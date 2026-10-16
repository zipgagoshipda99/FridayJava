public class BatteryMain {
    public static void main(String[] args) {
        Battery aPlusPlus = new Battery(2);
        aPlusPlus.setLevel(60);
        aPlusPlus.setLevel(80);
        System.out.println("휴대전화 충전 상태% : " + aPlusPlus.getLevel()+"%");
        if(aPlusPlus.checkBatteryLife()){
            System.out.println("The phone battery is dead");
        }
        else{
            System.out.println("The phone battery is not dead");
        }
    }
}
