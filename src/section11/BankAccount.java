package section11;

public class BankAccount {
	String ownerName;
	int accountNumber;
	float balance;
	String getOwnerName() {
		return ownerName;
	}
	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	int getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	float getBalance() {
		return balance;
	}
	void setBalance(float balance) {
		this.balance = balance;
	}
	BankAccount(String ownername, int accountnumber)
	{
		this.ownerName = ownername;
		this.accountNumber = accountnumber;
	}
	BankAccount(String ownername, int accountnumber, float balance)
	{
		this.ownerName = ownername;
		this.accountNumber = accountnumber;
		this.balance = balance;
	}
}
