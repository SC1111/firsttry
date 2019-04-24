package CH8.student;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

public class StudentText {
	
	public static void main(String args[]){
		
		Student s1 = new Student(01, "yyx", 170, 60);
		Student s2 = new Student(02, "xyx", 180, 85);
		Student s3=new Student(06, "yyy", 155, 55);
		Student s4=new Student(04, "zxx", 190, 60);
		
		List<Student> sc = new ArrayList<>();
		sc.add(s1);
		sc.add(s2);
		sc.add(s3);
		sc.add(s4);
		SClass sClass = new SClass("DB01", sc);
		sClass.showIfo();
		
		System.out.println("--------身高-------------");
		Collections.sort(sc,new sortByHeight());
		
		sClass.showIfo();
		System.out.println("---------体重------------");
		Collections.sort(sc,new sortByWeight());
		sClass.showIfo();
		System.out.println("---------学号------------");
		Collections.sort(sc,new SortBYID());
		sClass.showIfo();
		
		
	
	
	

	}
}
