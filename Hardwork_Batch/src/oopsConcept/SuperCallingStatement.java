package oopsConcept;

public class SuperCallingStatement {

	// pen
	String emailId;
	String password;

	SuperCallingStatement(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

}

class FaceBook1 extends SuperCallingStatement {
	String username;

	public  FaceBook1(String emailId, String password, String username) {
		super(emailId, password);
		this.username = username;
	}
}
