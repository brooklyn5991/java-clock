public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer(0, 0, 0);

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}