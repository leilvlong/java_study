//使用代码段写出程序 执行后输出:
//	a noise
//  annoys
//  an oyster
//每个代码段只能使用一次并且有多余的代码片段
//  x>0, x<1, x>1, x>3, x<4 
//	x=x+1, x=x+2, x=x-2, x=x-1
//  System.out.print("")
//  System.out.print("a ") 
//  System.out.print("n") 
//  System.out.print("an")
//  System.out.print("noys")
//  System.out.print("olse")
//  System.out.print(" oyster")
//  System.out.print("annoys")
//  System.out.print("noise")

// 此处是题目:
//class Hello_poolpuzzleone{
//	public static void main(String args[]){
//		int x = 0;
//		while ( 此处需要代码 ){
//			// 此处需要代码
//			if( x < 1){
//				// 此处需要代码
//			}
//			// 此处需要代码
//			if( 此处需要代码 ){
//				//此处需要代码
//				//此处需要代码
//			}
//			if( x == 1){
//				// 此处需要代码
//			}
//			if( 此处需要代码 ){
//				// 此处需要代码
//			}
//			System.out.println("")
//			// 此处需要代码
//	}
//	}
//}
class Hello_poolpuzzleone{
	public static void main(String args[]){
		int x = 0;
		while(x < 4){
			// 字符串的拼接只有把这句放在这里是最合适的,输出结果也说明了此循环有三次
			// 而且都是以a开头 并且每个代码段只能用一次
			System.out.print("a");
			
			if ( x < 1  ){
			// a noise之间有空格 if表达式 x又得小于1 所以:
				System.out.print(" ");
			}
			System.out.print("n");
			// 那么此时的if表达式为多少合适呢 剩余的还有 x>1 x>3  x>0
			// 总之这里既然只有大于的选择那么先随便试试看 看输出结果
			// 妈的  如果java有类似python的pass就好了
			// 事实上我还是没有做出来  当我看了答案后明白我理解错了 
			// 他说的代码段只能用一次我理解成了题目中出现过得代码也不能用
			// 由此可见沟通与理解的重要性
			if ( x > 1 ){
				System.out.print(" oyster");
				x = x+2;
			}
			if ( x == 1 ){
				System.out.print("noys");
			}
			if ( x < 1 ){
				System.out.print("oise");
			}
			System.out.println("");
			x = x+1;
		}
	}
}