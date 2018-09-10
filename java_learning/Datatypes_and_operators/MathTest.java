/**
 * Description:
 * 网站：https://gitee.com/zzti_cs_16_java_group/liyonghua
 * Program Name: Java_learning
 * Data: 2018/9/10
 * @author Yonghua Lee 449086240@qq.com
 * @vsrsion 1.0
 */public class MathTest {
     public static void main(String[] args){
         double a =3.2;//定义变量a为3.2
         double b=Math.pow(a,5);//求a的5次方
         System.out.println(b);

         double c=Math.sqrt(a);//求平方根
         System.out.println(c);

         //计算随机数，返回一个0至1之间的伪随机数

         double d =Math.random();
         System.out.println(d);
         //求1.57的sin函数值：1.57被当成弧度数
         double e=Math.sin(1.57);
         System.out.println(e);//输出接近1
     }
}
