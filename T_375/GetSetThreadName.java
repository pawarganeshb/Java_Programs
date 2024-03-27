class MyThread extends Thread{

}
public class GetSetThreadName {
    public static void main(String[] args) {
            System.out.println(Thread.currentThread().getName());
            MyThread t = new MyThread();
            System.out.println(t.getName()); 
            Thread.currentThread().setName("Ganesh's Thread");
            System.out.println(Thread.currentThread().getName());   
    }    
}
