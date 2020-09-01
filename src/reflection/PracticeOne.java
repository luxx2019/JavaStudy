package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PracticeOne {

	/**
	 * @author lxx
	 * @throws Exception
	 * @throws SecurityException
	 * @introduce 获得对象中指定字段的内容
	 */
	public static void main(String[] args) throws SecurityException, Exception {
		Employee harry = new Employee("Harry", 22, "南京栖霞区");
		Class cl = harry.getClass();
		Class cl2 = harry.getClass();
		Field f = cl.getDeclaredField("name");
		Field f2 = cl2.getDeclaredField("name");
		
		f.setAccessible(true);
		
		harry.name = "a";
		
		System.out.println(Modifier.toString(f.getModifiers()));
		System.out.println(Modifier.toString(f2.getModifiers()));
		System.out.println(f.getType().getName());
		/*
		 * 获取字段类型有两个方法 
		 * Type getGenericType()
		 * Class<?> getType()
		 */
		System.out.println(f.getName());
		System.out.println(f.get(harry));
	}
}
