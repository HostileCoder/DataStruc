package SortingCompare;

import java.util.Comparator;

public class CPerson  implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
		int x= o1.getAge()-o2.getAge();
		if(x>0){
			return 1;
		}else if(x<0){
			return -1;
		}
		return 0;
	}

}
