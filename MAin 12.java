import java.util.*;
public class Main12
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String b="";
	    int i=0;
	    for(i=a.length()-1;i>-1;i--){
	        b=b+a.charAt(i);
	    }
	   System.out.println(b);
	    }
}
