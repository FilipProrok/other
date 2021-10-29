package pl.itechgroup.bank.zadanie;

public class TransferService {

    /*
    public TransferService(int amount, Account sendingAccount, Account receiptAccount, boolean isSending) {
        super(amount, sendingAccount, receiptAccount, isSending);
    }
    */

    public Transfer makeTransfer(int amount, Account sendingAccount, Account receiptAccount) throws NotEnoughMoneyException, AccountIsBlockedException {
        if(sendingAccount.getPerson().isBlocked == false && receiptAccount.getPerson().isBlocked == false) {
            if (checkSender(sendingAccount.balance, amount)) {
                System.out.println("Sending " + amount + " from account no: " + sendingAccount.accountNumber + " to account no: " + receiptAccount.accountNumber);
                System.out.println("Sending account balance before transfer: " + sendingAccount.balance);
                System.out.println("Receipt account balance before transfer: " + receiptAccount.balance);
                sendingAccount.balance -= amount;
                receiptAccount.balance += amount;
                System.out.println("Sending account balance after transfer: " + sendingAccount.balance);
                System.out.println("Receipt account balance after transfer: " + receiptAccount.balance);
                return new Transfer(amount);
            } else {
                System.out.println("Transaction failed, not enough money");
                throw new NotEnoughMoneyException();
            }
        }else{
            throw new AccountIsBlockedException();
        }
    }

    private boolean checkSender(int balance, int amount) {
        if (balance >= amount) {
            return true;
        } else {
            return false;
        }
    }

}
