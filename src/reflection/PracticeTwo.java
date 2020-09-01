package reflection;

public class PracticeTwo {
	public static void main(String[] args) {
		
	}
	
	/*public Object getFieldValue(Object obj, String fieldName, Lookup lookup)
		throws NoSuchFieldException, IllegalAccessException {
		Class<?> cl = obj.getClass();
		Field field = cl.getDeclaredField(fieldName);
		VarHandle handle = MethodHandles.privateLookupIn(cl, lookup).unreflectVatHandle(field);
		return handle.get(obj);
	}*/
}
