// ����֪���뷶Χ�����1000�ڵ�ˮ�ɻ���
// ˮ�ɻ�����ָһ�� 3 λ��������ÿ��λ�ϵ����ֵ� 3����֮�͵���������

class Narcissistic_number{
	public static void main(String [] args){
		int num = 1000;
		float num2 = 987.00f;
		
		System.out.print(num2/10);
		for (int item=100; item<=num; item ++){
			// ȡ��λ
			int a = item%10;
			//ȡʮλ
			int b = (item/10)%10;
			// ȡ��λ
			int c = (item/100)%10;
			
			// System.out.println(a+" "+b+" "+c);
			
			// ȡ int����
			int d = String.valueOf(item).length();
			// ���� ��Ҫʹ��Math.pow(����,��)
			if(item == (int)Math.pow(a,d) + (int)Math.pow(b,d) + (int)Math.pow(c,d)){
				System.out.println("���ˮ�ɻ���:" + item);
			}
		}
	}
}


//�����������python��Щ��ͬ java�� / ����ֱ��ȡ�� ��python��Ҫ//
//���� java�ڽ���������ֵ������±���ʱҲҪ��������(java����������Ҫ���������ʲô���ͱ���)
// pythonʵ��1000��ˮ�ɻ���
// python�������� a**b
//def narcissistic(num):
//    for i in range(100,num+1):
//        # ȡ��λ
//        a = i % 10
//        b = (i//10) % 10
//        c = (i//100) % 10
//        i_len = len(str(i))
//        if i == a**i_len + b**i_len + c**i_len:
//            print(i)
//
//
//narcissistic(1000)