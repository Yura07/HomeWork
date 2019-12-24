package files;

public class Main {
    public static final String BINARY_FILE = "Employee.bin";
    public static void main(String[] args) {
        Employee employee = new Employee("Bob",1,5000);
        Methods ser = new Methods();
        Methods deser = new Methods();

        ser.serializable(employee, BINARY_FILE);
        print(deser, BINARY_FILE);
    }

    public static void print(Methods deser, String fileName){
        Employee employee = deser.deserializable(fileName);
        System.out.println(employee.getName());
    }
}
