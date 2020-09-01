package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PracticeThree {
	
	public static void main(String[] args) {
		final int[] a = {1, 2, 3};
		a[0] = 100;
		System.out.println(a[0]);
	}
}

