package collection_n_generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author monesh
 */
public class MapInterface {
        public static void main(String[] args)
        {
            
            Map<String, String> values = new HashMap<>();
            
          values.put("Name", "Monesh");
          values.put("Gender", "Male");
          values.put("Skills", "Java");
          values.put("Text", "Hello");
            
          //System.out.println(values);
            
//            Set<String> sets = values.keySet();
//            for(String s : sets)
//            {
//                System.out.println(values.get(s));
//            }

           Set<Map.Entry<String,String>> map = values.entrySet();
           for(Map.Entry<String, String> i : map)
           {
               System.out.println(i.getKey() +" "+ i.getValue());
               i.setValue("III");
           }

        }
}
