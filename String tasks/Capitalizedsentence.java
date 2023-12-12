import java.util.*;
public class Capitalizedsentence {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a sentence:");
	String sentence=sc.nextLine();
	String[] words=sentence.split(" ");
	for(int i=0;i<words.length;i++)
	{
		String firstletter=words[i].substring(0,1);
		String restofword=words[i].substring(1);
		firstletter=firstletter.toUpperCase();
		words[i]=firstletter+restofword;
	}
	String capitalizedsentence=String.join(" ", words);
	System.out.println("captialized sentence:" + capitalizedsentence);
		
	}
	
}

