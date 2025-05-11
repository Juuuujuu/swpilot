package process1;

public class HelloBiodome04 {
    static public boolean checking(double t, double h, double o){
        if(t<10 ||t>=27.5){
            return false;
        }
        if(h<=40||h>=60){
            return false;
        }
        if(o<19.5||o>23.5){
            return false;
        }
        return true;
    }
    static public void main(String[] args) {
        try{
            double t = Double.parseDouble(args[0]);
            double h = Double.parseDouble(args[1]);
            double o = Double.parseDouble(args[2]);
            boolean condition = checking(t, h, o);

            if(condition){
                System.out.println("생명의 나무는 안정적인 상태입니다 :)");
            }
            else{
                System.out.println("온도값이 정상범위를 벗어났습니다. 확인이 필요합니다.");
            }
        }catch(NumberFormatException e){
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
        }
    }
}
