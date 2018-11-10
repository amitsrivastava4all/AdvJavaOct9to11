import java.io.Serializable;
import java.util.ArrayList;

class A implements Serializable{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D extends A{
	
}
class E{
	
}
public class WildCardDemo {
	static void print(ArrayList<A> aList) {
		
	}
//	static void print3(ArrayList<? extends A> aList) {
//		
//	}
//static void print3(ArrayList<? extends Serializable> aList) {
//		
//	}
//static void print3(ArrayList<? super B> aList) {
//	
//}
static void print3(ArrayList<?> aList) {
		
	}
//static void print3(ArrayList<Object> aList) {
//	
//}
	static void print2(A obj) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<A> aList = new ArrayList<>();
		aList.add(new B());
		ArrayList<B> bList = new ArrayList<>();
		//print(bList);
		print(aList);
		print3(bList);
		ArrayList<C> cList = new ArrayList<>();
		ArrayList<D> dList = new ArrayList<>();
		ArrayList<E> eList = new ArrayList<>();
		print3(cList);
		print3(dList);
		print3(eList);
		
		

	}

}
