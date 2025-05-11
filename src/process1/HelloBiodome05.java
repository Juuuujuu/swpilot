package process1;

public class HelloBiodome05 {
    public static void calculate(){
        int g, b;
        for(g=0;g<16;g++){
            for(b=0;b<16;b++){
                if((g&1>>g<<2|b+g^b)==1&&(g%2<<b>>g|1&0^0)==2){
                    System.out.println((b*b+g)*(b<<b)+(g<<g));
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        //g>>g<<2|b+g^b==1
        //g%2<<b>>g|1&0^0==2
        calculate();

    }
}
