package lambda;

/**
 * Lambda表达式可以引用构造方法,引用的形式是 类名 :: new
 * 具体引用类中哪一个构造函数，编译器会自动根据接口中的声明进行匹配
 *
 */
public class Demo3 {
    public static void main(String[] args) {
        // 具体调用哪个构造函数，与接口中的声明有关
        PersonCreater1 pc1 = Person::new;
        PersonCreater2 pc2 = Person::new;

        Person p = pc2.getPerson("张三", 25);
    }
}

class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface PersonCreater1 {
    Person getPerson();
}

interface PersonCreater2 {
    Person getPerson(String name, int age);
}