class emp{
    String emp_name;
    int emp_id;
    double salary;
    emp(String emp_name,int emp_id,double salary){
        this.emp_name=emp_name;
        this.emp_id=emp_id;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee name: "+emp_name+ " Employee ID: "+emp_id+" Salary: "+salary);
    }
}
class Dept extends emp{

    String dept_name;
    String head;
    Dept(String emp_name,int emp_id,double salary,String dept_name,String head){
        super(emp_name,emp_id,salary);
        this.dept_name=dept_name;
        this.head=emp_name;
    }
    void display(String emp_name,int emp_id,double salary){
        System.out.println("Employee name: "+emp_name+ " Employee ID: "+emp_id+" Salary: "+salary+" Department:"+dept_name+" Departmen head:"+head);
    }
}
class Salary extends emp{
    double se;
    Salary(String emp_name,int emp_id,double salary,double se){
        super(emp_name,emp_id,salary);
        this.se=se;
    }
    void display(){
        System.out.println("Employee name: "+emp_name+ " Employee ID: "+emp_id+" Salary: "+salary+" Salary Enhancement:"+se);
    }
}
public class Q6 {
    public static void main(String[] args) {
        emp e1 = new emp("Swasti",12345,25000);
        System.out.println("Employee Details:");
        e1.display();
        Dept d= new Dept("Aarti",6789,23000,"IT","Riean E.");
        d.display();
        Salary s = new Salary("Mehak",3456,30000,5000);
        s.display();
    }
}
