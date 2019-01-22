// 简单比较python 与java的运行效率
class Hello_run{
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		int i = 0;
		for (int item=0; item<100001; item++){
			System.out.println(item);
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println("运行时间:" + (endTime - startTime) + "ms");
		System.out.println("运行时间:" + ((endTime - startTime)/1000) + "s");	
	}
}
//运行时间:10626ms
//运行时间:10s


//import time
//def timesss():
//    a = int(time.time()*1000)
//    b = time.time()
//    for i in range(100001):
//        print(i)
//    s = int(time.time()*1000)
//    y = time.time()
//    print("运行时间:%s " %(s-a) + "ms")
//    print("运行时间:%s " %(y-b)+"s")

//timesss()  
//运行时间:12109 ms
//运行时间:12.108925342559814 s                                                                                                 