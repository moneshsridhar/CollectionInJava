package collection_n_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author monesh
 */

/*
class NewComp implements Comparator<Integer>
{
@Override
public int compare(Integer t, Integer t1) {
if(t%10 > t1%10)
{
return 1;
}
return -1;
}

}
*/

public class ComparatorTutorial {
        public static void main(String[] args)
        {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(323);
            values.add(120);
            values.add(668);
            values.add(992);
            values.add(441);
            
          /* 
            //Comparator is an Interface
            Comparator c = new NewComp();   //Create an obj for NewComp Class
          */
            
            

            //Anonymous class implementation
            Comparator c = new Comparator<Integer>() {
            @Override
            public int compare(Integer t, Integer t1) {
            if(t%10 > t1%10)
            {
            return 1;
            }
            return -1;
            }
            };
            
          /*
          //lamda Expression
          Comparator c = ( t,  t1) ->  {
          return (t>t1)?1:-1;
          };
          */
            
            Collections.sort(values,c);
            values.forEach(System.out::println);
        }
}
