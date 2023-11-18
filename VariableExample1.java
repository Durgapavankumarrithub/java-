import java.util.*;
public class VariableExample1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("the sum of three numbers:"+(num1+num2+num3));
		System.out.println("the average of three numbers:"+((num1+num2+num3)/3));
		System.out.println("the product of three numbers:"+(num1*num2*num3));
		System.out.println("the subtraction of three numbers:"+(num1-num2-num3));
	}

}
