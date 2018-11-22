package aaa;

public class Fu {
public static int num=100;
public static void method() {
	System.out.println(num);
	//错误：静态类容优先于对象存在，只能访问静态，不能使用this/super 
}
}
