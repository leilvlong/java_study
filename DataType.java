import java.util.*;
/*
十进制转二进制 除2取余 得到二进制数据

二进制转十进制(8421码) 将二进制的每一个数字放到8421码中
0代表没有 1代表有 然后将有的8421码相加

java中数据类型四类八种
// 1byte = 8bits
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
		*/
		//float d = b+f;
		double e = b+f;
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
	}
}

