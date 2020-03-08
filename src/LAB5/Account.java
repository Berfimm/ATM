package LAB5;

public class Account {
	private int id =0;
	private double balance=0.00;
	private java.util.Date dateCreated;
	
	 public Account() {
	        dateCreated = new java.util.Date();
	    }

	  public Account(int id, double balance) {
	        this();
	        this.id = id;
	        this.balance = balance;
	    }
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
    public void withdraw(double amount) {
		this.balance -= amount;
		    }

    public void deposit(double amount) {
	    this.balance += amount;
		    }

}
