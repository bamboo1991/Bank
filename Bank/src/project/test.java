package project;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
	
	@Test
	public void testTask1() {
		BankAccount b=new BankAccount();
		System.out.println(b.customers);
		String name="Sarah";
		String lastName="Mclain";
		Integer balance=1000;
		String city="chicago";
		AccountInfo accountinfo=new AccountInfo(name,lastName,balance,city);
		b.customers.add(accountinfo);
		assertEquals("Sarah Mclain,1000,chicago",b.customers.get(b.customers.size()-1).toString());
	}
	
	@Test
	public void testHighestBalance() {
		BankAccount b=new BankAccount();
		String name="Pete";
		assertEquals(name,b.highestBalance());
	}
	
	@Test
	public void testAddArray() {
		BankAccount b=new BankAccount();
		AccountInfo[] newCustom=new AccountInfo[] {new AccountInfo("john","peterson", 500,"chicago"),new AccountInfo("colleen","clark", 2500,"los angeles"),new AccountInfo("David","Mel", 99000,"chicago")};
		assertEquals(63,b.addArray(newCustom).size());
	}
	
	@Test
	public void testCountChicago() {
		BankAccount b=new BankAccount();
		assertEquals(20,b.countChicagoCustomers());
	}
	
	@Test
	public void testUpdateBalance1() {
		BankAccount b=new BankAccount();
		AccountInfo customer1=new AccountInfo("Henry", "Holloway",200,"los angeles");
		AccountInfo customer2=new AccountInfo("Juan", "Wilkins",200,"seattle");
		assertEquals(new AccountInfo("Henry", "Holloway",1800,"los angeles").toString(),b.updateBalance(customer1).toString());
		assertEquals(new AccountInfo("Juan", "Wilkins",8800,"seattle").toString(),b.updateBalance(customer2).toString());
	}
	
	
	@Test
	public void testUpdateBalance2() {
		BankAccount b=new BankAccount();
		AccountInfo customer=new AccountInfo("Joann", "Scott",200,"seattle");
		assertEquals(null,b.updateBalance(customer));
	}
	
	@Test
	public void testRemoveDuplicates() {
		BankAccount b=new BankAccount();
		assertEquals(54,b.removeDuplicateCustomers());
	}
	
	

}
