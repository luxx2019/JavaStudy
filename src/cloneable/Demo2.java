package cloneable;

/**
 * 从下面这个示例我们可以发现，虽然Arrays类实现了Cloneable方法，但仍然是简单的浅拷贝，而不是deep copy
 * 使用Arrays.clone方法时，要保证元素的字段没有引用其他的对象
 */

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        Department d1 = new Department(1001, "后勤部");
        Department d2 = new Department(1002, "营销部");
        Department d3 = new Department(1003, "研发部");

        employees[0] = new Employee("张三风", 15, d1, "南京");
        employees[1] = new Employee("李成功", 27, d2, "北京");
        employees[2] = new Employee("张玉华", 18, d3, "上海");

        Employee[] emps = employees.clone();

        System.out.println(Arrays.toString(employees));
        System.out.println(Arrays.toString(emps));

        emps[0].dept.setName("策划部");

        System.out.println(Arrays.toString(employees));
        System.out.println(Arrays.toString(emps));
    }
}