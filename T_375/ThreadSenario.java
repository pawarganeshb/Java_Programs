class ThreadDe extends Thread {
    // public void run() {
    // System.out.println("no-arg");

    // }

    // public void run(int i) {
    // System.out.println("argument method");
    // }
}

public class ThreadSenario {
    public static void main(String[] args) {
        ThreadDe td = new ThreadDe();
        // td.start();
        // td.run(0);
        // System.out.println("Main Thread");
        System.out.println("Thread Name:" + Thread.currentThread().getName());
        Thread.currentThread().setName("Ganesh Pawar");
        System.out.println(td.getName());

    }
}
