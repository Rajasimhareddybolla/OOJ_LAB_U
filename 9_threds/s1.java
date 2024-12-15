class pB extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("BMS collage of engineering ");
            try {
                Thread.sleep(10 * 1000);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class pC extends Thread {
    public void run() {
        for (int j = 0; j < 20; j++) {
            System.out.println("Cse");
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class s1 {
    public static void main(String[] args) {
        pB b = new pB();
        pC c = new pC();
        b.start();
        c.start();
    }

}