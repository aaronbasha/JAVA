public class TestBankAccount {

	public static void main(String[] args) {
		
        BankAccount account = new BankAccount();
        
        account.deposit("checkingBalance", 100);
        account.displayBalances();
        account.getCheckingBalance();
        System.out.println(account.withdraw("checkingBalance", 700));
		System.out.println(account.withdraw("savingsBalance", 700 ));
    
    }	
}