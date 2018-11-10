import java.util.ArrayList;

class Stack<T extends Number>{
	T data;
	ArrayList<T> list = new ArrayList<>();
	void push(T data) {
		this.data = data;
		list.add(this.data);
	}
	T pop() {
		T data = null;
		if(list.size()>0) {
			data = list.get(list.size()-1);
			list.remove(list.size()-1);
		}
		
		return data;
	}
	void peep() {
		for(int i = list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
	}
}
public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<String> stack = new Stack<>();
//		stack.push("Hello");
//		stack.push("Hi");
//		stack.push("Ok");
//		stack.peep();
//		String pop = stack.pop();
//		
//		System.out.println("Pop "+pop);
//		stack.peep();
//		System.out.println("********************");
		
		Stack<Integer> stack2 = new Stack<>();
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		stack2.peep();
		int pop2 = stack2.pop();
		
		System.out.println("Pop "+pop2);
		stack2.peep();
	}

}
