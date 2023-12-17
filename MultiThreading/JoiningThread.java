class MyThread extends Thread {
    MyThread() {
        super();
    }
    
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoiningThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        try {
            t1.join(3000);  //now t2 will wait for 1 sec then starts executing
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}
