import java.util.*;
/*
ʮ����ת������ ��2ȡ�� �õ�����������

������תʮ����(8421��) �������Ƶ�ÿһ�����ַŵ�8421����
0����û�� 1������ Ȼ���е�8421�����

java�����������������
// 1byte = 8bits
����:
	byte   8bits  
		ȡֵ��Χ -128 -- 127
	short  16bits
		ȡֵ��Χ -32768 --32767
	int    32bits  //����Ĭ�ϵ�����
		ȡֵ��Χ -2147483648 -- 2147483647
	long   64bits
		ȡֵ��Χ �ܴ�
������
	float  32bits  //ע�� ����ʱ����fĬ��Ϊdouble
		ȡֵ��Χ �ɱ�(��ʱ�����)
	double 64bits
		ȡֵ��Χ �ɱ�(��ʱ�����)
	
�ַ���
	char   16bits
		ȡֵ��Χ 0 -- 65535
����ֵ
	boolean true/false
���ʵ����������Ƕ��ڴ��Ż��ĵ�һ��

��������ת������������ʧ(��Ҫת��ʱ��Ҫǿ��ת��)
��Ҫȷ�������ܱ��������µ�ֵ�Է�ֹ�������(�������������ϸ� �Ͼ�ǿ��������)

*/
class DataType{
	public static void main(String[] args){
		/*
		byte a = 3;
		char b = (char)a;
		System.out.println(b);
		*/
		/*
		char a = 3;
		byte b = (byte)a;
		System.out.println(b);
		*/
		// byte ��char���Һ��ɻ�
		
		DataType t = new DataType();
		
		int a = 20;
		float b = 23.4f;
		long c = 1902;
		double f = 89.672;
		/*
		int d = a+ b; �����ͼ��ݴ���
		float d = a+ b; ����ͨ��
		�ɴ˵�֪ int + float = float
		*/
		/*
		int d = a + c; �����ͼ��ݴ���
		long d = a+ c; ����ͨ��
		�ɴ˵�֪ int + long = long
		*/
		/*
		long d = b+c; �����ͼ��ݴ���
		float d = b+ c; ����ͨ��
		�ɴ˵�֪ long + float = float
		*/
		//float d = b+f;
		double e = b+f;
		/*
		float d = b+f �����ͼ��ݴ���
		double d = b +f ����ͨ��
		�ɴ˵�֪ float + double = double 
		*/
		/*
		�ܽ�:
			�����븡����������ʱ ���Զ�תΪ������
			���������μ���ʱ ���������ø���bitsһ��������
			�������븡���ͼ���ʱ ���������ø���bitsһ��������
			�� "��Ҫȷ�������ܱ��������µ�ֵ�Է�ֹ�������" ��仰Ӧ�þ�����������
			���ݵ�����ԭ��������ȷ������
		*/
		
		
		//����Ҫһ���ж��������͵ķ��� ����̫ɵ
	}
}

