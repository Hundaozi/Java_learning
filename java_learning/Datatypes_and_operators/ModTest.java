/**
 * Description:
 * 网站：https://gitee.com/zzti_cs_16_java_group/liyonghua
 * Program Name: Java_learning
 * Data:2018/9/10
 * @author Yonghua Lee 449086240@qq.com
 * @vsrsion 1.0
 */
public class ModTest {
    public static void main(String[] args){
        double a=5.2;
        double b=3.1;
        double mod=a%b;
        System.out.println(mod);//值为2.1
        System.out.println("5对0.0求余的结果是："+5%0.0);//输出非数：NaN
        System.out.println("-5对0.0求余的结果是："+-5%0.0);//输出非数：NaN
        System.out.println("0对5.0求余的结果是："+0%5.0);//输出非数：0.0
        System.out.println("0对0.0求余的结果是："+0%0.0);//输出非数：NaN

        //下面代码将出现异常:Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("-5对0求余的结果是："+ -5%0);

    }
}
