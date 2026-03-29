import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class wissen1 {
    public static void main(String[] args) {
        List<Employees> employees=new ArrayList<>();
        employees.add(new Employees("raja",50000,"IT"));
        employees.add(new Employees("vishal",45000,"BPO"));
        employees.add(new Employees("shasi",10000,"IT"));
        Optional<Integer> salary=employees.stream().map(Employees::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(salary.get());
    }
}

class Employees{
    private String name;
    private int salary;
    private String department;

    public Employees(String name, int salary,String department) {
        this.name = name;
        this.salary = salary;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
