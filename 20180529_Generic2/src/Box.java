
public class Box <T> {  //Generic
	private T data; 
	public void set(T data) { //java의 모든 클라스를 다 담을 수 있다.
		this.data = data;
	}
	public T get() {
		return data;
	}
	
	//E – Element
	//K - Key
	//N - Number
	//T - Type
	//V – Value
}
