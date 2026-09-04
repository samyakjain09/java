package OOPS_day2;
class BankAccount{
    private String name;
    private double balance;
    BankAccount(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public void setname(String name){
        this.name=name;
        System.out.println(name);
    }
    public double checkBalance(){
        return balance;
    }
    public void depositAmount(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("amount should be positive");
        }
    }
    public void withdrawAmount(double amount){
        if(amount<=balance){
            balance-=amount;
        }else{
            System.out.println("insufficient balance");
        }
    }
}
public class OOPS{
    public static void main(String[] args){
        BankAccount e1=new BankAccount("samyak",1000);
        e1.setname("samyak jain");
        System.out.println(e1.checkBalance());;
        e1.withdrawAmount(500);
        e1.depositAmount(20000);
        System.out.println(e1.checkBalance());;
    }
}