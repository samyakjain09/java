package Constructor;
class Constructor{
    String name;
    int balance;
    Constructor(String name,int balance){
        this.name=name;
        this.balance=balance;
    }
    Constructor(Constructor acc){
        this(acc.name,acc.balance);
    }
}
public class CopyConstructor {
    public static void main(String[] args){
        Constructor c1=new Constructor("samyak",5000);
        Constructor c2=new Constructor(c1);
        System.out.println(c2.name);
        System.out.println(c2.balance);
        
    }
}
