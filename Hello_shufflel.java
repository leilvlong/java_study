//  将乱掉的代码排序并组合输出 a-b c-d
//  if(x==1){ System.out.print("d"); x=x-1; }
//  if(x==2){ System.out.print("b c"); }
//  class Hello_shufflel{ public static void main( String args[]){ 
//  if (x>2) { System.out.print("a");}
//  int x=3;
//  x=x-1; System.out.print("-");
//  while(x>0) {
//  希望能一遍成功并且编译不要报错：

class Hello_shufflel{
    public static void main( String argsp[] ){
        int x=3;
        while ( x>0 ){
        // 根据输出要求 第一个输出A  而x的值为3大于2 so:
            if ( x>2 ){
                System.out.print("a");
            }
       // 根据输出要求 输出ab之间要以"-"连接 so：
            x = x-1;
            System.out.print("-");
      //  当x -后 进入此判断式 得以输出 此时的结果应是 a-b c
            if ( x==2 ){
                System.out.print("b c");
            }
      // 上面的都安排好位置了 你就没得选了只能放这儿了 
            if ( x==1 ){
                System.out.print("d 哈哈");
                x=x-1;
            }
       // 求编译不挂  
      
        }
    }
}