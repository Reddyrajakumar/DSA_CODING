class Employee {

    private String name;
    private int age;
    private String department;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
    }

    public void display() {
        System.out.println(name + " " + age + " " + department);
    }

    static class EmployeeBuilder {

        private String name;
        private int age;
        private String department;

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}

public class Builderpattern {
    public static void main(String[] args) {

        Employee emp = new Employee.EmployeeBuilder()
                .setName("Raja")
                .setAge(25)
                .setDepartment("IT")
                .build();

        emp.display();
    }
}