//Develop a java program to create a class bankAccount with members account number, accound holder name, and balance. iinclude methods to accept and display account details. create multiple bank account objects. 

class BankAccount{
    String accountNumber;
    String accountHolderName;
    double balance;
    public void accept(String accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public void display(){
        System.out.println("Account Number: "+this.accountNumber+" Account Holder Name: "+this.accountHolderName+" Balance: "+this.balance);
    }
}

class third{
    public static void main(String[] args){
        BankAccount b1=new BankAccount();
        b1.accept("101", "Zameer", 10000);
        BankAccount b2=new BankAccount();
        b2.accept("102", "Yuvanika", 20000);
        BankAccount b3=new BankAccount();
        b3.accept("103", "Aishwarya", 30000);
        BankAccount b4=new BankAccount();
        b4.accept("104","Aadi", 40000);
        BankAccount b5=new BankAccount();
        b5.accept("105","Yadu", 50000);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }
}