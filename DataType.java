import java.util.*;
/*
ʮ����ת������ ��2ȡ�� �õ�����������

������תʮ����(8421��) �������Ƶ�ÿһ�����ַŵ�8421����
0����û�� 1������ Ȼ���е�8421�����

java�����������������
// 1byte = 8bits
// 1bits = һ��������ռλ
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
���������ɵײ���뷽ʽ��ͬ�õ�������Ҳ��������λ���������ֵ
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
		float��ȡֵ��Χ����long?
		*/
		//float d = b+f;
		long dd = (long)b;
		System.out.println(dd);
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
		
		// �������
		byte bb = 20;
		byte bb2 = 30;
		// byte bb3 = bb2 + bb3; �ᱨ�� int��byte�������ʹ���
		// java�������ݰ�ȫ�Ὣ����ȡֵ��ΧС���������ͽ�����ʽת��
		// �����������
		//  byte short char �����ֶ����������(ȡֵ��ΧС)
		
		// int תstring
		int number1 = 100;
		int number2 = 100;
		String str1 = String.valueOf(number1);
		String str2 = Integer.toString(number1);
		System.out.println(str1);
		System.out.println(str2);
		/*
		ת�������ԭ�ȵ��������Ӱ��
		int number3 = number1 + number2;
		
		���� ���ͼ��ݴ���
		int number3 = number1 + str1;
		*/
		// ת����ͬС��  Integer Float Double Long....
		double num1 = 12.3;
		String str3 = Double.toString(num1);
		
		String str4 = "129";
		int num2 = Integer.parseInt(str4); 
		double num3 = Double.parseDouble(str4);
		
		// ��Ȼ�����ͨ�� ����ʵ��ִ�е�ʱ����׳�ֵ������Χ�쳣
		// Stringת ���λ򸡵�����ʱ��Ӧע��ȡֵ��Χ
		//byte num4 = Byte.parseByte(str4);
		
		
		// java��ÿһ��char(�ַ�)����һ��ʮ�������� ��ASCLL���
		//ǿתchar��int���Ի�ȡ��Ӧ��int ֵ
		// char�ַ� ��Сд��ĸ������0-9����ʼӦ��һ��
		// a-z 97 122 
		//A-Z 65 90
		//0-9 48 57
		char a1 = 'z'; 
		char b2 = 'Z';
		char c3 = '9';
		char d4= '��';
		System.out.println((int)a1);
		System.out.println((int)b2);
		System.out.println((int)c3);
		System.out.println((int)d4);
	}
}

