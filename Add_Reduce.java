// ++ 与 -- 的小细节
class Add_Reduce{
	public static void main(String[] args){
		
		//当++在右边时 a 先将值赋予b 再进行自增操作
		int a = 3;
		int b = a++;
		//System.out.println("当++在右边时 a = " + a + "; b = " + b);
	
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		//当++在左边时 a 先进行自增操作 再将职赋予 b
		int c = 3;
		int d = ++c;
		//System.out.println("当++在右边时 c = " + c + "; d = " + d);
		
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// 当--在右边时 先将值赋予 f 再进行自减操作 
		int e = 3;
		int f = e--;
		//System.out.println("当--在右边时 e = " + e + "; f = " + f);
		
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// 当--在左边是 先进行自减操作 再将值赋予 h
		int g = 3;
		int h = --g;
		//System.out.println("当--在右边时 g = " + g + "; h = " + h);
		
		int j = 3;
		// j4 j4 j5 58
		int k = (++j)+(j++)+(j*10);
		System.out.println(k);
		
		int l = 6;
		//  ++左边先自增后赋值(运算) ++右边先运算(赋值)后自增 原则原则不会变动
		int m = (++l)+(++l)+(l*10);
		System.out.println(m);
		
		
		int p = 5;
		// 同时遵循运算优先级原则
		//  4+4-3+5+24
		int x = (--p) + (p--) -(p++)+  (++p)+(--p*6);
		System.out.println("x:"+x);
		
		int z = 7;
		// 先乘除 后加减 有括号算括号
		// 6 + 6 -5 + 5 * 4 / 4 = 12
		int y = (--z)+(z--)-(z++)+(--z)*(--z)/z;
		System.out.println(y);
		
		int q = 7;
		//     8+ 8*9
		// 6 + 7*7
		// 好吧 不管带不带括号 ++ -- 的运算级别是最高的
		int w = --q + (++q)*(++q);
		System.out.println(w);
		
		int t = 8;
		// 不管带不带括号 ++ -- 的运算级别是最高的 再次证明
		// 7 + 7*6+8*7 = 105
		int u = --t + (t--) * (t++) + ++t* --t ;
		System.out.println("u"+ u);
		
		// 九九乘法表
		for(int i = 1; i<10; i++){
			for(int o=1; o<i+1; o++){
				System.out.print(o + " * " + i + " = " + (i*o) + "  ");
			}
			System.out.println();
		}
		
	
	}
}