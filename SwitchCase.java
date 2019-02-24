class SwitchCase{
	public static void main(String[] args){
		/*int[] list = {1,2,3,4,5};
		switch(list[0]){
			
			不可用 只能为常量
			case list[0]:
				System.out.print(list[0]);
				break;
			
			case 1:
				System.out.println(list[0]);
				// 当匹配到符合的值后不写break都会执行 直到语句执行完毕或者遇到break 且剩下的无需匹配
			case 2:
				System.out.println("穿透执行");
			case 3:
				System.out.println("停止穿透执行");
				// 停止语句
				break;
			default:
				System.out.print("11");
		}
		*/
		
		int count = 0;
		float zhi = 0.01f;
		double zhumu =8848.48*1000;
		System.out.println("珠峰的mm: " + zhumu);
		while(zhi<zhumu){
			zhi = zhi*2;
			count+=1;
		}
		System.out.println("次数: "+ count);
		
		 
		for (int i = 1; i<= count; i++){
			zhi = zhi/2;
		}
		System.out.println("得出纸原来的厚度:" + zhi);
		
		// do while  
		int i = 1;
		do{
			// 先循环后判断表达式
			System.out.println("i的输出");
		}while(i>3);
		
		int kb = 2;
		do{
			// 循环次数是一致的 只是少了第一次的判断
			System.out.println("kb的输出");
			kb++;
		}while(kb<4);
	}
}


