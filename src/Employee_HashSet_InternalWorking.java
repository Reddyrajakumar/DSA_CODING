import java.util.HashSet;
import java.util.Set;

public class Employee_HashSet_InternalWorking {
    public static void main(String[] args) {
        Set<EmployeeDetails> set=new HashSet<>();
        EmployeeDetails e1=new EmployeeDetails(1,"Raja");
        EmployeeDetails e2=new EmployeeDetails(2,"Kumar");
        EmployeeDetails e3=new EmployeeDetails(3,"Raja");
        set.add(e1);
        set.add(e2);
        set.add(e3);
        e3.id=1;
        System.out.println(e3.id);
        for(EmployeeDetails ee:set){
            System.out.println(ee.id+" "+ee.name);
        }
    }
}

class EmployeeDetails{
    public int id;
    public String name;
    public EmployeeDetails(int id,String name){
        this.id=id;
        this.name=name;
    }
}

