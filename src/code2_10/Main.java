package code2_10;

public class Main {
	
	public static void main(String[] args){
			MyStack st = new MyStack();
			st.push("changoo1");
			st.push("changoo2");
			System.out.println(st.pop());
			st.push("changoo3");
			System.out.println(st.pop());
	}		

}
