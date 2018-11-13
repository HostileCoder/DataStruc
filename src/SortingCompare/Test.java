package SortingCompare;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test {
	   public static void main ( String [] args ) {
		   ArrayList<Person> x = new  ArrayList<Person>();
		      // Create and print a person object ...
		      Person p0 = new Person(77,441);
		      Person p1 = new Person(2,1220);
		      Person p2 = new Person(22,102);
		      x.add(p0);
		      x.add(p1);
		      x.add(p2);
		      sortPA(x);
		      for(Person p: x){
		    	  System.out.println(p);
		      }
		      
		      @SuppressWarnings("unchecked")
			SortedMap<Person, Integer> s = new TreeMap( new CPerson());

		      
		      s.put( p0,1);
		      s.put( p1,2);
		      s.put( p2,3);
		      
		      System.out.println(s);
		      
		      s.put(new Person(11,12), 4);
		      
		     
		      System.out.println(  s.firstKey());
		   }
	   
	   public static  void sortPA(ArrayList<Person> x){
			Collections.sort(x,new Comparator<Person>()
			{
				@Override
				public int compare(Person o1, Person o2) {
					int x= o1.getAge()-o2.getAge();
					if(x>0){
						return -1;
					}else if(x<0){
						return 1;
					}
					return 0;
				}
			
			});
	   }
	   
	   public static  void sortPI(ArrayList<Person> x){
			Collections.sort(x,new Comparator<Person>()
			{
				@Override
				public int compare(Person o1, Person o2) {
					int x= o1.getIQ()-o2.getIQ();
					if(x>0){
						return 1;
					}else if(x<0){
						return -1;
					}
					return 0;
				}
			
			});
	   }
	   
}
