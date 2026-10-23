public class Battery {
    //필드 : level(정수) -> 내 클래스만 접근 가능하게 선언
    //생성자 : 맴버 변수 level을 매개변수로 초기화잉
    //getter와 setter 메소드를 사용하여 private 멤버 변수 
    //접근 가능하도록 하세요.

    private int level;

    Battery(int level){
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public boolean checkBatteryLife(){
        if(level <=0){
            return true;
        }
        else
            return false;
    }
}
