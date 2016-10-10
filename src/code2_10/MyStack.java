package code2_10;

import java.util.ArrayList;

public class MyStack{
	ArrayList <String> array=new ArrayList<String>();
	
	public void push(String element){
		array.add(element);
	}
	
	public String pop(){
		return array.remove(array.size()-1);
	}

}
