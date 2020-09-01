package compare;

/**
 * Comparable接口中只有一个需要实现的方法compareTo
 * 当一个类实现了Comparable接口，这个对象就是可比较的
 * 例如使用Arrays.sort方法给数组排序，排序的过程中，数组元素的compareTo方法会被调用
 * 如果元素没有实现Comparable接口，则会报出ClassCastException
 * 下面给出一个例子，在下面这个例子中将会以年龄排序：
 */

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("张三风", 15, "南京");
        employees[1] = new Employee("李四", 27, "北京");
        employees[2] = new Employee("张玉华", 18, "上海");

        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private String address;

    @Override
    public int compareTo(Employee e) {
        return age - e.age;
    }

    public Employee() {}

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
