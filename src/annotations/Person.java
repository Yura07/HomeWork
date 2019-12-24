package annotations;

public class Person {
    @MyAnn
    String name;
    int age;
    @MyAnn
    String job;
    @MyAnn
    int salary;

    public Person(String name, int age, String job, int salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
