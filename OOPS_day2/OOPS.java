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
}
public class OOPS{
    public static void main(String[] args){
        BankAccount e1=new BankAccount("samyak",1000);
        e1.setname("raj");
    }
}