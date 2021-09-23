package register;

public class RegisterVO {

	private String regId;
	private String regPassword;
	private String regAddr;
	private String regGender;
	private String regAge;

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getRegPassword() {
		return regPassword;
	}

	public void setRegPassword(String regPassword) {
		this.regPassword = regPassword;
	}

	public String getRegAddr() {
		return regAddr;
	}

	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}

	public String getRegGender() {
		return regGender;
	}

	public void setRegGender(String regGender) {
		this.regGender = regGender;
	}

	public String getRegAge() {
		return regAge;
	}

	public void setRegAge(String regAge) {
		this.regAge = regAge;
	}
	
	public String toString() {
		return "RegisterVO [id=" + regId + ", password=" + regPassword + ", addr=" + regAddr + ", gender=" + regGender + ", age="
	            + regAge + "]";
		
}
}
