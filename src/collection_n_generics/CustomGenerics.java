package collection_n_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author monesh
 */

class Student implements Comparable<Student>
{
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", marks=" + marks + '}';
    }
    
    public int compareTo(Student s)
    {
        return this.marks>s.marks?-1:this.marks<s.marks?1:0;        //maximum marks comes first
    }
    
}

public class CustomGenerics {
    public static void main(String[] args)
    {
        List<Student> values = new ArrayList<>();
        values.add(new Student(1,98));
        values.add(new Student(2,64));
        values.add(new Student(3,82));
        values.add(new Student(4,78));
        values.add(new Student(5,35));
        
        Collections.sort(values);       //it generally shows error because sorting a custom class values requires some logics so that we have to implements comparable interface.
        
        for(Student i : values)
        {
            System.out.println(i);
        }
        
     }
}

