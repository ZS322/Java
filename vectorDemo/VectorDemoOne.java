package vectorDemo;

import java.util.Vector;

public class VectorDemoOne {

    public static void main(String[] args) {

        Vector v=new Vector(3,2);

        int size = v.size();

        System.out.println(size);

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));




    }

}
