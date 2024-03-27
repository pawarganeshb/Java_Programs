public class CompareaTwoString {
   public static void main(String[] args) {
    String s1="code";
    String s2="life";
    boolean status = false;
    for (int i = 0; i < s1.length(); i++) {
        if(s1.charAt(i)!=s2.charAt(i)){
           status = false;
           break;
        }
        status =  true;
    }
    System.out.println("Both strings are equal: "+status);
        
}
    
}
