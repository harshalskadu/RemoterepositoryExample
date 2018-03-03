package javaPrograms;

public class InheritenceExample {

	public static void main(String[] args) 
	{
		p p1=new p();
		p1.M1();
		System.out.println("Parent class method executed");
		
		c c1=new c();
		c1.M1();
		System.out.println("Child class method executed");
		
	}
}
class p
{
	String s1="Parent";
	public void M1()
	{
	System.out.println(s1);
	System.out.println("This is the 5th character in string : " +s1.charAt(4));//Character index of given string
	System.out.println(s1.contains("P"));
	System.out.println(s1.length());
	
	}
}
	class c extends p
	{
		String s2="Child";
		public void M1()
		{
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.compareTo(s1));
		System.out.println("This is the first character in string: " + s2.charAt(0));
		System.out.println(s2.concat(s1));
		if(s2!=null)
		{
			
		}
		for(int i=0;i>=s2.length();i--)
		{
			System.out.println(s2);
		}
		}
	}