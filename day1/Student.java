package week3.day1;

public class Student {
public void getStudentinfo(int id)
{
	 System.out.println(id);
}
	public void getStudentInfo(int id,String name)
	{
        System.out.println(id +":"+ name );  
   }
    public void getStudentInfo(String email,int phone) 
    {
        System.out.println(email+"\n"+phone+"\n");  
   }
    
    public static void main(String[] args) 
    {
		Student obj = new Student();
		obj.getStudentinfo(1);
		obj.getStudentInfo(1, "Dhanapriya");
		obj.getStudentInfo("priyar473@gmail.com",8883844);
		obj.getStudentinfo(2);
		obj.getStudentInfo(2, "priya");
		obj.getStudentInfo("priya@gmail.com", 3452525);
		
    }
}
