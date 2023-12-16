class Way1 extends Thread {
    public void run() {
        System.out.println("Thread(Way1) is running...");
        System.out.println(Thread.currentThread().getState());
    }
}

class Way2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread(Way2) is running...");
    }
}

public class CreateThread {
    public static void main(String[] args) {
        Way1 one = new Way1();
        one.run();

        Way2 two = new Way2();
        two.run();

        Thread three = new Thread();
        three.start();
        System.out.println(three.getState());
        three.run();
        // three.stop();    //deprecated
        three.interrupt();  //alternative to stop()
        System.out.println(three.getState());
    }
}
