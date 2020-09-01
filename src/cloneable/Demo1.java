package cloneable;

/**
 * Cloneable接口是一个标记接口，并不要求实现方法，实现它的唯一用处就是可以用instanceof做检查
 * 由于Object类中提供的clone方法只是简单的克隆，并没有克隆对象中引用的其他对象
 * 所以在重写clone方法时，需要在调用父类提供的clone方法之后，再手动克隆对象中可变的实例字段。
 * 如果一个类并没有声明实现Cloneable接口，在调用实例对象从Object类继承来的clone方法时，会抛出CloneNotSupportedException
 *
 * 下面例子中，如果Employee没有重写clone方法，数组employee和数组emps中的员工元素的部门字段将引用同一个对象
 */
public class Demo1 extends Employee {
    public static void main(String[] args) {
        Department d1 = new Department(1001, "后勤部");
        Department d2 = new Department(1002, "营销部");
        Department d3 = new Department(1003, "研发部");

        Employee e1 = new Employee("张三风", 15, d1, "南京");
        Employee e2 = new Employee("李成功", 27, d2, "北京");
        Employee e3 = new Employee("张玉华", 18, d3, "上海");

        try {
            Employee e4 = e1.clone();
            System.out.println(e1);
            System.out.println(e4);

            e1.dept.setName("策划部");

            System.out.println(e1);
            System.out.println(e4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
