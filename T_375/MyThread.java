class Test extends Thread {
    public void run(){
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
    }
    
}
public class MyThread {        
    public static void main(String[] args) {
        Test mt = new Test();
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    
    }
}
