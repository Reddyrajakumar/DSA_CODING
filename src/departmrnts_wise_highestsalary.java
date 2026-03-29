import java.util.*;
import java.util.stream.Collectors;

public class departmrnts_wise_highestsalary {
    public static void main(String[] args) {
        List<Employees> employees=new ArrayList<>();
        employees.add(new Employees("raja",50000,"IT"));
        employees.add(new Employees("vishal",45000,"BPO"));
        employees.add(new Employees("shasi",10000,"IT"));
        Map<String, Optional<Employees>> map=employees.stream().collect(Collectors.groupingBy(
                Employees::getDepartment,
                Collectors.maxBy(Comparator.comparingInt(Employees::getSalary))
        ));
        map.forEach((a,b)-> System.out.println(a+"="+b.get()));
    }
}
