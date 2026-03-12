import java.util.*;
class Employee{
    String f_name;
    String l_name;
    double sal;
    public Employee(){
        f_name = null;
        l_name = null;
        sal = 0.0;
    }
    public String getf_name(){
        return f_name;
    }
    public String getl_name(){
        return l_name;
    }
    public double getsal(){
        return sal;
    }
    public void setf_name(String f){
        f_name = first;
    }
    public void setl_name(String l){
        l_name = last;
    }
    public void setsal(double s){
        sal = s;
    }
}
public class EmployeeTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        String f;
        String l;
        double s;
        System.out.println("Enter the info of Second Employee : ");
        System.out.println("First name of Employee : ");
        f = in.next();
        el.setf_name(f);
        System.out.println("Last name of Employee : ");
        l = sc.nextLine();
        el.setl_name(l);
        System.out.println("Salary of Employee : ");
        s = sc.nextInt();
        el.setsal(s);

        System.out.println("Enter the info of Second Employee : ");
        System.out.println("First name of Employee : ");
        f = in.next();
        e2.setf_name(f);
        System.out.println("Last name of Employee : ");
        l = in.next();
        e2.setl_name(l);
        System.out.println("Salary of Employee : ");
        s = in.next();
        e2.setsal(s);
    
        System.out.println("Info of fiest employee");
        System.out.println(e1.getf_name() + " " + e1.getl_name() + " " + e1.getsal());
        System.out.println("Info of second employee");
        System.out.println(e2.getf_name() + " " + e2.getl_name() + " " + e2.getsal());
    
    }
}