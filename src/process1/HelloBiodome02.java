package process1;

public class HelloBiodome02 {
    static public void main(String[] args) {
        try {
            int sun = Integer.parseInt(args[0]);
            int wind = Integer.parseInt(args[1]);
            int ground = Integer.parseInt(args[2]);
            System.out.println(sun+wind+ground);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            return;
        }

    }
}
