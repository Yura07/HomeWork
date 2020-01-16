package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Methods implements Serializable {
    public void serializable(Employee employee, String fileName) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        outputStream.writeObject(employee);
    }


    public void deserializable(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
        Employee employee = (Employee)inputStream.readObject();
        System.out.println(employee.toString());
    }

}
