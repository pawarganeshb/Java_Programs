import java.util.*;

public class Collections {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1001);
        al.add(1004);
        al.add(1002);
        al.add(1003);
        int size = al.size();
        // System.out.println(al);
        // System.out.println("Size: " + size);
        // System.out.println("Specific Element: "+al.get(2));
        // System.out.println(al.contains(1001));
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        System.out.println(al);
        LinkedList li = new LinkedList<>();
        li.add(1001);
        li.add("Ganesh");
        li.add(1002);
        li.add("Sandip");
        li.add("1003");
        li.add("Maroti");
        li.add(1004);
        li.add("Manmath");
    
        System.out.println("Size of LinkdList: "+li.size());
        System.out.println(li.contains("abcd"));
        System.out.println("---------------------------------------------");
        ListIterator i = li.listIterator(li.size());
        while (i.hasPrevious()) {
            System.out.println(i.previous());            
        }
    }
}
