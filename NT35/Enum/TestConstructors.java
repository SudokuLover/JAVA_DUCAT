enum UserStatus{
	PENDING("P"),ACTIVE("A"),INACTIVE("I"),DELETED("D");

	private String StatusCode;
	
	private UserStatus(String s)
	{
		StatusCode =s;
	}
	
	public String getStatusCode(){
		return StatusCode;
	}
};

public class TestConstructors{
	
	public static void main(String args[])
	{
		System.out.println(UserStatus.ACTIVE.getStatusCode() );
	}
}