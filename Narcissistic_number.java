// 在已知代码范围内求出1000内的水仙花数
// 水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身

class Narcissistic_number{
	public static void main(String [] args){
		int num = 1000;
		float num2 = 987.00f;
		
		System.out.print(num2/10);
		for (int item=100; item<=num; item ++){
			// 取个位
			int a = item%10;
			//取十位
			int b = (item/10)%10;
			// 取百位
			int c = (item/100)%10;
			
			// System.out.println(a+" "+b+" "+c);
			
			// 取 int长度
			int d = String.valueOf(item).length();
			// 求幂 需要使用Math.pow(参数,幂)
			if(item == (int)Math.pow(a,d) + (int)Math.pow(b,d) + (int)Math.pow(c,d)){
				System.out.println("求出水仙花数:" + item);
			}
		}
	}
}


//在运算符上与python有些许不同 java的 / 可以直接取整 而python需要//
//此外 java在将运算过后的值赋予给新变量时也要声明类型(java声明变量需要声明这个是什么类型变量)
// python实现1000内水仙花数
// python的幂运算 a**b
//def narcissistic(num):
//    for i in range(100,num+1):
//        # 取个位
//        a = i % 10
//        b = (i//10) % 10
//        c = (i//100) % 10
//        i_len = len(str(i))
//        if i == a**i_len + b**i_len + c**i_len:
//            print(i)
//
//
//narcissistic(1000)