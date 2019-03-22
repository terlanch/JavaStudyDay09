package cn.tedu.Object;

public class ObjectLianXiDemo4 {

}
//银行账户
class Account{
	//账户id，账户余额，账户密码
	private long id ;
	private double balance;
	private String password;
	
	public Account(){
		
	}
	public Account(long id,double balance,String password){
		this.id = id;
		this.balance = balance;
		this.password = password;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return null;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
//
class SavingAccount extends Account{
	//存款利率
	private double interestRate;
	/*public SavingAccount(long id, double balance, String password) {
		super(id, balance, password);
		// TODO Auto-generated constructor stub
	}*/
	public SavingAccount(double interestRate){
		this.interestRate =interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		if(interestRate>0 && interestRate<0.1){
			this.interestRate = interestRate;
		}
	}
	
}
//
class CreditAccount extends Account{
	//
	private double creditLine;
	
	public CreditAccount(double creditLine){
		this.creditLine = creditLine;
	}

	public double getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}
	
}