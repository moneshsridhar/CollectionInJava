package collection_n_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author monesh
 */
public class CollectionTutorial 
{
    public static void main(String[] args)
    {
        Collection values = new ArrayList();            //This is for independent datatype
        values.add(2);
        values.add("Ms");
        values.add(5.5);
        values.remove(5.5);
          
        Collection<Integer> val  = new ArrayList<Integer>();        //This is for data specific
        //it can accept only Integer
        values.add(1);
        values.add(3);
        values.add(2);
        
        //Method 1: Iterator
        //Old
        Iterator i = values.iterator();
        while(i.hasNext())
        {
        System.out.println(i.next());
        }
        
        //Method 2: Enhanced forloop
        //Advance
        for(Object q : val)
        {
        System.out.println(q);
        }
    }
}
