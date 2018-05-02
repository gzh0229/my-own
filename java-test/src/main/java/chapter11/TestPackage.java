//在 Java中定义包名时通常使用项目的 Internet域名的反序，由于 Internet域名是唯一的，所以包名就不会发生冲突
//在类中指定包名，必须将 package表达式放在程序的第一行，它必须是文件中的第一行非注释代码
package chapter11;

//指定 java.util包中的所有类在此类中都可以使用；
//当用 import导入了一个包中的所有类时，并不会导入这个包的子包中的类，如果要用子包中的类，需要再次对子包进行引用；
import java.util.*;

//导入静态成员变量
import static java.lang.Math.max;
//导入静态方法
import static java.lang.System.out;

public class TestPackage {

	public void test01() {
		Date date = new Date();
	}

}
