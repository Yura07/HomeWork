package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("Yura",20);
        Class class1 = person.getClass();
        System.out.println(class1.getName());
        Field[] fields = class1.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getType());
            System.out.println(field.getName());
            field.setAccessible(true);
            System.out.println(field.getInt(person));
            field.setInt(person, 21);
            System.out.println();
            System.out.println("Changed field - " + field.getInt(person));
        }
    }
}
