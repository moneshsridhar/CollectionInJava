package collection_n_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author monesh
 */
class Container<T extends Number>
{
    T value;
    public T getValue()
    {
        return value ;
    }
    public void setValue(T value)
    {
        this.value = value;
    }
     public void show()
    {
        System.out.println(value.getClass().getName());
    }
     public void demo(ArrayList<? super  Integer> obj)
     {
         
     }
     
}
public class GenericsDemo {
    
    public static void main(String[] args) {
        
        Container obj = new Container();
        obj.value = 5;
        obj.show();
        obj.demo(new ArrayList<Number>());
    }
    
}
