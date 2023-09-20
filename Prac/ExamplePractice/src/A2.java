import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class A2 {
	
	int x;
	double y;
	
	void add(int a , int b) {
		x=a+b;
	}
	void add(double c , double d) {
		y=c+d;
	}
	
	A2(){
		this.x=0;
		this.y=0;
	}
	
	public static void main(String[] args) {
		A2 aa=new A2();
		int a=2;
		double b=3.2;
		aa.add(a,a);
		aa.add(b, b);
		System.out.println(aa.x+""+aa.y);
		
		Object[] names=new String[3];
		//names[0]=new Integer(0);
		
		String c= "Hello i love";
		boolean var;
		var =c.startsWith("hello");
		System.out.println(var);
		
		LinkedList list=new LinkedList();
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));
		
		Iterator i=list.iterator();
		Collections.reverse(list);
		Collections.sort(list);
		
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
	}

}
