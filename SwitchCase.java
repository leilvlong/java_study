class SwitchCase{
	public static void main(String[] args){
		/*int[] list = {1,2,3,4,5};
		switch(list[0]){
			
			������ ֻ��Ϊ����
			case list[0]:
				System.out.print(list[0]);
				break;
			
			case 1:
				System.out.println(list[0]);
				// ��ƥ�䵽���ϵ�ֵ��дbreak����ִ�� ֱ�����ִ����ϻ�������break ��ʣ�µ�����ƥ��
			case 2:
				System.out.println("��͸ִ��");
			case 3:
				System.out.println("ֹͣ��͸ִ��");
				// ֹͣ���
				break;
			default:
				System.out.print("11");
		}
		*/
		
		int count = 0;
		float zhi = 0.01f;
		double zhumu =8848.48*1000;
		System.out.println("����mm: " + zhumu);
		while(zhi<zhumu){
			zhi = zhi*2;
			count+=1;
		}
		System.out.println("����: "+ count);
		
		 
		for (int i = 1; i<= count; i++){
			zhi = zhi/2;
		}
		System.out.println("�ó�ֽԭ���ĺ��:" + zhi);
		
		// do while  
		int i = 1;
		do{
			// ��ѭ�����жϱ��ʽ
			System.out.println("i�����");
		}while(i>3);
		
		int kb = 2;
		do{
			// ѭ��������һ�µ� ֻ�����˵�һ�ε��ж�
			System.out.println("kb�����");
			kb++;
		}while(kb<4);
		
		// break �� continue
		for(int item=0; item<30; item++){
			if(item == 10){
				System.out.println("ѭ����ǿ����ֹ,��ʱitem: "+item);
				break;
			}
		}
		
		for(int item=0; item<10; item++){
			if(item == 5){
				System.out.println("ѭ��������,��ʱitem: "+item);
				continue;
			}
			System.out.println(item);
		}
	}
}


