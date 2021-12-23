package homework2;

import java.util.ArrayList;

public class MyList <T>{
	int z=10;
	ArrayList<T> x = new ArrayList<>(z);
	
	
	
	public   MyList() {
		z=10;
		ArrayList<T> x=new ArrayList<>(z);
		
	}
	
	public MyList(int capacity) {
		z=capacity;
		ArrayList<T> x=new ArrayList<>(z);
		
		
		
	}
	
	public void add(T data) {
		if(x.size()==z) {
			 z=z*2;
			x.ensureCapacity(z);
			x.add(data);
			
		}else {
			x.add(data);
		}
		
	}
	public int size() {
		return x.size();
	}
	public int getCapacity() {
		return z;
	}
	
	
		
		
	}
	

