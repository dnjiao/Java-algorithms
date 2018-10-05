package design.pattern;

/**
 * This is a builder pattern
 *
 * @author Dian Jiao
 *
 */
public class BankAccount {
	
	private long accountNumber;
	private String name;
	private String branch;
	private double balance;
	
	private BankAccount(Builder builder) {
		this.accountNumber = builder.accountNumber;
		this.name = builder.name;
		this.branch = builder.branch;
		this.balance = builder.balance;
	}
	
	public static class Builder {
		
		private long accountNumber;
		private String name;
		private String branch;
		private double balance;
		
		
		public Builder(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder atBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		public Builder openingBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public BankAccount build() {
			return new BankAccount(this);
		}
	}
	
	// BankAccount account = new BankAccount.Builder(1234).withName........
	

}
