// 啤酒童谣
public class Hello_beersong{
	public static void main( String args[]){
		int beerNum = 99;
		String beer = "bottles";
		while (beerNum>0){
			if (beerNum==1){
				// 此处不应再是复数
				beer = "bottle";
			}
			System.out.println(beerNum + ": " +beer + "of beer on the wall");
			System.out.println(beerNum + ": " + beer + "of beer");
			System.out.println("take one down");
			System.out.println("pass it around \n");
			beerNum--;
			// 打印剩余的次数 
			if (beerNum > 0){
				System.out.println(beerNum + ": " + beer + "of beer on the wall \n");
			} else{
				System.out.println("no more bottlesof bearone the wall\n");
			}
		}
	}
}

//使用python实现
//beer = "bottles"
//for i in range(99,0,-1):
//	print(i, beer, "of beer on the wall")
//	print(i, beer, "of bear")
//	print("take one down")
//	print("pass it around \n")
//	num = i-1
//	if num > 0:
//		print(num, beer, "of beer on the wall :\n")
//	else:
//		print("no more bottles of bear one the wall ")
	