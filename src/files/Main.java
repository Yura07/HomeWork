package files;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static final String BINARY_FILE = "Employee";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee bob = new Employee("Bob",1,5000);
        Employee ann = new Employee("Ann",2,6500);
        Employee jack = new Employee("Jack",3,10000);

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(bob);
        employeeSet.add(ann);
        employeeSet.add(jack);
        Methods ser = new Methods();
        Methods deser = new Methods();

        ser.serializable(employeeSet, BINARY_FILE);
        deser.deserializable(BINARY_FILE);

    }
}
