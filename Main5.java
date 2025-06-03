mport java.util.*;
public class Main5
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[]a=new int[5];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    int []b=new int[a.length];
	    for(int i=0;i<a.length;i++){
	        b[i]=a[i];
	    }
	    for(int i=0;i<a.length;i++){
		System.out.println(b[i]);
}
}
}