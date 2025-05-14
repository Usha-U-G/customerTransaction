class BankCustomer {
    String customerName;
    String accountNumber;
    int age;

    BankCustomer(String customerName, String accountNumber, int age) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Age: " + age);
        System.out.println("---------------------------");
    }
}

class Transaction {
    String transactionId;
    String senderName;
    String receiverName;
    double amount;
    String status;
    String date;

    Transaction(String transactionId, String senderName, String receiverName, double amount, String status, String date) {
        this.transactionId = transactionId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Sender Name: " + senderName);
        System.out.println("Receiver Name: " + receiverName);
        System.out.println("Amount: $" + amount);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date);
        System.out.println("---------------------------");
    }
}


public class main{
    public static void main(String[] args){
        
        BankCustomer customer = new BankCustomer("Alice Smith", "ACC123456", 28);
        customer.displayCustomerDetails();

        Transaction t1 = new Transaction("TX001", "Alice", "Bob", 500.0, "Successful", "10-05-2025");
        t1.displayTransaction();

        Transaction t2 = new Transaction("TX002", "Alice", "Charlie", 200.0, "Failed", "11-05-2025");
        t2.displayTransaction();

    }

}
