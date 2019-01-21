// 利用random 模拟生成类似于手机验证码的六位随机数
public class Hello_random{
    public static void main( String args[] ){
        //int i = (int)(Math.random() * 1000000);
        //System.out.print(i);
        int[] li = {0,1,2,3,4,5,6,7,8,9};
        int random_six = 6;
        String random_string = "";
        for( int item=0; item<random_six; item++){
            int index = (int)(Math.random()*li.length);
            random_string += li[index];
        }
        System.out.print(random_string);
    }
}