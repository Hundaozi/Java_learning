/**
 * Description:
 * 网站：https://gitee.com/zzti_cs_16_java_group/liyonghua
 * Program Name: Java_learning
 * Data: 2018/9/10
 * @author Yonghua Lee 449086240@qq.com
 * @vsrsion 1.0
 */public class EnhanceAssignTest {
     public static void main(String[] args){
         byte a=5;
        //下面的语句出错，因为5默认是int类型，a+5就是int类型
         //把int类型赋值给byte类型的变量，所以出错
         //a=a+5;
         //
         byte b =5;
         //下面的语句不会出错
         b += 5;
         System.out.println(b);
     }
}
