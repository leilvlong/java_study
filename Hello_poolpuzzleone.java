//ʹ�ô����д������ ִ�к����:
//	a noise
//  annoys
//  an oyster
//ÿ�������ֻ��ʹ��һ�β����ж���Ĵ���Ƭ��
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

// �˴�����Ŀ:
//class Hello_poolpuzzleone{
//	public static void main(String args[]){
//		int x = 0;
//		while ( �˴���Ҫ���� ){
//			// �˴���Ҫ����
//			if( x < 1){
//				// �˴���Ҫ����
//			}
//			// �˴���Ҫ����
//			if( �˴���Ҫ���� ){
//				//�˴���Ҫ����
//				//�˴���Ҫ����
//			}
//			if( x == 1){
//				// �˴���Ҫ����
//			}
//			if( �˴���Ҫ���� ){
//				// �˴���Ҫ����
//			}
//			System.out.println("")
//			// �˴���Ҫ����
//	}
//	}
//}
class Hello_poolpuzzleone{
	public static void main(String args[]){
		int x = 0;
		while(x < 4){
			// �ַ�����ƴ��ֻ�а�����������������ʵ�,������Ҳ˵���˴�ѭ��������
			// ���Ҷ�����a��ͷ ����ÿ�������ֻ����һ��
			System.out.print("a");
			
			if ( x < 1  ){
			// a noise֮���пո� if���ʽ x�ֵ�С��1 ����:
				System.out.print(" ");
			}
			System.out.print("n");
			// ��ô��ʱ��if���ʽΪ���ٺ����� ʣ��Ļ��� x>1 x>3  x>0
			// ��֮�����Ȼֻ�д��ڵ�ѡ����ô��������Կ� ��������
			// ���  ���java������python��pass�ͺ���
			// ��ʵ���һ���û��������  ���ҿ��˴𰸺������������� 
			// ��˵�Ĵ����ֻ����һ������������Ŀ�г��ֹ��ô���Ҳ������
			// �ɴ˿ɼ���ͨ��������Ҫ��
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