public class Hello_while{
	public static void main(String args[]){
		int x =0 ;
		System.out.println("在while循环开始运行前");
		while (x<3){  
			// while里的表达式左闭右开
			System.out.println("while开始运行第" + x +"次");
			x++;
			// 只有当while运行结束时才会执行下面的代码 for循环同理
		}
		System.out.println("while循环运行后");
	}
}