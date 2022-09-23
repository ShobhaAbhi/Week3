package polymorphism;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(22);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("id is " +id);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email id is "+email );
	}
	public static void main(String[] args) {
	
		
		Students get = new Students();
		get.getStudentInfo(22);
		get.getStudentInfo(22, "shobha");
		get.getStudentInfo("shobhashivakumarkittada@gmail.com", 91642603);
	}

}
