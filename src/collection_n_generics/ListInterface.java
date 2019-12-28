package collection_n_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author monesh
 */
public class ListInterface 
{
    public static void main(String[] args)
    {
        List<Integer> values = new ArrayList<Integer>();            //ArrayList is a class which implements List Interface
        values.add(1);
        values.add(9);
        values.add(3);
        values.add(7);
        //In List, We can add by an index 
        values.add(2,5);
        System.out.println("Before sorted");
        //enhanced forloop
        for(Integer i : values)
        {
            System.out.print(i+" ");
        }
        System.out.println("After sorted");
        Collections.sort(values);
        //forEach
        values.forEach(System.out::print); //Stream API, Lamda expression
    }
}
