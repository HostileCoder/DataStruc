package SortingCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Person {
   private int age =0;
   private int IQ =0;
   public Person(int age,int IQ){
	   this.age=age;
	   this.IQ=IQ;
   }

   public String toString(){
	   return ""+age+" "+IQ;
   }
   
   public int getAge(){
	   return age;
   }
  
   public int getIQ(){
	   return IQ;
   }
   

}