// for循环工作方式
public class Hello_for{
    public static void main( String args[] ){
        String[] li = {"1","2","3","4"};
        for( int item=0; item<li.length; item++){
            String i = li[item];
            System.out.println(item+"-"+i);
        }
    }
}