package code2_10;

public class Main {
	
	public static void main(String[] args){
			MyStack<String> st = new MyStack<String>();
			st.push("changoo1");
			st.push("changoo2");
			System.out.println(st.pop());
			st.set(0,"changoo3"); 
			System.out.println(st.pop());
	}		

}
