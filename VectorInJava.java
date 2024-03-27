import java.util.Vector;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;

public class VectorInJava {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        System.out.println("Any thing you can add in this vector: ");
        v.add(1);
        v.add("Ganesh");
        v.add(2);
        v.add("Shivanand");
        v.add(3);
        v.add("Sainath");
        System.out.println(v);
        v.insertElementAt("Karan", 3);
        System.out.println(v);
        v.remove("Karan");
        System.out.println(v);
        v.removeElementAt(3);
        System.out.println(v);

    }

}
