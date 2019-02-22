// ++ 与 -- 的小细节
class Add_Reduce{
	public static void main(String[] args){
		
		//当++在右边时 a 先将值赋予b 再进行自增操作
		int a = 3;
		int b = a++;
		System.out.println("当++在右边时 a = " + a + "; b = " + b);
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		//当++在左边时 a 先进行自增操作 再将职赋予 b
		int c = 3;
		int d = ++c;
		System.out.println("当++在右边时 c = " + c + "; d = " + d);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// 当--在右边时 先将值赋予 f 再进行自减操作 
		int e = 3;
		int f = e--;
		System.out.println("当--在右边时 e = " + e + "; f = " + f);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// 当--在左边是 先进行自减操作 再将值赋予 h
		int g = 3;
		int h = --g;
		System.out.println("当--在右边时 g = " + g + "; h = " + h);
	}
}