class node1
{
    int data;
    node left;
    node right;
    node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Main
{
	public static void main(String[] args) {
	    node a=new node(1);
	    node b=new node(2);
	    node c=new node(3);
	    a.left=b;
	    b.right=c;
	    System.out.println(a.data);
	    System.out.println(a.left.data);
	    System.out.println(a.right.data);
	}
}