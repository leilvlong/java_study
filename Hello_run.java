// �򵥱Ƚ�python ��java������Ч��
class Hello_run{
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		int i = 0;
		for (int item=0; item<100001; item++){
			System.out.println(item);
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��:" + (endTime - startTime) + "ms");
		System.out.println("����ʱ��:" + ((endTime - startTime)/1000) + "s");	
	}
}
//����ʱ��:10626ms
//����ʱ��:10s


//import time
//def timesss():
//    a = int(time.time()*1000)
//    b = time.time()
//    for i in range(100001):
//        print(i)
//    s = int(time.time()*1000)
//    y = time.time()
//    print("����ʱ��:%s " %(s-a) + "ms")
//    print("����ʱ��:%s " %(y-b)+"s")

//timesss()  
//����ʱ��:12109 ms
//����ʱ��:12.108925342559814 s                                                                                                 