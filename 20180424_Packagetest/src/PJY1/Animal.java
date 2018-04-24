package PJY1;

public class Animal {
	public String publicField; //타 패키지에서 쓸 수 있음
	private String privateField; //타 패키지나 동일 패키지에서 모두 못씀, 클라스 내에서만 씀
	String packageField; //동일 패키지 안에서만 쓰임
	protected String protectedField; //타 패키지에서 못씀(private), 같은 패키지 내이거나 상속된 클라스(타 패키지에서도 가능)에서 쓸 수 있음(public)
	
	public Animal(){
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
		
	}
}
