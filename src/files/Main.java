package files;

import java.io.IOException;

public class Main {
    public static final String BINARY_FILE = "Employee";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Bob",1,5000);
        Methods ser = new Methods();
        Methods deser = new Methods();

        ser.serializable(employee, BINARY_FILE);
        deser.deserializable(BINARY_FILE);

    }
}
