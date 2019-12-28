package collection_n_generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author monesh
 */
public class SetInterface 
{
    public static void main(String[] args)
    {
        //Set is an interface which have unique elements. 
        //There is no duplication in Set.
        Set<Integer> value = new HashSet<>();   
        //HashSet and TreeSet are the classes which implements the Set interface.
        //HashSet DYNAMICALLY prints the values because it uses some algorithm internally. uses the concept of HashCode
        Set<Integer> values = new TreeSet<>();
        //TreeSet prints in ASCENDING format.
        
        values.add(39);
        values.add(15);
        values.add(47);
        values.add(29);
        
        for(Integer i : values)
        {
            System.out.println(i);
        }
        
    }
}
