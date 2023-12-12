import java.util.*;
public class PrintcapitallettersinaString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	System.out.println("capitalletters:");
	int count=0;
	for(int i=0;i<s1.length();i++)
	{
	 if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
	 {
		 System.out.println(s1.charAt(i));
		 count++;
		 
	 }
	}
	System.out.println("Number of capitalletters in a string:"+count);
	
}
}
