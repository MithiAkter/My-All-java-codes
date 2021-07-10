
package task;

import java.util.Scanner;

class Student {
	String name;
	String stu_id;
	float score;
    public Student() {
	this(" ", " ", 0);
}
	public Student(String initName, String initId, float initScore) {
		name = initName;
		stu_id = initId;
		score = initScore;
                   
                
                        
	}
        
}

public class TwoD_Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Student Name, ID, Score:");
                
                
		Student stu = new Student();
		Student max = new Student();
		Student min = new Student(" ", " ", 100);
                
                
		for (int i = 0; i < 5; i ++) {
			stu.name = in.next();
			stu.stu_id = in.next();
			stu.score = in.nextFloat();
                       
                       
                     if (max.score < stu.score) {
				max.name = stu.name;
				max.stu_id = stu.stu_id;
				max.score = stu.score;
			}
			if (min.score > stu.score) {
				min.name = stu.name;
				min.stu_id = stu.stu_id;
				min.score = stu.score;
			}
                     
                                }

                
		System.out.println("name, ID of the highest score and the lowest score:");
		System.out.println("Highest CGPA=" + " " + max.score);
		System.out.println("Lowestest CGPA="+ " " + min.score);
                
                float a=max.score;
                float b=min.score;
                
                float sum=(a+b);
                float avg=sum/2;
                System.out.println("average from cgpa="+avg);
                 
		in.close();
	}
}
	

