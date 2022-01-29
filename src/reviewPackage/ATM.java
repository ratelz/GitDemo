package reviewPackage;

public class ATM {
	public static void main (String []args) {
		
		 // MENU
        System.out.println("WELCOME TO THE PRIME BANK ATM");
        System.out.println();
        System.out.println("WHAT WOULD YOU LIKE TO DO TODAY?");
        System.out.println();
        System.out.println("1) DEPOSIT MONEY");
        System.out.println();
        System.out.println("2) WITHDRAW MONEY");
        System.out.println();
        System.out.println("3) CHECK ACCOUNT BALANCE");
        System.out.println();
        // CHECKING ACCOUNT AND SAVING ACCOUNT
        double checkingBalance = 0;
        double savingsBalance = 100;
        //Scanner scanner = new Scanner(System.in);
        int action = 2;
        // LOGIC
        if (action == 1) {
            System.out.println("WHICH ACCOUNT WOULD YOU LIKE TO DEPOSIT?");
            String selectedAccount = "CHECKING";
            System.out.println("HOW MUCH WOULD YOU LIKE TO DEPOSIT?");
            int depositAmount = 1000;
            if (selectedAccount == "CHECKING") {
                checkingBalance += depositAmount;
            } else {
                savingsBalance += depositAmount;
            }
            System.out.println("YOUR CHECKING BALANCE IS $" + checkingBalance);
            System.out.println("YOUR SAVING BALANCE IS $" + savingsBalance);
        } else if (action == 2) {
            System.out.println("HOW MUCH WOULD YOU LIKE TO WITHDRAW?");
            int withdrawAmount = 500;
            System.out.println("WHICH ACCOUNT WOULD YOU LIKE LIKE TO WITHDRAW FROM?");
            String selectedAccount = "SAVINGS";
            if (selectedAccount == "CHECKING") {
                checkingBalance -= withdrawAmount;
            } else {
                savingsBalance -= withdrawAmount;
            }
            if (savingsBalance < 0 || checkingBalance < 0) {
                int overDraftFee = 35;
                System.out.println("THE FEE FOR OVER DRAFT IS $" + overDraftFee);
                double overDraftAmountSavings = savingsBalance;
                double overDraftAmountChecking = checkingBalance;
                if (savingsBalance < 0) {
                    savingsBalance -= overDraftFee;
                    System.out.println("THE NEW BALANCE FOR SAVINGS IS $" + savingsBalance);
                    System.out.println("YOU OVER DRAFTED SAVINGS FOR THE $" + overDraftAmountSavings);
                } else if (checkingBalance < 0) {
                    checkingBalance -= overDraftFee;
                    System.out.println("THE NEW BALANCE FOR CHECKING IS $" + checkingBalance);
                    System.out.println("YOU OVER DRAFTED CHECKING FOR THE $" + overDraftAmountChecking);
                }
            }
            System.out.println("YOUR CHECKING BALANCE IS $" + checkingBalance);
            System.out.println("YOUR SAVINGS BALANCE IS $" + savingsBalance);
        } else if (action == 3) {
            System.out.println("WHICH ACCOUNT WOULD YOU LIKE TO GET BALANCE?");
            String selectedAccount = "CHECKING";
            System.out.println("YOU SELECTED A " + selectedAccount + " ACCOUNT.");
            if (selectedAccount == "CHECKING") {
                System.out.println("YOUR " + selectedAccount + " ACCOUNT BALANCE IS $" + checkingBalance);
            } else {
                System.out.println("YOUR " + selectedAccount + " ACCOUNT BALANCE IS $" + savingsBalance);
            }
        }
    }
}
		
		
		
		
		
		
	