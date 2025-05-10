package process1;

public class HelloBiodome03 {
    public static double mmath(double n,double h){
        double nextguess=(h+n/h)/2;
        if(h-nextguess<0){
            if(-h+nextguess<0.0001){
                return nextguess;
            }
        }
        else{
            if(h-nextguess<0.0001){
                return nextguess;
            }
        }
        return mmath(n,nextguess);

    }
    static public void main(String[] args) {
        try {
            double temperature = Double.parseDouble(args[0]);
            double humidity = Double.parseDouble(args[1]);
            double oxygen = Double.parseDouble(args[2]);

            double guess = humidity;
            double hhumidity=mmath(guess,humidity);
            if(hhumidity-temperature<0){
                System.out.println(0.415*(temperature-hhumidity)+(oxygen)/(3.14*3.14));
            }
            else{
                System.out.println(0.415*(hhumidity-temperature)+(oxygen)/(3.14*3.14));
            }

        }catch (NumberFormatException e) {
            System.out.println("다시 입력하세요");
        }

    }
}
