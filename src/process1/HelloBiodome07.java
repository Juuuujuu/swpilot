package process1;

public class HelloBiodome07 {
    static public void main(String[] args) {
        try {
            String[] a = args;
            String aa = "";
            aa = add(a, aa);
            String aaa = "";
            char b = ' ';
            int count = 0;
            for (int i = 0; i < aa.length(); i++) {
                if (aa.charAt(i) == b) {
                    count++;
                } else {
                    if (count != 0) {
                        aaa += count;
                        count = 0;
                    }
                    if (aa.charAt(i) == 'C') {
                        aaa += 'C';
                        b = 'C';
                        count++;
                    } else if (aa.charAt(i) == 'J') {
                        aaa += 'J';
                        b = 'J';
                        count++;
                    } else if (aa.charAt(i) == 'H') {
                        aaa += 'H';
                        b = 'H';
                        count++;
                    } else if (aa.charAt(i) == 'E') {
                        aaa += 'E';
                        b = 'E';
                        count++;
                    } else if (aa.charAt(i) == 'Y') {
                        aaa += 'Y';
                        b = 'Y';
                        count++;
                    } else {
                        System.out.print("염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요");
                        return;
                    }
                }
            }
            aaa += count;
            System.out.print(aaa);
        } catch (Exception e) {
            System.out.println("염기서열이 입력되지 않았습니다.");
        }
    }
    static public String add(String[] a,String aa){
        for(int i=0; i<a.length; i++){
            aa=aa.concat(a[i]);
        }
        aa=aa.toUpperCase();
        return aa;
    }
}
