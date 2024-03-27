import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionFramework {
    /* 
    list.add();                                     simple add element;
    list.add(index, element);                       index wise insert element;
    list.addAll(newList);                           add of two list in one list;
    list.remove(index);                             remove of element of that index;
    list.remove(Integer.valueOf(element));          remove of element ;        
    list.clear();                                   this method was clear the all list;
    list.set(index,element);                        just update the element;
    list.get(index);                                get element of this index.
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(73);
        list.add(97);
        list.add(81);
        list.add(200);
        list.add(8);
        // System.out.println(list);
        list.add(70);
        list.add(20);
        // System.err.println(list);
        List<Integer> lit = new ArrayList<>();
        lit.add(92);
        lit.add(87);
        lit.add(61);
        lit.addAll(list);
        // System.out.println(lit);
        lit.add(1,6766);
        // System.out.println(lit);
        lit.remove(Integer.valueOf(70));
        lit.remove(Integer.valueOf(20));
        lit.remove(Integer.valueOf(92));
        lit.remove(Integer.valueOf(87));
        lit.remove(Integer.valueOf(61));
        // System.out.println(lit);
        lit.remove(0);
        // System.out.println(lit);
        // lit.clear();
        // System.out.println(lit);
        lit.set(3, 20);
        // System.out.println(lit);
        lit.set(4, 80);
        // System.out.println(lit);
       
        // System.out.println( lit.contains(20));
        // for (int i = 0; i < lit.size(); i++) {
        //     System.out.print(lit.get(i)+"\t");            
        // }
        for (Integer integer : lit) {
            // System.out.println(integer);
            
        }
        Iterator<Integer> it = lit.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

    }
    
}
