import java.util.*;
/*
十进制转二进制 除2取余 得到二进制数据

二进制转十进制(8421码) 将二进制的每一个数字放到8421码中
0代表没有 1代表有 然后将有的8421码相加

java中数据类型四类八种
// 1byte = 8bits
// 1bits = 一个二进制占位
整形:
	byte   8bits  
		取值范围 -128 -- 127
	short  16bits
		取值范围 -32768 --32767
	int    32bits  //整形默认的类型
		取值范围 -2147483648 -- 2147483647
	long   64bits
		取值范围 很大
浮点数
	float  32bits  //注意 定义时不带f默认为double
		取值范围 可变(暂时不理解)
	double 64bits
		取值范围 可变(暂时不理解)
	
字符串
	char   16bits
		取值范围 0 -- 65535
布尔值
	boolean true/false
合适的数据类型是对内存优化的第一步

数据类型转换不当会有损失(需要转换时需要强制转换)
需要确保变量能保存所存下的值以防止数据溢出(编译器在这点很严格 毕竟强类型语言)
数据溢出造成底层编码方式不同得到的数据也不会是下位容器的最大值
*/
class DataType{
	public static void main(String[] args){
		/*
		byte a = 3;
		char b = (char)a;
		System.out.println(b);
		*/
		/*
		char a = 3;
		byte b = (byte)a;
		System.out.println(b);
		*/
		// byte 与char令我很疑惑
		
		DataType t = new DataType();
		
		int a = 20;
		float b = 23.4f;
		long c = 1902;
		double f = 89.672;
		/*
		int d = a+ b; 报类型兼容错误
		float d = a+ b; 编译通过
		由此得知 int + float = float
		*/
		/*
		int d = a + c; 报类型兼容错误
		long d = a+ c; 编译通过
		由此得知 int + long = long
		*/
		/*
		long d = b+c; 报类型兼容错误
		float d = b+ c; 编译通过
		由此得知 long + float = float
		float的取值范围大于long?
		*/
		//float d = b+f;
		long dd = (long)b;
		System.out.println(dd);
		/*
		float d = b+f 报类型兼容错误
		double d = b +f 编译通过
		由此得知 float + double = double 
		*/
		/*
		总结:
			整形与浮点型做运算时 会自动转为浮点型
			整形与整形计算时 计算结果会获得更高bits一方的类型
			浮点型与浮点型计算时 计算结果会获得更高bits一方的类型
			从 "需要确保变量能保存所存下的值以防止数据溢出" 这句话应该就能推算出结果
			数据的运算原则是优先确保精度
		*/
		
		
		//我需要一个判断数据类型的方法 这样太傻
		
		// 特殊情况
		byte bb = 20;
		byte bb2 = 30;
		// byte bb3 = bb2 + bb3; 会报错 int与byte兼容类型错误
		// java出于数据安全会将这种取值范围小的数据类型进行隐式转换
		// 避免数据溢出
		//  byte short char 这三种都是特殊情况(取值范围小)
		
		// int 转string
		int number1 = 100;
		int number2 = 100;
		String str1 = String.valueOf(number1);
		String str2 = Integer.toString(number1);
		System.out.println(str1);
		System.out.println(str2);
		/*
		转换不会对原先的数据造成影响
		int number3 = number1 + number2;
		
		报错 类型兼容错误
		int number3 = number1 + str1;
		*/
		// 转换大同小异  Integer Float Double Long....
		double num1 = 12.3;
		String str3 = Double.toString(num1);
		
		String str4 = "129";
		int num2 = Integer.parseInt(str4); 
		double num3 = Double.parseDouble(str4);
		
		// 虽然编译会通过 但是实际执行的时候回抛出值超出范围异常
		// String转 整形或浮点数的时候应注意取值范围
		//byte num4 = Byte.parseByte(str4);
		
		
		// java中每一个char(字符)都有一个十进制数字 对ASCLL码表
		//强转char到int可以获取对应的int 值
		// char字符 大小写字母和数字0-9的起始应记一下
		// a-z 97 122 
		//A-Z 65 90
		//0-9 48 57
		char a1 = 'z'; 
		char b2 = 'Z';
		char c3 = '9';
		char d4= '张';
		System.out.println((int)a1);
		System.out.println((int)b2);
		System.out.println((int)c3);
		System.out.println((int)d4);
	}
}

