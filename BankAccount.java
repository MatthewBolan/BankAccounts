
    public class BankAccount {

        private double  checkingBalance;

        private double savingsBalance;

        private static int numberOfAccounts = 0;

        private static double totalAccountsBalance;


        public BankAccount (double checkingBalance, double savingsBalance) {

            this.checkingBalance = checkingBalance;

            this.savingsBalance = savingsBalance;

            this.numberOfAccounts++;

            this.totalAccountsBalance = checkingBalance + savingsBalance;

        }


        public double gettotalAccountbalance() {

            return totalAccountsBalance;

        }



        public double getcheckingBalance () {

            return checkingBalance;

        }


        public double getsavingsBalance () {

            return savingsBalance;

        }


        public void setcheckingBalance (double depositNumber) {

        checkingBalance += depositNumber;

        totalAccountsBalance = totalAccountsBalance + depositNumber;
    }


        public void setsavingsBalance (double depositNumber) {

        savingsBalance += depositNumber;
    }


        public void setcheckingBalanceWithdraw (double withdrawNumber) {

        if (checkingBalance < withdrawNumber){

            System.out.println("You Broke!");

        }

        else{

        checkingBalance -= withdrawNumber;

        totalAccountsBalance = totalAccountsBalance - withdrawNumber;

        }

    

    }


        public void setsavingsBalanceWithdraw (double withdrawNumber) {

        if (savingsBalance < withdrawNumber){

            System.out.println("You Broke!");

        }

        else{

        savingsBalance -= withdrawNumber;

        totalAccountsBalance = totalAccountsBalance - withdrawNumber;

        }

    }


    }