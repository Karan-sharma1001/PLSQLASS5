package Exception;

import javax.security.auth.login.AccountException;

public class Account {
private String accId;//start with ACC& leng 6
private String accType;


public String getAccId() {
	return accId;
}
public void setAccId(String accid) throws AccountException {
	if (accid.startsWith("ACC")&&accid.length()==6)
	this.accId = accid;
	else
		throw new AccountException("AccountId is not valid ");
}
public String getAccType() {
	return accType;
}
public Account(String accid, String accType) throws AccountException {
	if (accid.startsWith("ACC")&&accid.length()==6)
	{	this.accId = accid;
	this.accType = accType;
	}
	else
			throw new AccountException("AccountId is not valid ");
}
public void setAccType(String accType) {
	this.accType = accType;
}
@Override
public String toString() {
	return "Account [accId=" + accId + ", accType=" + accType + "]";
}





}
