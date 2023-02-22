
//public class MyGenericClass <T>{ //to create a generic remember <T>
//	
//	T x;
//	
//	MyGenericClass(T x){
//		this.x = x;
//	}
//	public T getValue() {
//		return x;
//	}
//	
//	
//
//}


public class MyGenericClass<T extends Number, V>{  // extends number class
	T x;
	V y;
	MyGenericClass(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public T getValue() {
		return x;
	}
	public V getValueY() {
		return y;
	}
}
