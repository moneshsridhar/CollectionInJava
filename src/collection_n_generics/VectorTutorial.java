/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_n_generics;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author monesh
 */
public class VectorTutorial {
        public static void main(String[] args)
        {
            //Vector
            Vector<Integer> val = new Vector(); 
            val.add(12);
            val.add(14);
            val.add(13);
            val.insertElementAt(26, 0);
            val.forEach(System.out::println);
            
            //ArrayList
            ArrayList<Integer> v = new ArrayList<>();
            v.add(32);
            v.add(75);
            v.add(21);
            v.add(0,22);
            for(int i : v)
            {
                System.out.println(i);
            }
            
            
            
//         Differences  btw Vector and ArrayList

//        Vector implements List --> Moreover, Vector is same as ArrayList
//        By the way, Vector occupies more momery because it increases its capacity 100% as per the elements.
//        In ArrayList, unlike Vector, it increases its capacity 50%
//        Vector is synchronized but ArrayList is non-synchronized
//        Vector is ThreadSafe but slow.
//        ArrayList i s not ThreadSafe but fast.
        }        
}
