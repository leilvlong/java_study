//  ���ҵ��Ĵ������������� a-b c-d
//  if(x==1){ System.out.print("d"); x=x-1; }
//  if(x==2){ System.out.print("b c"); }
//  class Hello_shufflel{ public static void main( String args[]){ 
//  if (x>2) { System.out.print("a");}
//  int x=3;
//  x=x-1; System.out.print("-");
//  while(x>0) {
//  ϣ����һ��ɹ����ұ��벻Ҫ����

class Hello_shufflel{
    public static void main( String argsp[] ){
        int x=3;
        while ( x>0 ){
        // �������Ҫ�� ��һ�����A  ��x��ֵΪ3����2 so:
            if ( x>2 ){
                System.out.print("a");
            }
       // �������Ҫ�� ���ab֮��Ҫ��"-"���� so��
            x = x-1;
            System.out.print("-");
      //  ��x -�� ������ж�ʽ ������� ��ʱ�Ľ��Ӧ�� a-b c
            if ( x==2 ){
                System.out.print("b c");
            }
      // ����Ķ����ź�λ���� ���û��ѡ��ֻ�ܷ������ 
            if ( x==1 ){
                System.out.print("d ����");
                x=x-1;
            }
       // ����벻��  
      
        }
    }
}