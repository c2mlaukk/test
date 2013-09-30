public class Hello {
    public static void main(String[]args) {
        System.out.println("Hello! Kaikilla on kivaa! ");
        endlessLoop();
    }

    public static void endlessLoop() {
        int x = 0;
        while(true) {
            x++;
            x = x*x;
        }
    }

}
