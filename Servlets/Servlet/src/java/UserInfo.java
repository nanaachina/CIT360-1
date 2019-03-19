public class UserInfo {
	String givenName;
	String sirName;
	long zip;
	
	public void setUserInfo(String givenName, String sirName, long zip) {
		this.givenName = givenName;
		this.sirName = sirName;
		this.zip = zip;
	}
	
	public String getGivenName() {
		return this.givenName;
	}
	
	public String getSirName() {
		return this.sirName;
	}
	
	public long getZip() {
		return this.zip;
	}
}
