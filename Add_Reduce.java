// ++ �� -- ��Сϸ��
class Add_Reduce{
	public static void main(String[] args){
		
		//��++���ұ�ʱ a �Ƚ�ֵ����b �ٽ�����������
		int a = 3;
		int b = a++;
		//System.out.println("��++���ұ�ʱ a = " + a + "; b = " + b);
	
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		//��++�����ʱ a �Ƚ����������� �ٽ�ְ���� b
		int c = 3;
		int d = ++c;
		//System.out.println("��++���ұ�ʱ c = " + c + "; d = " + d);
		
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// ��--���ұ�ʱ �Ƚ�ֵ���� f �ٽ����Լ����� 
		int e = 3;
		int f = e--;
		//System.out.println("��--���ұ�ʱ e = " + e + "; f = " + f);
		
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// ��--������� �Ƚ����Լ����� �ٽ�ֵ���� h
		int g = 3;
		int h = --g;
		//System.out.println("��--���ұ�ʱ g = " + g + "; h = " + h);
		
		int j = 3;
		// j4 j4 j5 58
		int k = (++j)+(j++)+(j*10);
		System.out.println(k);
		
		int l = 6;
		//  ++�����������ֵ(����) ++�ұ�������(��ֵ)������ ԭ��ԭ�򲻻�䶯
		int m = (++l)+(++l)+(l*10);
		System.out.println(m);
		
		
		int p = 5;
		// ͬʱ��ѭ�������ȼ�ԭ��
		//  4+4-3+5+24
		int x = (--p) + (p--) -(p++)+  (++p)+(--p*6);
		System.out.println("x:"+x);
		
		int z = 7;
		// �ȳ˳� ��Ӽ� ������������
		// 6 + 6 -5 + 5 * 4 / 4 = 12
		int y = (--z)+(z--)-(z++)+(--z)*(--z)/z;
		System.out.println(y);
		
		int q = 7;
		//     8+ 8*9
		// 6 + 7*7
		// �ð� ���ܴ��������� ++ -- �����㼶������ߵ�
		int w = --q + (++q)*(++q);
		System.out.println(w);
		
		int t = 8;
		// ���ܴ��������� ++ -- �����㼶������ߵ� �ٴ�֤��
		// 7 + 7*6+8*7 = 105
		int u = --t + (t--) * (t++) + ++t* --t ;
		System.out.println("u"+ u);
		
		// �žų˷���
		for(int i = 1; i<10; i++){
			for(int o=1; o<i+1; o++){
				System.out.print(o + " * " + i + " = " + (i*o) + "  ");
			}
			System.out.println();
		}
		
	
	}
}