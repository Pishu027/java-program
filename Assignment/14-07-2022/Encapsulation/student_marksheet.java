package demo;
import java.util.Scanner;

public class student_marksheet extends Encapsulation{
	
	public void accept() {
		int total_marks;
		double per;
		char grd;
		
		//accept input from user
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of student:");
		String s_name=sc.next();
		
		System.out.println("Enter roll no:");
		int roll_no=sc.nextInt();
		
		System.out.println("Enter Hindi marks:");
		int hin=sc.nextInt();
		
		System.out.println("Ente English marks:");
		int eng=sc.nextInt();
		
		System.out.println("Enter Mathematics marks:");
		int math=sc.nextInt();
		
		System.out.println("Enter Social science mrks:");
		int s_sci=sc.nextInt();
		
		System.out.println("Enter Science marks:");
		int sci=sc.nextInt();
		
		//calculate total marks
		total_marks=(hin+eng+math+s_sci+sci);
		System.out.println("total marks:"+total_marks);
		
		//calculate percentage
		per=((total_marks*100)/500);
		
		setPercentage(per);
		System.out.println("percentage:"+getPercentage()+"%");
		
		//calculate grade of student
		if(per<40) 
		{
			grd='D';
		}
		else if(per<60)
		{
			grd='C';
		}
		else if(per<80)
		{
			grd='B';
		}
		else
		{
			grd='A';
		}
		setGrade(grd);
		
		
		System.out.println("Roll no:"+roll_no+"\t\nStudent name:"+s_name+"\t\nTotal marks:"+total_marks+"\t\nPercentage:"+getPercentage()+"%"+"\t\nGrade:"+getGrade());
		
	}
	public static void main(String[]args)
	{
		student_marksheet obj=new student_marksheet();
		obj.accept();
	}
	

}
