package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
public void studentName()
{
	System.out.println(" R.Dhanapriya");
}
public void studentDept()
{
	System.out.println("Applied Electronics");
}
public void studentId()
{
	System.out.println("Student_id:EC12454");
}
public static void main (String[] args)
{
	College obj1 = new College();
	obj1.collegeName();
	obj1.collegeRank();
	obj1.collegeCode();
	
	Department obj2 = new Department();
	obj2.collegeName();
	obj2.collegeCode();
	obj2.collegeRank();
	obj2.deptName();
	
	Student obj3 = new Student();
	obj3.collegeName();
	obj3.collegeCode();
	obj3.collegeRank();
	obj3.deptName();
	obj3.studentName();
	obj3.studentDept();
	obj3.studentId();
}
}
