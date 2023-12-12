import java.util.*;
public class CountNoOfword {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String[]words=s1.split(" ");
	System.out.println("number of words persent in a string:"+words.length);
}
}
