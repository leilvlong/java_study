class Hello_link{
	public static void main(String args[]){
		int x = 0;
		int y = 0;
		while (x < 5){
			//
			//
			System.out.println(x + "" + y + "");
			x++;
		}
		System.out.println("while循环结束后 y的值为: " + y);
	}
}

// 说出以下代码段放入循环注释的空白行中执行打印出来的执行结果
// y = x -y;  我本以为:00 11 22 33 44 结果是 00 11 21 32 42
// 实际运行逻辑:第一次 x0 y0 y0 00
//			    第二次 x1 y0 y1 11
//			    第三次 x2 y1 y1 21
//			    第四次 x3 y1 y2 32
//			    第五次 x4 y2 y2 42 
//				y会在循环中保留上次计算的结果 且在循环结束后也会保留循环语句中的计算结果
//				而当我试图在while循环语句中定义变量并且在循环语句结束后在循环语句外打印时抛出异常:	错误: 找不到符号		
//while循环和for循环在运行时应该是有自己的内存空间的,我在网上的博客上看到的关于for与while的比较:
//	 在用while来做循环时，需要用到变量进行循环控制时,往往会定义一个成员变量，如上面的x,它的值会存在堆内存里，
//	 会随着类的存在而一直存在，即使循环结束了，也不会自动释放，只有当类结束了才会消失，换言之，即会占用内存
//	 而用for循环时，若需用到变量进行循环控制时，往往会定义一个局部变量 如:  for (int item=0; item<5; item++)
//	 其中的item属于局部变量，定义的值存放在栈内存里，当循环结束后，它会自动释放item的值，即不会继续占用空间

// y = x + y 执行结果: 00 11 23 36 410
// y每次循环的值为 0 1 3 6 10
// 第一次:x0 y0 y0 00 第二次:x1 y0 y1 11  第三次:x2 yi y3 23 第四次:x3 y3 y6 36 第五次:x4 y6 y10 410

// y = y+ 2;
// if (y>4){
//     y = y-1;		
// }
// 执行结果:02 14 25 36 47
// 第一次:x0 y0 y2 02 第二次:x1 y2 y4 14 第三次:x2 y4 y5 25 第四次:x3 y4 y5 36 第五次:x4 y5 y6 47

// x =x+1; 2 4
// y =y+x:
// 执行结果:11 34 59
// 第一次:x1 y1 11 第二次:x3 y4 34 第三次:x5 y9 59
// 这一次的坑在 x还会在下面再自增一次

// if (y < 5){
//     x = x+1;
//	   if (y <3){
//	       x = x -1;  	   
//	   }
// }
// y = y+2
// 执行结果: 02 14 36 48
// 第一次:x0 x1 x0 y2 02 第二次:x1 x2 x1 y4 14 第三次:x2 x3 y6 36 第四次 x4 y8 48
//
//
//
//
//
//
//
//
//
