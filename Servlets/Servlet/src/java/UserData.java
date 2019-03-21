public class UserData {
	String givenName;
	String sirName;
	long age;
	String color;
	
	public void setUserData(String givenName, String sirName, long age, String color) {
		this.givenName = givenName;
		this.sirName = sirName;
		this.age = age;
		this.color = color;
	}
	
	public String getGivenName() {
		return this.givenName;
	}
	
	public String getSirName() {
		return this.sirName;
	}
	
	public long getAge() {
		return this.age;
	}
	public String getColor() {
		return this.color;
	}
}
