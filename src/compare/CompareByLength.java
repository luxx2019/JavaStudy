package compare;

/**
 * Comparator是比较器接口，接口中只有一个需要实现的方法compare
 * Arrays.sort方法可以给数组排序，同时可以传入一个比较器，以指定的方法排序
 * 这个程序可以用Lambda表达式改写
 */

import java.util.Arrays;
import java.util.Comparator;

public class CompareByLength {
	public static void main(String[] args) {
		String[] str = {"hello", "world", "i", "love", "apple", "foreign"};
		lengthComparator lc = new lengthComparator();
		Arrays.sort(str, lc);
		System.out.println(Arrays.toString(str));
	}
}

class lengthComparator implements Comparator<String> {
	public int compare(String first, String second) {
		return first.length() - second.length();
	}
}