package project;
public class AccountInfo {
	private String name;
	private String lastName;
	private Integer balance;
	private String city;
	public String getName () {
		return name;
	}
	public String getLastName () {
		return lastName;
	}
	public String getCity () {
		return city;
	}
	public Integer getBalance () {
		return balance;
	}
	public void setName (String name){
		this.name = name;
	}
	public void setLastName (String lastName){
		this.lastName = lastName;
	}
	public void setBalance (Integer balance){
		this.balance = balance;
	}
	public void setCity (String city){
		this.city = city;
	}
	public AccountInfo(String name, String lastName, Integer balance, String city) {
		this.name = name;
		this.lastName = lastName;
		this.balance = balance;
		this.city = city;
	}
	public String toString() {
		return name+" "+lastName+","+balance+","+city;
	}
}