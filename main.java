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

public class main{
    public static void main(String[] args){
        
        BankCustomer customer = new BankCustomer("Alice Smith", "ACC123456", 28);
        customer.displayCustomerDetails();
    }

}
