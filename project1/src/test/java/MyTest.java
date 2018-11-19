import java.io.File;
import java.util.Arrays;

public class MyTest {
	public static void main(String[] args) {
		String s = "好好学习，天天向上。";
		byte[] chars = s.getBytes();
		System.out.println("字符串长度:"+s.length());
		System.out.println(Arrays.toString(chars));
		System.out.println("Byte流长度:"+chars.length);

		File file = new File("C:\\Users\\laeni.cn\\Desktop\\test.text");

	}
}
