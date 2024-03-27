public class CreatObj {
    String str; //global variable
    int rollNo;//global variable

    public static void main(String[] args) {    //Main method

        CreatObj obj = new CreatObj();//created object
        System.out.println(obj.str);
        System.out.println(obj.rollNo);
        final double pi = 3.14;
        System.out.println("value of final variable: "+pi);                 
    }
}
