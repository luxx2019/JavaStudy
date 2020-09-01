package reflection;

import java.lang.reflect.Modifier;

public class ReflectionTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		String packageName = "reflection";
		String className = "Employee";
		Class cl = Class.forName(packageName + "." + className);
		Class supercl = cl.getSuperclass();
		String modifiers = Modifier.toString(cl.getModifiers());
		if (modifiers.length() > 0) {
			System.out.print(modifiers + " ");
		}
		System.out.print("class " + className);
		if (supercl != null && supercl != Object.class) {
			System.out.print(" extends " + supercl.getName() + " {");
		}
		System.out.println(" {");
	}
}