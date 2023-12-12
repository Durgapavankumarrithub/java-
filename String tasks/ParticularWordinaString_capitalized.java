import java.util.*;
public class ParticularWordinaString_capitalized {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
        String s1=sc.nextLine();
        String s2=s1.substring(4,8);
        String s3=s2.toUpperCase();
        
        System.out.println(s1.replace(s2, s3));
}
}
