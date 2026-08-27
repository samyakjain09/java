class employee{
    String name;
    int salary;

    void setname(String name){
        this.name=name;
    }
    void setSalary(int salary){
        this.salary=salary;
    }
    
    
}
public class Basics{
    public static void main(String[] args){
        employee e1=new employee();
        employee e2=new employee();
        e1.setSalary(1000);
        e2.setname("rohit");
        System.out.println(e1.getSalary(1000));
    }
}