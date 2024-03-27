class Circle1 {
    private int radius;// instant variable
    private float area;// instant variable
    private float perimeter;// instant variable

    public void setRadius(int r) {
        radius = r;
    }

    public void setArea(float a) {
        area = 3.142f * radius * radius;
        if (a == area) {
            area = a;
        } else {
            System.out.println("Wrong Value for Area!");
        }
    }

    public void setPerimeter(float a) {
        perimeter = 2 * 3.142f * radius;
        if (a == perimeter) {
            perimeter = a;
        } else {
            System.out.println("Wrong Value for Perimeter!");
        }
    }
}

public class AccessModifiersInJava {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.setRadius(5);
        c.setPerimeter(3.0f);
        c.setArea(125.0f);
    }
}