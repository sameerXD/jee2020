package assignment;

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List;
import java.util.Scanner;
import java.util.Comparator; 


class Student{
  int  id;
  double cgpa;
  String name;
  
  public Student(double cgpa,int id, String name) {
	  this.cgpa = cgpa;
	  this.id = id;
	  this.name = name;
  }  
  
  public String getName() {
	  return name;
  }
  
  public int getId(){
	  return id;
  }
  
 
  
  public double getCgpa() {
	  return cgpa;
  }
 
  @Override
  public String toString() {
	  return " "+ name+" ";
  }
  
  
}

 class StudentSorting implements Comparator<Student>{
 
@Override
	public int compare(Student stud1 , Student stud2) {
	     Double f = new Double(stud1.getCgpa());
	     Double f1 = new Double(stud2.getCgpa());
		int compareName = stud1.getName().compareTo(stud2.getName());
		int compareCgpa = f1.compareTo(f);
		if(compareCgpa==0) {
			return ((compareName==0)?stud2.getId()-stud1.getId():compareName);
		}else {
			return compareCgpa;
		}
	}
}

class userInput{

  public String Input(String a) {
	 
      
	  System.out.println(a);
      Scanner obj1 = new Scanner(System.in);	
      String studentA = obj1.nextLine();
      return studentA;
      
      
  }
}

public class focp {
	public static void main(String[] args) {
		int x = 0;
		int b = 0;
		double a = 0;
		int record = 0;
		List<Student> op = new ArrayList<Student>();
         
	
		while(x!=1) {
			userInput i = new userInput();
			boolean checkInt = false;
			boolean checkFloat = false;
			
			System.out.println("number of records are " + record);
			record++;
			
			//cgpa condition
			

			while(checkFloat==false) {
			String o = i.Input("Cgpa: ");	
			int intplace = o.indexOf(".");
			int decimalPlaces = o.length()-intplace-1;
		    if(decimalPlaces>2) {
		    	System.out.println("wrong maximum decimal places allowed are 2 .");
		    }else {
		  System.out.println("value: pass");
		   a=Double.parseDouble(o);
		  checkFloat = true;
		    }
		    }
		
			//id condition
			
			while(checkInt==false) {
				String ci = i.Input("id:");
				Character k = new Character('0'); 
				char j = k.charValue() ;
				if (ci.charAt(0)==j) {
					System.out.println("id cannot start with 0 try again");
					
				}else {
					 b = Integer.parseInt(ci);
					checkInt= true;
				}
	}
			//string condition
			
			String c = i.Input("name:").toLowerCase();
			
			Student ob1 = new Student(a,b,c);
			op.add(ob1);
			
			System.out.println("press 1 to exit ");
			Scanner obj2 = new Scanner(System.in);
			x= obj2.nextInt();
			if(x==1) {
				break;
			};
		}
		
		Iterator<Student> studIterator = op.iterator();
		
		System.out.println("list before sortin...");
		
		while(studIterator.hasNext()) {
			System.out.println(studIterator.next());		
		}
		
		System.out.println("after sorting.....");
		
		Collections.sort(op, new StudentSorting()); 

		for(Student y:op) {
			System.out.println(y);
		}
		
		
	}
   
}
