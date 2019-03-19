public class UserInfo {
	String givenName;
	String sirName;
	long age;
	
	public void setUserInfo(String givenName, String sirName, long age) {
		this.givenName = givenName;
		this.sirName = sirName;
		this.age = age;
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
}
