// ++ �� -- ��Сϸ��
class Add_Reduce{
	public static void main(String[] args){
		
		//��++���ұ�ʱ a �Ƚ�ֵ����b �ٽ�����������
		int a = 3;
		int b = a++;
		System.out.println("��++���ұ�ʱ a = " + a + "; b = " + b);
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		//��++�����ʱ a �Ƚ����������� �ٽ�ְ���� b
		int c = 3;
		int d = ++c;
		System.out.println("��++���ұ�ʱ c = " + c + "; d = " + d);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// ��--���ұ�ʱ �Ƚ�ֵ���� f �ٽ����Լ����� 
		int e = 3;
		int f = e--;
		System.out.println("��--���ұ�ʱ e = " + e + "; f = " + f);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// ��--������� �Ƚ����Լ����� �ٽ�ֵ���� h
		int g = 3;
		int h = --g;
		System.out.println("��--���ұ�ʱ g = " + g + "; h = " + h);
	}
}