





public class BankAccountTest {

    public static void main (String[] args){

        BankAccount account1 = new BankAccount (100000, 50000);

        account1.setcheckingBalance (500);

        account1.setcheckingBalanceWithdraw (200000);
        
        
        System.out.println (account1.getcheckingBalance());

        System.out.println (account1.getsavingsBalance());

        System.out.println (account1.gettotalAccountbalance());

    }

}