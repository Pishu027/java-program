package Collection;

import java.util.*;
class StudCompare implements Comparator<student_2_lab>
{
	@Override
	                public int compare(student_2_lab stud1, student_2_lab stud2)
	        {
	                if (stud1.getReg() < stud2.getReg())
	                {
	                        return 1;
	                }
	                return -1;
	        }
	}
	public class SortList_2_lab
	{
	        public static void main(String[] args)
	        {
	                LinkedList<student_2_lab> list = new LinkedList<student_2_lab>();
	                list.add(new student_2_lab("John", 1001));
	                list.add(new student_2_lab("Raju", 1005));
	                list.add(new student_2_lab("Sham", 1000));
	                list.add(new student_2_lab("Ravi", 1002));
	                Collections.sort(list, new StudCompare());
	                System.out.println("Sorted list based on registration number\n");
	                System.out.println("**=============**=================**");
	                for (student_2_lab stud: list )
	                {
	                        System.out.println(stud);
	                }
	                System.out.println("**=============**=================**\n");
	        }
	}
