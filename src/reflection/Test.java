package reflection;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception{
		System.out.println("请输入本金：\n");
		Scanner input=new Scanner(System.in);
		double f = input.nextDouble();
		
		System.out.println("本金为：" + f + "\n");
		System.out.println("一年后的本息为：" + (f * 0.0225 + f) + "\n");
		System.out.println("两年后的本息为：" + (f * 0.027 * 2 + f) + "\n");
		System.out.println("三年后的本息为：" + (f * 0.0324 * 3 + f) + "\n");
		System.out.println("五年后的本息为：" + (f * 0.036 * 5 + f) + "\n");
	}
}