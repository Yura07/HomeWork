package annotations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static final String MY_FILE = "file.txt";
    public static void main(String[] args) throws IllegalAccessException {
        Main main = new Main();
        Person person = new Person("Bob", 20, "Driver", 3500);
        main.writeToFile(person, person.getClass());
    }

    public void writeToFile(Object o, Class c) throws IllegalAccessException {
        Field[] declaredFields = c.getDeclaredFields();
        for (Field f : declaredFields) {
            Annotation[] declaredAnnotations = f.getDeclaredAnnotations();
            for (Annotation a: declaredAnnotations) {
                if (a.annotationType().equals(MyAnn.class)){
                    System.out.println(f.get(o));
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(MY_FILE,true))){
                        writer.write((f.get(o)+"\n"));

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
