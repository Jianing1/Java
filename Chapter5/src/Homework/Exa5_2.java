package Homework;

public class Exa5_2 {
	public static String DeleteString(String s,char del)
	{
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=del)
			{
				t+=s.charAt(i);
			}
		}
		return t;		
	}
	public static void main(String[] args) {
		String s="ABCDEFG";		
		String s1=DeleteString(s,'B');
		String s2=DeleteString(s1,'C');
		String s3=DeleteString(s2,'D');
		String s4=DeleteString(s3,'F');
		System.out.println(s4);
	}

}
