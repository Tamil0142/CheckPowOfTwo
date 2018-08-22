import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		boolean r=(n>0)&&((n&(n-1))==0);
		if(r==true)
			System.out.println("Yes");
		else
			System.out.println("No");
}}
