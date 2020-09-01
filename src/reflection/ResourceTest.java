/**
 * 利用反射，获得类同路径文件的URL
 * 将URL转换成File并读取
 */
package reflection;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;


public class ResourceTest {
	public static void main(String[] args) throws Exception {
		/*Class cl = ResourceTest.class;
		URL lsb = cl.getResource("lzzsb.txt");
		
		File f = new File(lsb.toURI());
		// 将File对象转换成URL对象可以写成：URL url = file.toURL();
		
		InputStream stream = new FileInputStream(f);
		byte[] b = new byte[100];
		stream.read(b);
		String s = new String(b);
		System.out.println(s);*/
		Class cl = ResourceTest.class;
		InputStream stream = cl.getResourceAsStream("lzzsb.txt");
		byte[] b = new byte[100];
		stream.read(b);
		String s = new String(b);
		System.out.println(s);
	}
}
